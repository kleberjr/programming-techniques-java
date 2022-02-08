import java.util.Scanner;
import lista3classes.Retangulo;

public class Formas {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Retangulo ret1 = new Retangulo();
		Retangulo ret2 = new Retangulo();

		ret1.setLength(Integer.parseInt(input.next()));
		ret1.setWidth(Integer.parseInt(input.next()));
		
		ret2.setLength(Integer.parseInt(input.next()));
		ret2.setWidth(Integer.parseInt(input.next()));
	
		System.out.printf("%d %d %d %d\n", ret1.getLength(), ret1.getWidth(), ret1.perimeter(), ret1.area());
		System.out.printf("%d %d %d %d\n", ret2.getLength(), ret2.getWidth(), ret2.perimeter(), ret2.area());
	}

}
