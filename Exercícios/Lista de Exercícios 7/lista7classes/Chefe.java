package lista7classes;

public class Chefe extends Funcionario {
	private String departamento;
	
	public Chefe() {}
	public Chefe(String nome, String dataNascimento, float salario, String departamento) {
		super(nome, dataNascimento, salario);
		
		this.departamento = departamento;
	}
	
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	public String toString() {
		return String.format("Nome: %s\n", super.getNome()) +
				String.format("Data de Nascimento: %s\n", super.getDataNascimento()) + 
				String.format("Salário: R$%.1f\n", super.getSalario()) +
				String.format("Departamento: %s\n", departamento) +
				"Cargo: chefe\n";
	}
}
