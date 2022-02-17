package lista5classes;

public class Cliente {
	private int id;
	private String nome, telefone, rg, cpf;
	
	public Cliente(int id, String nome, String telefone, String rg, String cpf) {
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.rg = rg;
		this.cpf = cpf;
	}
	
	public String getRg() {
		return rg;
	}
}
