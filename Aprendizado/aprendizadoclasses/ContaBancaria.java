package aprendizadoclasses;

public class ContaBancaria {
	// O atributo banco possui o mesmo valor para qualquer instância de ContaBancaria.
	public static String banco;
	private String nome;
	private double saldo;
	
	// Declaração de métodos construtores.
	
	// O método contrutor vazio é necessário para quando quisermos fazer uma
	// inicialização default.
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
	
	// O método toString é um método especial que nos permite chama-lo
	// através do comando System.out.println(nomeDaInstancia)
	// É uma maneira de exibir atributos sem utlizar um método GETTER.
	public String toString() {
		String contaBancaria = "";
		contaBancaria = String.format("Nome: %s\nSaldo: %.2f\nBanco: %s\n", nome, saldo, banco);
		
		return contaBancaria;
	}
}
