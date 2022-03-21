import aprendizadoclasses.ContaEspecial;
import aprendizadoclasses.ContaSimples;

public class UsaConta {
	
	public static void main(String[] args) {
		
		ContaSimples conta1 = new ContaSimples("José Silva");
		ContaEspecial conta2 = new ContaEspecial("Maria Júlia", 1000);
		
		conta1.depositar(2000);
		conta1.retirar(500);
		conta1.imprimirExtrato();
		
		conta2.depositar(1005);
		conta2.retirar(2000);
		conta2.imprimirExtrato();
	}
}