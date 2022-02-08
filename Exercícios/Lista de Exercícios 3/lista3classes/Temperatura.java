package lista3classes;

public class Temperatura {
	private double temperature;
	
	public Temperatura() {
	}
	public Temperatura(double temperature) {
		this.temperature = temperature;
	}
	
	public void celsiusToFahrenheit() {
		temperature = (temperature * 9.0) / 5.0 + 32;
	}
	
	public void FahrenheitToCelsius() {
		temperature = (temperature - 32) * 5.0 / 9.0;
	}
	
	public String toString() {
		return String.format("%.1f", temperature);
	}
}
