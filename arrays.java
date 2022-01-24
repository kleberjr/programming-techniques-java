public class arrays {
    public static void main(String[] args) {
        // Arrays unidimensionais suportam somente um tipo de elemento.
        int[] numbers;
        String[] names;
        float[] firstGrades, secondGrades;

        // Declara um array de elementos inteiros.
        int[] myNumbers;
        // Inicializa o vetor com 5 elementos.
        myNumbers = new int[5];
        // int[] myNumbers = new int[5]
        // int myNumbers[] = new int[5]

        String studentNames[] = {"Kleber", "Breno", "Gustavo", "Kennald", "Gabriela"};

        for (String name : studentNames) {
            // Itera através do Arrat, passando o elemento como valor da variável name.
            System.out.println(name);
        }
    }
}