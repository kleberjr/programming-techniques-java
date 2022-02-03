package aprendizadoclasses;

public class GerenciarLampada {

	public static void main(String[] args) {
		// Cria uma instância da classe Lâmpada;
		Lampada lampada1 = new Lampada();
		
		// Chama os métodos para alterar a propriedade estadoDaLampada
		lampada1.acender();
		lampada1.mostrarEstado();
		
		lampada1.apagar();
		lampada1.mostrarEstado();
	}
}
