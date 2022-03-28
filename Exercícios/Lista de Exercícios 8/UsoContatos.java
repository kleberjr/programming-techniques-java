import lista8classes.*;
import java.util.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class UsoContatos {
	
	public static void insereAmigo(Scanner input, ArrayList<Contato> listaDeContatos) {
		input.nextLine();
		
		Amigo amigo = new Amigo(input.next(), 
				input.next(), 
				input.next(), 
				input.next(),
				input.nextInt());
		
		listaDeContatos.add(amigo);
	}
	
	public static void insereFamilia(Scanner input, ArrayList<Contato> listaDeContatos) {
		input.nextLine();
		
		Familia parente = new Familia(input.next(), 
				input.next(), 
				input.next(), 
				input.next(),
				input.next());
		
		listaDeContatos.add(parente);
	}
	
	public static void insereColegaDeTrabalho(Scanner input, ArrayList<Contato> listaDeContatos) {
		input.nextLine();
		
		ColegaDeTrabalho colega = new ColegaDeTrabalho(input.next(), 
				input.next(), 
				input.next(), 
				input.next(),
				input.next());
		
		listaDeContatos.add(colega);
	}
	
	
	/* ==================================================================== */
	
	
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		int operacao = 0;
		
		ArrayList<Contato> listaDeContatos = new ArrayList<Contato>();
		
		
		while (operacao != 8) {
			operacao = input.nextInt();
			int l = listaDeContatos.size();
			
			switch (operacao) {
				case 1:
					int subtipo = input.nextInt();
					
					switch (subtipo) {
						case 1:
							insereAmigo(input, listaDeContatos);
							break;
						case 2:
							insereFamilia(input, listaDeContatos);
							break;
						default:
							insereColegaDeTrabalho(input, listaDeContatos);
					}
					
					break;
					
				case 2:
					for (int i = 0; i < l; i++) {
						listaDeContatos.get(i).imprimirContato();
					}
					
					break;
				
				case 3:
					for (int i = 0; i < l; i++) {
						if (listaDeContatos.get(i) instanceof Familia) {							
							listaDeContatos.get(i).imprimirContato();
						}
					}
					
					break;
				
				case 4:
					for (int i = 0; i < l; i++) {
						if (listaDeContatos.get(i) instanceof Amigo) {							
							listaDeContatos.get(i).imprimirContato();
						}
					}
					
					break;
				
				case 5:
					for (int i = 0; i < l; i++) {
						if (listaDeContatos.get(i) instanceof ColegaDeTrabalho) {							
							listaDeContatos.get(i).imprimirContato();
						}
					}
					
					break;
				
				case 6:
					for (int i = 0; i < l; i++) {
						Contato contato = listaDeContatos.get(i);
												
						/* Casting garantindo que o objeto será do tipo Amigo */
						if (contato instanceof Amigo && ((Amigo) contato).getGrau() == 1) {
							contato.imprimirContato();
							
						/* Casting garantindo que o objeto será do tipo Familia */	
						} else if (contato instanceof Familia && ((Familia) contato).getParentesco().equals("irmão")) {
							contato.imprimirContato();
							
						/* Casting garantindo que o objeto será do tipo Colega */
						} else if (contato instanceof ColegaDeTrabalho && ((ColegaDeTrabalho) contato).getTipo().equals("colega")) {
							contato.imprimirContato();
						}
					}
					
					break;
				
				case 7:
					int indice = input.nextInt();
					
					listaDeContatos.get(indice-1).imprimirContato();
					
					break;
				
				default:
			}
		}
	}
}

