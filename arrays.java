public class arrays {
    public static void main(String[] args) {
        /* ============== Arrays Unidimensionais ============== */

        // Arrays unidimensionais suportam somente um tipo de elemento.
        String[] names;
        float[] firstGrades, secondGrades;

        // Declara um vetor de elementos inteiros.
        int[] myNumbers;
        // Inicializa o vetor com 5 elementos.
        myNumbers = new int[5];
        // int[] myNumbers = new int[5]
        // int myNumbers[] = new int[5]

        String studentNames[] = {"Kleber", "Breno", "Gustavo", "Kennald", "Gabriela"};

        for (String name : studentNames) {
            // Itera através do Array, passando o elemento como valor da variável name.
            System.out.println(name);
        }


        /* ============== Arrays Bidimensionais ============== */

        int[][] n1;
        n1 = new int[3][3];
        /* n1 = {{0, 0, 0},
                 {0, 0, 0},
                 {0, 0, 0}} */

        /* Se o número de linhas for igual ao número de colunas, então podemos
        * escrever dessa forma:
        * int[][] n1 = new int[3] */

        n1[0][1] = 2;
        n1[1][2] = 5;
        n1[2][0] = 4;
        /* n1 = {{2, 0, 0},
                 {0, 5, 0},
                 {4, 0, 0}} */

        int[][] n2 = new int[2][];
        /* n2 = {null,
                 null} */

        n2[0] = new int[4];
        /* n2 = {{0, 0, 0, 0},
                 null} */

        int[][] matriz = {{1, 2, 3}, {4, 5, 6}};
        matriz[1][1] = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%d ", matriz[i][j]);
            }

            System.out.println();
        }

        /* Para cada array na matriz... */
        for (int[] vetor : matriz) {
            /* Para cada elemento no array... */
            for (int elemento : vetor) {
                System.out.printf("%d ", elemento);
            }

            System.out.println();
        }
    }
}