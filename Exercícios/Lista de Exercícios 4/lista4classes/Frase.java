package lista4classes;
import java.util.Arrays;

public class Frase {
	private String frase;
	
	public Frase(String frase) {
		this.frase = frase;
	}
	
	public String getFrase() {
		return frase;
	}

	public void setFrase(String frase) {
		this.frase = frase;
	}

	public int contarVogais() {
		char[] vogais = {'a', 'e', 'i', 'o', 'u', 'á', 'ã', 'à', 'â', 'é', 'ê', 'ó', 'ô', 'í'};
		frase = frase.toLowerCase();
		int count = 0;
		
		for (int i = 0; i < frase.length(); i++) {
			char letra = frase.charAt(i);
			
			if (new String(vogais).indexOf(letra) != -1) {
				count++;
			}
		}
		
		return count;
	}
	
	public int contarPalavras() {
		String[] palavras = frase.split(" ");
		
		return palavras.length;
	}
}
