package lista8classes;

public class Familia extends Contato {
	protected String parentesco;
	
	public Familia(String nome, String apelido, String email, String aniversario, String parentesco) {
		super(nome, apelido, email, aniversario);
		this.parentesco = parentesco;
	}
	
	@Override
	public void imprimirContato() {
		super.imprimirBasico();
		System.out.printf("Parentesco: %s\n", parentesco);
	}

	public String getParentesco() {
		return parentesco;
	}
}
