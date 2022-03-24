package aprendizadoclasses;
import aprendizadointerfaces.*;

public class Livro implements Abnt {
	private String conclusao;
	
	public Livro(String conclusao) {
		this.conclusao = conclusao;
	}
	
	@Override
	public void criarSumario() {
		System.out.println("criando sumário para o LIVRO");
	}

	@Override
	public void definirEspacamento() {
		System.out.println("definir espaçamento para o LIVRO");
	}

	@Override
	public void referenciar() {
		System.out.println("referenciando o LIVRO");
	}	
	
	public void criarResumo() {
		// Lógica
	}
}
