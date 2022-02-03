package aprendizadoclasses;

public class ContaBancaria {
	// O atributo banco possui o mesmo valor para qualquer inst�ncia de ContaBancaria.
	public static String banco;
	private String nome;
	private double saldo;
	
	// Declara��o de m�todos construtores.
	
	// O m�todo contrutor vazio � necess�rio para quando quisermos fazer uma
	// inicializa��o default.
	public ContaBancaria() {
	}
	public ContaBancaria(String nome) {
		this.nome = nome;
	}
	public ContaBancaria(String nome, double saldo) {
		this.nome = nome;
		this.saldo = saldo;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}	
	public void depositar(double valor) {
		saldo += valor;
	}
	public void retirar(double valor) {
		saldo -= valor;
	}
	
	public String getNome() {
		return nome;
	}
	public double getSaldo() {
		return saldo;
	}
	
	// O m�todo toString � um m�todo especial que nos permite chama-lo
	// atrav�s do comando System.out.println(nomeDaInstancia)
	// � uma maneira de exibir atributos sem utlizar um m�todo GETTER.
	public String toString() {
		String contaBancaria = "";
		contaBancaria = String.format("Nome: %s\nSaldo: %.2f\nBanco: %s\n", nome, saldo, banco);
		
		return contaBancaria;
	}
}
