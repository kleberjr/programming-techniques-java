import java.util.Scanner;

import lista4classes.Criptografia;
import java.util.*;

public class EncriptografandoFrases {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Criptografia frase = new Criptografia(input.nextLine());
		frase.setFrase(input.nextLine());
		System.out.println(frase.getFrase());
		
		frase.setFrase(input.nextLine());

		System.out.println(frase.criptografarFrase());

	}

}
