package lista5classes;

public class Motorista {
	private int id;
	private String nome, telefone, cnh;
	
	public Motorista(int id, String nome, String telefone, String cnh) {
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.cnh = cnh;
	}
	
	public String getNome() {
		return nome;
	}
}
