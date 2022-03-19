package lista7classes;

public class Funcionario {
	private String nome, dataNascimento;
	private float salario;
	
	public Funcionario() {}
	public Funcionario(String nome, String dataNascimento, float salario) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.salario = salario;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	

	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String toString() {
		return String.format("Nome: %s", nome) +
				String.format("Data de Nascimento: %s", dataNascimento) + 
				String.format("Salário: %.1f", salario);
	}
}
