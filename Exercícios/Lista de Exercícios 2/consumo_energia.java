import java.util.Scanner;

public class ConsumoEnergia {
    public static double calculateEnergyConsumptionCost(float consumption) {
        if (consumption <= 500) {
            return consumption * 0.02;
        } else if (consumption > 500 && consumption <= 1000) {
            return (500 * 0.10) + (consumption - 500) * 0.05;
        } else {
            return (1000 * 0.35) + (consumption - 1000) * 0.10;
        }
    }

    public static void main(String[] args) {
        float consumption, energyConsumptionCost, total;

        Scanner input = new Scanner(System.in);
        consumption = input.nextFloat();

        energyConsumptionCost = (float) calculateEnergyConsumptionCost(consumption);
        total = energyConsumptionCost + 5;

        System.out.printf("%.2f 5.00 %.2f", energyConsumptionCost, total);
    }
}