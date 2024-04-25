package compiladores;


public enum Categoria {
	FUNCAO("Função"),  
    PROCEDIMENTO("Procedimento"),
	VARIAVEL("Variável"),   //  <==
	PARAMETRO("Parâmetro"),
	TIPO("Tipo"),
	INDEFINIDA("Indefinida"),
    PROGRAMAPRINCIPAL("Programa Principal");  //  <==
	
	private String descricao;
	
	private Categoria(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
}