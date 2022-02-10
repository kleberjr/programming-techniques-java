import lista3classes.Conta;
import java.util.*;

public class Banco {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		int numeroConta = Integer.parseInt(input.next());
		int senha = Integer.parseInt(input.next());
		String nomeCliente = input.next();
		double saldo = input.nextDouble();
		
		Conta conta1 = new Conta(nomeCliente, numeroConta, senha, saldo);
		
		input.nextLine();	
		numeroConta = Integer.parseInt(input.next());
		senha = Integer.parseInt(input.next());
		nomeCliente = input.next();
		saldo = input.nextDouble();
		 
		Conta conta2 = new Conta(nomeCliente, numeroConta, senha, saldo);
		
		input.nextLine();	
		
		int operacao = 0;
		
		do {
			operacao = Integer.parseInt(input.nextLine());
			
			switch (operacao) {
				case 1:
					senha = Integer.parseInt(input.nextLine());
					
					if (conta1.getSaldo(senha) != -1) {
						System.out.printf("%.2f\n", conta1.getSaldo(senha));
					} else {
						System.out.println("senha incorreta");
					}
					
					break;
					
				case 2:
					double valorDoSaque = input.nextDouble();
					senha = input.nextInt();
					input.nextLine();
					
					
					System.out.println((conta1.sacar(valorDoSaque, senha)) ? ("saque realizado") : ("saque não realizado"));
					
					break;
				
				case 3:
					double valorDoDeposito = input.nextDouble();
					senha = input.nextInt();
					input.nextLine();
					
					System.out.println((conta1.depositar(valorDoDeposito, senha)) ? ("depósito realizado") : ("depósito não realizado"));
					
					break;
				
				case 4:
					nomeCliente = input.next();
					input.nextLine();
					
					if (nomeCliente.equals(conta2.getNomeCliente())) {
						double valorDaTransferencia = input.nextDouble();
						senha = input.nextInt();
						input.nextLine();
						
						if (conta1.transferir(valorDaTransferencia, senha, conta2)) {
							System.out.println("transferência realizada");
						} else {
							System.out.println("transferência não realizada");
						}
					
					} else {
						System.out.println("nenhum usuário encontrado");
					}
					
					break;
				
				default:
					break;
			}
			
		} while (operacao != 5);
	}
}