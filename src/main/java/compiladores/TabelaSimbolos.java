package compiladores;
import java.util.HashMap;

public class TabelaSimbolos {
	
	private HashMap<String, TabSimRec> simbolos = new HashMap<String, TabSimRec>();
	
	public boolean isPresent(String lexema) {
		return simbolos.containsKey(lexema);
	}
	
	public TabSimRec add(String lexema) {
		if (simbolos.containsKey(lexema)) {
			return simbolos.get(lexema);
		}
		TabSimRec novo = new TabSimRec();
		novo.setLexema(lexema);
		simbolos.put(lexema, novo);
		return novo;
	}
	
	public TabSimRec get(String lexema) {
		return simbolos.get(lexema);
	}
	
	public void delete(String lexema) {
		simbolos.remove(lexema);
	}

	@Override
	public String toString() {
		String result = "";
		for (String chave : simbolos.keySet()) {
			result += chave + "-> " + simbolos.get(chave) + "\n";
		}
		return result;
	}
	
}