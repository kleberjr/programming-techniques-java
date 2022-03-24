package aprendizadoclasses;
import aprendizadointerfaces.*;

public class Artigo implements Abnt {
	private int codigo;

	public Artigo(int codigo) {
		this.codigo = codigo;
	}
	
	@Override
	public void criarSumario() {
		System.out.println("criando sumário para o ARTIGO");
	}

	@Override
	public void definirEspacamento() {
		System.out.println("definindo espaçamento para o ARTIGO");
	}

	@Override
	public void referenciar() {
		System.out.println("referenciando o ARTIGO");
	}
}
