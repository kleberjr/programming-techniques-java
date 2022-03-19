import lista7classes.*;
import java.util.*;

public class Principal {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		Veiculo veiculo = new Veiculo();
		veiculo.setPlaca(input.next());
		veiculo.setNumeroPortas(input.nextInt());
		veiculo.setPreco(input.nextFloat());
		input.nextLine();

		Carro carro = new Carro(input.next(), input.nextInt(), input.nextFloat(), input.next());
		input.nextLine();

		Moto moto = new Moto(input.next(), input.nextInt(), input.nextFloat(), input.nextInt());
		
		System.out.println(veiculo);
		System.out.println(carro);
		System.out.println(moto);
	}
}
