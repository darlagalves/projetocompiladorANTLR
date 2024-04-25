package compiladores;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Main {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Modo de usar: java -jar NomePrograma NomeArquivoCodigo");
            return;
        }
        
        try {
            String inputFile = args[0];
            InputStream is = new FileInputStream(inputFile);
            CharStream input = CharStreams.fromStream(is);
            PascalSimplificadoLexer lexer = new PascalSimplificadoLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            PascalSimplificadoParser parser = new PascalSimplificadoParser(tokens);
            ParseTree tree = parser.programa();
            // System.out.println(tree.toStringTree(parser));

            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(new AssemblyPascalSimplificadoListener(), tree);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}