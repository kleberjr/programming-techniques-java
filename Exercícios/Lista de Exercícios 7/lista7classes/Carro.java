package lista7classes;

public class Carro extends Veiculo {
	private String cor;
	
	public Carro() {}
	public Carro(String placa, int numeroPortas, float preco, String cor) {
		super(placa, numeroPortas, preco);
		
		this.cor = cor;
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String toString() {
		return String.format("Placa: %s ", placa) +
				String.format("Número de portas: %d ", numeroPortas) +
				String.format("Preço: R$%.2f ", preco) +
				String.format("Cor: %s", cor);
	}
}
