package lista4classes;

public class Criptografia {
	private String frase;
	
	public Criptografia(String frase) {
		this.frase = frase;
	}
	
	public String getFrase() {
		return frase;
	}

	public void setFrase(String frase) {
		this.frase = frase;
	}

	public String criptografarFrase() {
		
		return frase.replaceAll("[AEIOUaeiouÁÉÍÓÚáéíóúã]", "*");
	}
}
