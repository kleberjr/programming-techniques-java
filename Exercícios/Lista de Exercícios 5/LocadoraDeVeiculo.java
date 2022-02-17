import java.util.*;
import lista5classes.*;

public class LocadoraDeVeiculo {
	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		Veiculo veiculo = new Veiculo(input.next(), 
									input.next(), 
									input.next(), 
									input.next(),
									input.nextInt());
		
		input.nextLine();
		
		Motorista motorista = new Motorista(input.nextInt(), 
											input.next(), 
											input.next(), 
											input.next());
		
		input.nextLine();
		
		Cliente cliente = new Cliente(input.nextInt(), 
									input.next(), 
									input.next(), 
									input.next(),
									input.next());
		
		input.nextLine();
		
		Chamado chamado = new Chamado(input.nextInt(), 
									input.next(), 
									input.next(), 
									input.next(),
									input.next(),
									input.nextFloat(),
									input.nextFloat(),
									input.nextDouble(),
									input.nextDouble(),
									input.nextDouble(),
									cliente,
									veiculo,
									motorista);
		
		
		System.out.println(chamado.getId());
		System.out.println(chamado.getDestino());
		System.out.println(chamado.placaDoCarro());
		System.out.println(chamado.rgDoCliente());
		System.out.println(chamado.nomeDoMotorista());
		
	}
}