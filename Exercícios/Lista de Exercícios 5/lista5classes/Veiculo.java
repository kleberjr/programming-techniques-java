package lista5classes;

public class Veiculo {
	private String placa, marca, modelo, cor;
	private int ano;
	
	public Veiculo(String placa, String marca, String modelo, String cor, int ano) {
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
	}
	
	public String getPlaca() {
		return placa;
	}
}
