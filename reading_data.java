import java.util.Scanner;

public class readingData {
    public static void main(String[] args) {
        // Declara três variáveis inteiras.
        int n1, n2, sum;

        // Cria um objeto Scanner e o armazena na variável input (que é do tipo Scanner).
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o primeiro numero inteiro: ");

        // Armazena na variável n1 a entrada de dados no console.
        n1 = input.nextInt();
        System.out.print("Informe o segundo numero inteiro: ");
        n2 = input.nextInt();
        sum = n1 + n2;

        System.out.printf("O resultado da soma eh: %d\n", sum);
    }
}