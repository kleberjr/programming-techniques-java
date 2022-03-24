package lista8classes;

public class Amigo extends Contato {
	protected int grau;
	
	public Amigo(String nome, String apelido, String email, String aniversario, int grau) {
		super(nome, apelido, email, aniversario);
		
		this.grau = grau;
	}
	
	@Override
	public void imprimirContato() {
		super.imprimirBasico();

		switch (grau) {
			case 1:
				System.out.println("Grau: Melhor Amigo");
				break;
			case 2:
				System.out.println("Grau: Amigo");
				break;
			default:
				System.out.println("Grau: Conhecido");
		}
	}
	
	public int getGrau() {
		return grau;
	}
}
