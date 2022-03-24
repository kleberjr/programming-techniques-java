package lista8classes;

public class ColegaDeTrabalho extends Contato {
	protected String tipo;

	public ColegaDeTrabalho(String nome, String apelido, String email, String aniversario, String tipo) {
		super(nome, apelido, email, aniversario);
		this.tipo = tipo;
	}
	
	@Override
	public void imprimirContato() {
		super.imprimirBasico();
		
		System.out.printf("Relacionamento de trabalho: %s\n", tipo);
	}

	public String getTipo() {
		return tipo;
	}
}
