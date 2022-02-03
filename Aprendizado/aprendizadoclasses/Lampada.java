package aprendizadoclasses;

public class Lampada {
	// Declara um atributo do tipo booleano.
	public boolean estadoDaLampada;
	
	// Declara um m�todo do tipo void, respons�vel por alterar o valor
	// do atributo estadoDaLampada.
	public void acender() {
		System.out.println("Acendendo a l�mpada...");
		estadoDaLampada = true;
	}
	
	// Declara um m�todo do tipo void, respons�vel por alterar o valor
	// do atributo estadoDaLampada.
	public void apagar() {
		System.out.println("Apagando a l�mpada...");
		estadoDaLampada = false;
	}
	
	// Declara um m�todo do tipo void, respons�vel por exibir uma mensagem
	// com base no valor do atributo estadoDaLampada.
	public void mostrarEstado() {
		if (estadoDaLampada) {
			System.out.println("A l�mpada est� acesa!");
		} else {
			System.out.println("A l�mpada est� apagada!");
		}
	}
}
