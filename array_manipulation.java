import java.util.Arrays;

public class array_manipulation {
    public static void main(String[] args) {
        /* Declara e inicializa um array unidimensional de inteiros, com 5 posições */
        int[] v1 = {6, 10, 1, 15, 20};
        /* Declara um array unidimensional vazio, com 10 posições (iguais a 0) */
        int[] v2 = new int[10];

        /* O primeiro parâmetro indica o vetor a ser copiado */
        /* O segundo parâmetro indica o índice pelo qual deve começar a se copiar o vetor */
        /* O terceiro parâmetro indica o vetor que receberá a cópia */
        /* O terceiro parâmetro indica o índice do novo vetor pelo qual deve começar a se receber a cópia */
        /* O terceiro parâmetro indica a quantidade de elementos a serem copiados (a partir do índice indicado) */
        System.arraycopy(v1, 0, v2, 0, v1.length);

        /* A variável booleana v recebe o resultado do método equals(), que compara dois arrays */
        /* A comparação é uma shallow equality, onde é analisado apenas o valor e ordem de cada entrada do array */
        /* {6, 10, 1, 15, 20} == {6, 10, 1, 15, 20, 0, 0, 0, 0, 0} ? true : false */
        boolean v = Arrays.equals(v1, v2);
        /* Caso v seja true, então printe "iguais", caso contrário, printe "diferentes" */
        System.out.println(v ? "Ambos os arrays sao iguais" : "Ambos os arrays sao diferentes");

        /* Ordena o array v2 */
        Arrays.sort(v2);
    }
}