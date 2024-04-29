package compiladores;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import compiladores.PascalSimplificadoParser.ComandoContext;


public class AssemblyPascalSimplificadoListener extends PascalSimplificadoBaseListener {

    private TabelaSimbolos tabela = new TabelaSimbolos();
    private String rotulo = "";
    private int contRotulo = 1;
    private int offsetVariavel = 0;
    private String nomeArquivoSaida;
    private String caminhoArquivoSaida;
    private BufferedWriter bw;
    private FileWriter fw;
    private static final int TAMANHO_INTEIRO = 4;
    private List<String> variaveis = new ArrayList<>();
    private List<String> sectionData = new ArrayList<>();

    public AssemblyPascalSimplificadoListener() {
        super();
        nomeArquivoSaida = "queronemver.asm";
        caminhoArquivoSaida = Paths.get(nomeArquivoSaida).toAbsolutePath().toString();
        bw = null;
        fw = null;
        try {
            fw = new FileWriter(caminhoArquivoSaida, Charset.forName("UTF-8"));
            bw = new BufferedWriter(fw);
        } catch (Exception e) {
            System.err.println("Erro ao criar arquivo de saída");
        }
    }

    private void escreverCodigo(String instrucoes) {
		try {
			if (rotulo.isEmpty()) {
				bw.write(instrucoes + "\n");
			} else {
				bw.write(rotulo + ": " +  instrucoes + "\n");
				rotulo = "";
			}
		} catch (IOException e) {
			System.err.println("Erro escrevendo no arquivo de saída");
		}
	}

    //funcao para criar um rotulo
    private String criarRotulo(String texto) {
		String retorno = "rotulo" + texto + contRotulo;
		contRotulo++;
		return retorno;
	}


    public void enterPrograma(PascalSimplificadoParser.ProgramaContext ctx) {
        TabSimRec registro  = tabela.add(ctx.IDENTIFICADOR().getText());
        offsetVariavel = 0;
        registro.setCategoria(Categoria.PROGRAMAPRINCIPAL);
        escreverCodigo("global main");
        escreverCodigo("extern printf");
        escreverCodigo("extern scanf\n");
        escreverCodigo("section .text ");
        rotulo = "main";
        escreverCodigo("\t; Entrada do programa");
        escreverCodigo("\tpush ebp");
        escreverCodigo("\tmov ebp, esp");
        System.out.println(tabela);

    }

    // {A45}
    // Gerar a seção de dados (section .data).
    // Gerar instrução para alocar espaço para o display, cujo rótulo é display. O
    // espaço a ser alocado
    // é dado pela quantidade de níveis, descobertos durante a análise, somado com o
    // tamanho ocupado
    // por um inteiro. Isto é, alocar nivel * SIZEOF_INT bytes.
    public void exitPrograma(PascalSimplificadoParser.ProgramaContext ctx) {
        escreverCodigo("\tleave");
        escreverCodigo("\tret");
        if (!sectionData.isEmpty()) {
            escreverCodigo("\nsection .data\n");
            for (String mensagem : sectionData) {
                escreverCodigo(mensagem);
            }
        }
        try {
            bw.close();
            fw.close();
        } catch (IOException e) {
            System.err.println("Erro ao fechar arquivo de saída");
        }
    }

    //A03
    public void enterVariaveis(PascalSimplificadoParser.VariaveisContext ctx){
        String variavel = ctx.IDENTIFICADOR().getText();
        if(tabela.isPresent(variavel)){
            System.out.println("Variável " + variavel + " já foi declarada anteriormente");
            System.exit(-1);
        } else{
            tabela.add(variavel);
            tabela.get(variavel).setCategoria(Categoria.VARIAVEL);
            tabela.get(variavel).setOffset(offsetVariavel);
            offsetVariavel += TAMANHO_INTEIRO;
            variaveis.add(variavel);
        }
        System.out.println(tabela);
    }

    //A02
    public void exitDvar(PascalSimplificadoParser.DvarContext ctx){
        int tamanho = 0;
        for (String var : variaveis){
            tabela.get(var).setTipo(Tipo.INTEGER);
            tamanho += TAMANHO_INTEIRO;
        }
        escreverCodigo("\tsub esp, " + tamanho );
        variaveis.clear();
    }

