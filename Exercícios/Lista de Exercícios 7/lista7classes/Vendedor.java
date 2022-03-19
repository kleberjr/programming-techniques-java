package lista7classes;

public class Vendedor extends Funcionario {
	private float comissaoVenda;
	private int quantidadeVendas;
	
	public Vendedor() {}
	public Vendedor(String nome, String dataNascimento, float salario, float comissaoVenda, int quantidadeVendas) {
		super(nome, dataNascimento, salario + comissaoVenda * quantidadeVendas);
		
		this.comissaoVenda = comissaoVenda;
		this.quantidadeVendas = quantidadeVendas;
	}
	
	public float getComissaoVenda() {
		return comissaoVenda;
	}
	public void setComissaoVenda(float comissaoVenda) {
		this.comissaoVenda = comissaoVenda;
	}
	
	public int getQuantidadeVendas() {
		return quantidadeVendas;
	}
	public void setQuantidadeVendas(int quantidadeVendas) {
		this.quantidadeVendas = quantidadeVendas;
	}
	
	
	public String toString() {
		return String.format("Nome: %s\n", super.getNome()) +
				String.format("Data de Nascimento: %s\n", super.getDataNascimento()) + 
				String.format("Salário: R$%.1f\n", super.getSalario()) +
				"Cargo: vendedor\n" +
				String.format("Comissão por Venda: R$%.1f\n", comissaoVenda) +
				String.format("Número de vendas: %d\n", quantidadeVendas);
	}
}
