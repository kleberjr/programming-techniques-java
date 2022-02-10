package lista3classes;

public class Impressora {
	public String modelo, cor, tipoPapel;
	public boolean bluetooth, wifi, colorida, ligada, papel, digitalizadora, copiadora;
	
	public void ligar() {
		if (!ligada) {
			System.out.println("ligando...");
			
			ligada = true;
		}
	}
	public void desligar() {
		if (ligada) {
			System.out.println("desligando...");
			
			ligada = false;
		}
	}
	
	public void imprimir() {
		if (ligada && papel) {
			System.out.println("imprimindo...");
		} else if (ligada && !papel) {
			System.out.println("sem papel");
		} else {
			System.out.println("impressora desligada");
		}
	}
	
	public void digitalizar() {
		if (ligada && digitalizadora) {
			System.out.println("digitaliza��o sendo realizada...");
		} else if (ligada && !digitalizadora) {
			System.out.println("n�o � poss�vel digitalizar");
		} else {
			System.out.println("impressora desligada");
		}
	}
	
	public void copiar() {
		if (ligada && copiadora) {
			System.out.println("c�pia sendo realizada...");
		} else if (ligada && !copiadora) {
			System.out.println("n�o � poss�vel copiar");
		} else {
			System.out.println("impressora desligada");
		}
	}
	
	public void status() {
		System.out.println(modelo);
		System.out.println(cor);
		System.out.println(tipoPapel);
		System.out.println((bluetooth) ? ("bluetooth on") : ("bluetooth off"));
		System.out.println((wifi) ? ("wifi on") : ("wifi off"));
		System.out.println((colorida) ? ("impress�o colorida") : ("impress�o preto e branco"));
		System.out.println((ligada) ? ("impressora on") : ("impressora off"));
		System.out.println((papel) ? ("tem papel") : ("n�o tem papel"));
		System.out.println((digitalizadora) ? ("digitalizadora on") : ("digitalizadora off"));
		System.out.println((copiadora) ? ("copiadora on") : ("copiadora off"));
	}
}
