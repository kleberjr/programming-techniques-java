package aprendizadoclasses;

public class GerenciarContaBancaria {

	public static void main(String[] args) {
		// Inicialização default.
		ContaBancaria conta1 = new ContaBancaria();
		// Inicialização com valores.
		ContaBancaria conta2 = new ContaBancaria("Maria");
		ContaBancaria conta3 = new ContaBancaria("Kleber", 1000);

		// Jeito correto de modificar um atributo estático.
		ContaBancaria.banco = "Bradesco S.A";
		// Jeito incorreto.
		conta1.banco = "Itaú Unibanco";
		// Ambas as maneiras funcionam e irão alterar o valor do atributo
		// em TODAS as instâncias da classe.
		
		conta1.setNome("João");
		conta1.depositar(5500);
		conta1.retirar(6600);
		conta1.depositar(7000);
		
		conta2.depositar(10000);
		conta2.retirar(9548);
		
		conta1.getSaldo();
		conta2.getSaldo();
		conta3.getSaldo();
		
		System.out.println(conta1);
		System.out.println(conta2);
		System.out.println(conta3);
	}

}
