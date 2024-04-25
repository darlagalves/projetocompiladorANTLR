//TabSimRec.java
package compiladores;

public class TabSimRec {

	private String lexema;
	private Categoria categoria = Categoria.INDEFINIDA;
	private int offset;
	private Tipo tipo = Tipo.INDEFINIDO;

	
	
	public String getLexema() {
		return lexema;
	}

	public void setLexema(String lexema) {
		this.lexema = lexema;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "TabSimRec [lexema=" + lexema + ", categoria=" + categoria.getDescricao() + ", offset=" + offset + ", tipo=" + tipo
				+ "]";
	}

	

	

}

