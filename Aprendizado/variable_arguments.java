import aprendizadoclasses.Lampada;

public class variable_arguments {
	
	Lampada l1 = new Lampada();
    // Declarando uma função 'average', que recebe como argumento vários dados do tipo double.
    // O 'double' após 'static' indica que a função retorna um double.
    // As reticências indicam a criação de um vetor (array) de elementos do tipo double com os argumentos passados.
    public static double average(double... grades) {
        double sum = 0.0;

        for (double grade : grades) {
            sum += grade;
        }

        return sum / grades.length;
    }

    public static void main(String[] args) {
        double g1 = 5.0, g2 = 3.5, g3 = 7.0;

        System.out.printf("Media de n1 e n2: %.1f\n", average(g1, g2));
        System.out.printf("Media de n1, n2 e n3: %.1f\n", average(g1, g2, g3));
    }
}