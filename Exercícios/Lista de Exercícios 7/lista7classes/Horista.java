package lista7classes;

public class Horista extends Funcionario {
	private float valorHora;
	private int totalHoras;
	
	public Horista() {}
	public Horista(String nome, String dataNascimento, float salario, float valorHora, int totalHoras) {
		super(nome, dataNascimento, valorHora * totalHoras);
		
		this.valorHora = valorHora;
		this.totalHoras = totalHoras;
	}
	
	public float getValorHora() {
		return valorHora;
	}
	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}
	
	public int getTotalHoras() {
		return totalHoras;
	}
	public void setTotalHoras(int totalHoras) {
		this.totalHoras = totalHoras;
	}
	
	public String toString() {
		return String.format("Nome: %s\n", super.getNome()) +
				String.format("Data de Nascimento: %s\n", super.getDataNascimento()) + 
				String.format("Salário: R$%.1f\n", super.getSalario()) +
				"Cargo: horista\n" +
				String.format("Valor por Hora: R$%.1f\n", valorHora) +
				String.format("Total de horas: %d\n", totalHoras);
	}
}
