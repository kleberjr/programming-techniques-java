package lista3classes;

public class Circulo {
	private int x, y, raio;
	// A keyowrd final indica que o atributo estático só pode ser atribuído uma única vez
	public static final double PI = 3.141519;
	
	public Circulo(int x, int y, int raio) {
		this.x = x;
		this.y = y;
		this.raio = raio;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public int getRaio() {
		return raio;
	}
	
	public void setRaio(int raio) {
		this.raio = raio;
	}
	
	public double circunferencia() {
		return 2 * PI * raio;
	}
}
