
public class AutoboxingUnboxing {
	static void methodWide(short i) {
	    System.out.println("int");
	}

	static void methodWide(Shor i) {
	    System.out.println("Integer");
	}
	    
	public static void main(String[] args) { 
		
		// Declara um objeto do tipo Integer.
		Integer inteiro = Integer.valueOf(25);
		
		// Para comparar, o Java executa um Unboxing!
		if (inteiro < 35)
			System.out.println("Valor de inteiro = " + inteiro);
		
		int shVal = 25;
	    methodWide(shVal);
	}
}
