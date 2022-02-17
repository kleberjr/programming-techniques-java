import java.util.*;
import lista4classes.Frase;

public class ManipulandoFrases {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Frase frase1 = new Frase(input.nextLine());
		Frase frase2 = new Frase(input.nextLine());
	
		System.out.println(frase1.contarPalavras());
		System.out.println(frase2.contarVogais());
	}
}