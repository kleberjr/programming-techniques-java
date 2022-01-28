import java.util.Scanner;

public class Iptu {
    public static double calculateIPTU(int type, int area) {
        switch (type) {
            case 1:
                /* Se a área for maior ou igual a 200, retorne area * 1.2, caso contrário retorne apenas area. */
                return (area >= 200) ? (area * 1.2) : area;

            default:
                /* Se a área for maior ou igual a 200, retorne area * 1.3, caso contrário retorne area * 1.1 */
                return (area >= 200) ? (area * 1.3) : (area * 1.1);
        }
    }

    public static void main(String[] args) {
        int type, area;

        Scanner input = new Scanner(System.in);

        type = input.nextInt();
        area = input.nextInt();

        /* condição 1 - area > 0 */
        /* condição 2 - type == 1 || type == 2 */

        if ((area > 0) && (type == 1 || type == 2)) {
            System.out.printf("%.2f", calculateIPTU(type, area));
        } else {
            System.out.println("Entrada inválida!");
        }

    }
}