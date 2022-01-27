import java.util.Scanner;

public class pesoIdeal {
    /* A função recebe como parâmetro a altura e o sexo, e utiliza uma estrutura
    * switch case para calcular o peso ideal de acordo com o sexo. */

    /* É necessário retornar um double, pois o Java não enxerga números quebrados como float (??) */
    public static double calculateIdealWeight(float height, char gender) {
        /* É preciso inicializar uma variável do tipo double antes de usá-la */
        double idealWeight = 0;

        switch (gender) {
            case 'm':
                return 72.7*height - 58;
            case 'f':
                return 62.1*height - 44.7;
            default:
                /* Necessário para compilação, pois os 2 primeiros casos não ocorram, a função precisa retornar
                * alguma coisa */
                return idealWeight;
        }
    }


    public static void main(String[] args) {
        float height;
        char gender;

        Scanner input = new Scanner(System.in);

        height = input.nextFloat();
        gender = input.next().charAt(0);

        if ((height < 0) || (gender != 'm' && gender != 'f')) {
            System.out.println("Entrada inválida!");
        } else {
            System.out.printf("%.1f kg", calculateIdealWeight(height, gender));
        }
    }
}