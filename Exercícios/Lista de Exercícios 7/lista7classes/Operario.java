package lista7classes;

public class Operario extends Funcionario {
	private float valorProducao;
	private int quantidadeProduzida;
	
	public Operario() {}
	public Operario(String nome, String dataNascimento, float salario, float valorProducao, int quantidadeProduzida) {
		super(nome, dataNascimento, valorProducao * quantidadeProduzida);
		
		this.valorProducao = valorProducao;
		this.quantidadeProduzida = quantidadeProduzida;
	}
	
	public float getValorProducao() {
		return valorProducao;
	}
	public void setValorProducao(float valorProducao) {
		this.valorProducao = valorProducao;
	}
	
	public int getQuantidadeProduzida() {
		return quantidadeProduzida;
	}
	public void setQuantidadeProduzida(int quantidadeProduzida) {
		this.quantidadeProduzida = quantidadeProduzida;
	}

	public String toString() {
		return String.format("Nome: %s\n", super.getNome()) +
				String.format("Data de Nascimento: %s\n", super.getDataNascimento()) + 
				String.format("Salário: R$%.1f\n", super.getSalario()) +
				"Cargo: Operário\n" +
				String.format("Valor por Produção: R$%.1f\n", valorProducao) +
				String.format("Quantidade produzida: %d\n", quantidadeProduzida);
	}
}
