import lista3classes.Circulo;
import java.util.*;

public class TestaCirculo {

	public static void main(String[] args) {
		Circulo c1, c2, c3;
		int r1, r2, r3;
		Scanner input = new Scanner(System.in);
		
		c1 = new Circulo(input.nextInt(), input.nextInt(), input.nextInt());
		input.nextLine();
		c2 = new Circulo(input.nextInt(), input.nextInt(), input.nextInt());
		input.nextLine();
		c3 = new Circulo(input.nextInt(), input.nextInt(), input.nextInt());
		input.nextLine();
		
		r1 = Integer.parseInt(input.nextLine());
		r2 = Integer.parseInt(input.nextLine());
		r3 = Integer.parseInt(input.nextLine());
		
		// 1. Crie um vetor de 3 objetos Circulo, considerando o construtor da classe
		Circulo[] vetor1 = {c1, c2, c3};
		
		// 2. Declare outra referência do tipo Circulo[]
		// 3. Copie a referência do primeiro vetor para o segundo
		Circulo[] vetor2 = vetor1;
		
		// 4. Crie um terceiro vetor do tipo Circulo de tamanho 3
		// 5. Copie os objetos do primeiro vetor para o terceiro
		Circulo[] vetor3 = new Circulo[3];
		vetor3[0] = new Circulo(vetor1[0].getX(), vetor1[0].getY(), vetor1[0].getRaio());
		vetor3[1] = new Circulo(vetor1[1].getX(), vetor1[1].getY(), vetor1[1].getRaio());
		vetor3[2] = new Circulo(vetor1[2].getX(), vetor1[2].getY(), vetor1[2].getRaio());
		
		// 6. Altere os valores de raio para os objetos do primeiro vetor
		vetor1[0].setRaio(r1);
		vetor1[1].setRaio(r2);
		vetor1[2].setRaio(r3);
		
		// 7. Imprima os valores x, y e raio de cada objeto para os três vetores
		System.out.println("vetor1:");
		for (int i = 0; i < 3; i++) {
			System.out.printf("%d %d %d\n", vetor1[i].getX(), vetor1[i].getY(), vetor1[i].getRaio());
		}
		
		System.out.println("vetor2:");
		for (int i = 0; i < 3; i++) {
			System.out.printf("%d %d %d\n", vetor2[i].getX(), vetor2[i].getY(), vetor2[i].getRaio());
		}
		
		System.out.println("vetor3:");
		for (int i = 0; i < 3; i++) {
			System.out.printf("%d %d %d\n", vetor3[i].getX(), vetor3[i].getY(), vetor3[i].getRaio());
		}
	}
}