    //<var_read> ::= id {A08} <mais_var_read>
    // {A08}
    // Verificar se o identificador está na tabela de símbolos corrente ou em outras tabelas ligada pelo
    // campo tabelaPai (esta operação é recursiva e deve vasculhar todas as tabelas de símbolos, 
    // desde de o procedimento corrente até a do programa principal, ou seja, até tabelaPai ser null).
    // Caso não esteja, emitir uma mensagem apropriada dizendo que o mesmo ainda não foi declarado.
    // Caso contrário, executar as seguir operações:
    // ▪ Verificar se a sua categoria é variável ou parâmetro. Se não for, emitir um erro apropriado,
    // indicando que o identificador não é uma variável.
    // ▪ Caso contrário, gerar instrução de leitura de um inteiro do teclado, armazenando o resultado 
    // digitado no endereço de memória de id. Lembre-se, o endereço de memória é calculado em função da 
    // base da pilha (EBP) e do deslocamento contido em display.
    // ▪ O exemplo a seguir ilustra a tradução de read(x), considerando que x tenha offset –4 e se econtra no nível corrente:
    // <demais comandos>
    // mov edx, ebp
    // lea eax, [edx - 4]
    // push eax
    // push @Integer
    // call scanf
    // add esp, 8
    // <demais comandos>
    // section .data
    // _@Integer: db '%d',0
    public void exitVar_read(PascalSimplificadoParser.Var_readContext ctx) {
        String variavel = ctx.IDENTIFICADOR().getText();
        if (!tabela.isPresent(variavel)) {
            System.err.println("Variável " + variavel + " não foi declarada");
            System.exit(-1);
        } else {
            TabSimRec registro = tabela.get(variavel);
            if (registro.getCategoria() != Categoria.VARIAVEL) {
                System.err.println("Identificador " + variavel + " não é uma variável");
                System.exit(-1);
            } else {
                escreverCodigo("\tmov edx, ebp");
                escreverCodigo("\tlea eax, [edx - " + registro.getOffset() + "]");
                escreverCodigo("\tpush eax");
                escreverCodigo("\tpush @Integer");
                escreverCodigo("\tcall scanf");
                escreverCodigo("\tadd esp, 8");
            }
        }
    }

    // <exp_write> ::= id {A09} <mais_exp_write> |
    // string {A59} <mais_exp_write> |
    // intnum {A43} <mais_exp_write>
    // {A09}
    // Verificar se o identificador está na tabela de símbolos corrente ou em outras
    // tabelas ligada pelo
    // campo tabelaPai (esta operação é recursiva e deve vasculhar todas as tabelas
    // de símbolos, desde
    // de o procedimento corrente até a do programa principal, ou seja, até
    // tabelaPai ser null).
    // Caso não esteja, emitir uma mensagem apropriada dizendo que o mesmo ainda não
    // foi declarado.
    // Caso contrário, executar as seguintes operações:
    // ▪ Verificar se a sua categoria é variável ou parâmetro. Se não for, emitir um
    // erro apropriado,
    // indicando que o identificador não é uma variável.
    // ▪ Caso contrário, gerar a instrução para impressão do conteúdo armazenado no
    // endereço de memória
    // de id. Lembre-se, o endereço de memória é calculado em função da base da
    // pilha (EBP) e do
    // deslocamento contido em display.
    public void exitExp_write(PascalSimplificadoParser.Exp_writeContext ctx) {
        if(ctx.IDENTIFICADOR() != null){
            String variavel = ctx.IDENTIFICADOR().getText();
            if (!tabela.isPresent(variavel)) {
                System.err.println("Variável " + variavel + " não foi declarada");
                System.exit(-1);
            } else {
                TabSimRec registro = tabela.get(variavel);
                if (registro.getCategoria() != Categoria.VARIAVEL) {
                    System.err.println("Identificador " + variavel + " não é uma variável");
                    System.exit(-1);
                } else {
                    escreverCodigo("\tpush dword[ebp - " + registro.getOffset() + "]");
                    escreverCodigo("\tpush @Integer");
                    escreverCodigo("\tcall printf");
                    escreverCodigo("\tadd esp, 8");
                    if (!sectionData.contains("@Integer: db '%d',0")) {
                        sectionData.add("@Integer: db '%d',0");
                    }
                }
            }
        } else if (ctx.STRING_LITERAL() != null){
            //A59
            String string = ctx.STRING_LITERAL().getText();
            String rotulo = criarRotulo("String");
            sectionData.add(rotulo + ": db " + string + ", 0 ");
            escreverCodigo("\tpush " + rotulo);
            escreverCodigo("\tcall printf");
            escreverCodigo("\tadd esp, 4");

        } else if (ctx.INTEIRO() != null){
            //A43
            int numero = Integer.parseInt(ctx.INTEIRO().getText());
            escreverCodigo("\tpush " + numero);
            escreverCodigo("\tpush @Integer");
            escreverCodigo("\tcall printf");
            escreverCodigo("\tadd esp, 8");
            if (!sectionData.contains("@Integer: db '%d',0")) {
                sectionData.add("@Integer: db '%d',0");
            }
        } 
        
    }

    public void exitComando(PascalSimplificadoParser.ComandoContext ctx) {  
        if(ctx.WRITELN() != null){
            //writeln (<exp_write>)
            //A61
            // Gerar um avanço de linha, ou seja, um line feed
            //rotuloString2: db

            String novaLinha = "rotuloStringLN: db '', 10, 0";
            if(!sectionData.contains(novaLinha)){
                sectionData.add(novaLinha);
            }
            escreverCodigo("\tpush rotuloStringLN");
            escreverCodigo("\tcall printf");
            escreverCodigo("\tadd esp, 4");
        }

    }


    
}
