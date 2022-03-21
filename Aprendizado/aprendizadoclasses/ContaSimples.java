package aprendizadoclasses;

import java.text.SimpleDateFormat;
import java.util.Date;

/* Uma subclasse concreta de uma classe abstrata precisa implementar os métodos
 * abstratos de sua superclasse */
public class ContaSimples extends ContaBancariaAbstrata {
	
	public ContaSimples(String nome) {
		super(nome);
	}
	
	/* O anotation @Override garante ao programador que ele estará sobrescrevendo
	o método correto. Caso ele esteja tentanto sobrescrever um método que não existe
	na superclasse, um erro será lançado.
	
	O uso de @Override não é obrigatório */
	@Override
	public void retirar(double valor) {
		if (valor <= this.saldo) {
			this.saldo -= valor;
		}
	}
	
	@Override
	public void imprimirExtrato() {
		System.out.println("------ Extrato da Conta Simples ------");
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Data: " + sdf.format(date) + "\n");
	}
}
