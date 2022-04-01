package lista9classes;
import lista9interfaces.*;

public class Produto implements Classificavel {

	private int codigo;
	private String nome;
	private double preco;
	
	public Produto(int codigo, String nome, double preco) {
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
	}
	
	@Override
	public boolean menorElemento(Classificavel obj) {
		Produto produto = (Produto) obj;
		
		return this.codigo < produto.codigo;
	}
	
}
