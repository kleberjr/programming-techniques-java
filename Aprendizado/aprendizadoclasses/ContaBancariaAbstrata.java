package aprendizadoclasses;

// Uma classe abstrata não pode ser instanciada.
public abstract class ContaBancariaAbstrata {
	protected String nome;
	protected double saldo;
	
	public ContaBancariaAbstrata(String nome) {
		this.nome = nome;
		this.saldo = 0;
	}
	
	// Um método abstrato só pode ser implementado em uma subclasse concreta.
	public abstract void retirar(double valor);
	
	public void depositar(double valor) {
		saldo += valor;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public abstract void imprimirExtrato();
}
