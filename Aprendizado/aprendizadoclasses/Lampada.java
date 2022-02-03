package aprendizadoclasses;

public class Lampada {
	// Declara um atributo do tipo booleano.
	public boolean estadoDaLampada;
	
	// Declara um método do tipo void, responsável por alterar o valor
	// do atributo estadoDaLampada.
	public void acender() {
		System.out.println("Acendendo a lâmpada...");
		estadoDaLampada = true;
	}
	
	// Declara um método do tipo void, responsável por alterar o valor
	// do atributo estadoDaLampada.
	public void apagar() {
		System.out.println("Apagando a lâmpada...");
		estadoDaLampada = false;
	}
	
	// Declara um método do tipo void, responsável por exibir uma mensagem
	// com base no valor do atributo estadoDaLampada.
	public void mostrarEstado() {
		if (estadoDaLampada) {
			System.out.println("A lâmpada está acesa!");
		} else {
			System.out.println("A lâmpada está apagada!");
		}
	}
}
