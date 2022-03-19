import lista7classes.*;
import java.util.*;

public class Empresa {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		String nomeDaEmpresa = input.next();
		String cidadeSede = input.next();
		String mesAtual = input.next();
		input.nextLine();
		
		Chefe chefe = new Chefe(input.next(), input.next(), input.nextFloat(), input.next());
		input.nextLine();
		
		Vendedor vendedor = new Vendedor(input.next(), input.next(), input.nextFloat(), input.nextFloat(), input.nextInt());
		input.nextLine();
		
		Operario operario = new Operario(input.next(), input.next(), input.nextFloat(), input.nextFloat(), input.nextInt());
		input.nextLine();
		
		Horista horista = new Horista(input.next(), input.next(), input.nextFloat(), input.nextFloat(), input.nextInt());

	
		Funcionario[] funcionarios = {chefe, vendedor, operario, horista};
		
		FolhaPagamento folhaPagamento = new FolhaPagamento();
		
		folhaPagamento.mostrarPagamentos(nomeDaEmpresa, cidadeSede, mesAtual, funcionarios);
	}

}
