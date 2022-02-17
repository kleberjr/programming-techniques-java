package lista5classes;

public class Chamado {
	private int id;
	private String data, tipo, origem, destino;
	private float horarioPartida, horatioRetorno;
	private double quilometragemInicial, quilometragemFinal, valorTotal;
	private Cliente cliente;
	private Motorista motorista;
	private Veiculo veiculo;
	
	public Chamado(int id, 
					String data, 
					String tipo, 
					String origem, 
					String destino, 
					float horarioPartida, 
					float horarioRetorno, 
					double quilometragemInicial, 
					double quilometragemFinal, 
					double valorTotal,
					Cliente cliente,
					Veiculo veiculo,
					Motorista motorista) 
	{
		this.id = id;
		this.data = data;
		this.tipo = tipo;
		this.origem = origem;
		this.destino = destino;
		this.horarioPartida = horarioPartida;
		this.horatioRetorno = horarioRetorno;
		this.quilometragemInicial = quilometragemInicial;
		this.quilometragemFinal = quilometragemFinal;
		this.valorTotal = valorTotal;
		this.cliente = cliente;
		this.veiculo = veiculo;
		this.motorista = motorista;
	}
	
	public int getId() {
		return id;
	}	
	
	public String getDestino() {
		return destino;
	}
	
	public String placaDoCarro() {
		return veiculo.getPlaca();
	}
	
	public String rgDoCliente() {
		return cliente.getRg();
	}
	
	public String nomeDoMotorista() {
		return motorista.getNome();
	}
}
