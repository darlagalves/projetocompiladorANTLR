package compiladores;

public enum Tipo {
    INTEGER("Integer"),
    FLOAT("Float"),
    INDEFINIDO("Indefinido");

    private String descricao;
	
	private Tipo(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	} 
}
