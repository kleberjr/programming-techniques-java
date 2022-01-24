import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        String name;
        float n1, n2, average;

        Scanner input = new Scanner(System.in);
        System.out.print("Insira seu nome: ");
        name = input.nextLine();
        System.out.printf("Insira a primeira nota, %s: ", name);
        n1 = input.nextInt();
        System.out.print("Agora insira a segunda nota: ");
        n2 = input.nextInt();

        average = (n1 + n2) / 2;

        if (average >= 5.0) {
            System.out.printf("O aluno %s esta aprovado!\n", name);
            System.out.printf("Nota final: %.2f", average);
        } else {
            System.out.printf("O aluno %s esta reprovado!\n", name);
            System.out.printf("Nota final: %.2f", average);
        }
    }
}