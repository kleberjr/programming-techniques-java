import java.util.Scanner;

public class controleDePessoas {
    public static void main(String[] args) {
        char gender;
        int maleCount = 0, femaleCount = 0;
        float maleTicketTotal, femaleTicketTotal, ticketTotal;
        Scanner input = new Scanner(System.in);

        do {
            gender = input.nextLine().charAt(0);

            switch (gender) {
                case 'h':
                    maleCount++;
                    break;
                case 'm':
                    femaleCount++;
                    break;
            }
        } while (gender != 'q');

        maleTicketTotal = (float) (maleCount * 12.50);
        femaleTicketTotal = (float) (femaleCount * 7.40);
        ticketTotal = maleTicketTotal + femaleTicketTotal;

        System.out.printf("%d %d\n", maleCount, femaleCount);
        System.out.printf("%.2f %.2f %.2f", maleTicketTotal, femaleTicketTotal, ticketTotal);
    }
}