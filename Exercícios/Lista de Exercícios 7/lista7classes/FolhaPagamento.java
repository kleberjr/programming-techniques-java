package lista7classes;

public class FolhaPagamento {
	
	public void mostrarPagamentos(String nome, String cidade, String mes, Funcionario funcionarios[]) {
		System.out.printf("Nome da Empresa: %s\n", nome);
		System.out.printf("Endereço: %s\n", cidade);
		System.out.printf("Mês: %s\n", mes);
		System.out.println("");
		System.out.println(funcionarios[0]);
		System.out.println(funcionarios[1]);
		System.out.println(funcionarios[2]);
		System.out.print(funcionarios[3]);
	}
}
