package aprendizadoclasses;
import aprendizadointerfaces.*;

public class Pedido implements NotaFiscal, BancoDeDados {
	private int numeroPedido;
	private String data;
	private float valor;
	
	@Override
	public void gerarNota() {
		// Lógica qualquer
	}

	@Override
	public void emitirNota() {
		// Lógica qualquer
	}

	@Override
	public void inserir() {
		// Lógica qualquer
	}

	@Override
	public void alterar() {
		// Lógica qualquer
	}

	@Override
	public void excluir() {
		// Lógica qualquer
	}

	@Override
	public void pesquisar() {
		// Lógica qualquer
	}
	
	
	// Demais métodos da classe...
	
}
