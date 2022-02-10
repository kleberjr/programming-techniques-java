package lista3classes;

public class Conta {
	private String nomeCliente;
	private int numeroConta, senha;
	private double saldo;
	
	public Conta(String nomeCliente, int numeroConta, int senha, double saldo) {
		this.nomeCliente = nomeCliente;
		this.numeroConta = numeroConta;
		this.senha = senha;
		this.saldo = saldo;
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public double getSaldo(int senha) {
		if (senha == this.senha) {			
			return saldo;
		} else {
			return -1;
		}
	}
	
	public boolean sacar(double valorDoSaque, int senha) {
		if (valorDoSaque > 0 && valorDoSaque <= saldo && this.senha == senha) {
			saldo -= valorDoSaque;
		
			return true;
		}
		
		return false;
	}
	
	public boolean depositar(double valorDoDeposito, int senha) {
		if (valorDoDeposito > 0 && this.senha == senha) {
			saldo += valorDoDeposito;
			
			return true;
		}
		
		return false;
	}
	
	public boolean transferir(double valorDaTransferencia, int senha, Conta conta2) {
		if (valorDaTransferencia > 0 && valorDaTransferencia <= saldo && this.senha == senha) {
			saldo -= valorDaTransferencia;
			conta2.saldo += valorDaTransferencia;
			
			return true;
		}
		
		return false;
	}
}
