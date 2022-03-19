package lista7classes;

public class Moto extends Veiculo {
	private int qtdeCilindradas;
	
	public Moto() {}
	public Moto(String placa, int numeroPortas, float preco, int qtdeCilindradas) {
		super(placa, numeroPortas, preco);
		
		this.qtdeCilindradas = qtdeCilindradas;
	}
	
	public int getQtdeCilindradas() {
		return qtdeCilindradas;
	}
	public void setQtdeCilindradas(int qtdeCilindradas) {
		this.qtdeCilindradas = qtdeCilindradas;
	}
	
	public String toString() {
		return String.format("Placa: %s ", placa) +
				String.format("Número de portas: %d ", numeroPortas) +
				String.format("Preço: R$%.2f ", preco) +
				String.format("Quantidade de Cilindradas: %d", qtdeCilindradas);
	}
}
