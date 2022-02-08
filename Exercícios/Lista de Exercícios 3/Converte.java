import lista3classes.Temperatura;
import java.util.*;

public class Converte {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double initialValue = input.nextDouble();
		
		Temperatura temp1 = new Temperatura(initialValue);
		
		temp1.celsiusToFahrenheit();
		System.out.printf("temperatura: %s graus fahrenheit\n", temp1);
		temp1.FahrenheitToCelsius();
		System.out.printf("temperatura: %s graus celsius", temp1);
	}
}