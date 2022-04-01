package lista9classes;
import lista9interfaces.*;

public class Servico implements Classificavel {

	private double preco;
	private String data, tipoServico;
	
	@Override
	public boolean menorElemento(Classificavel obj) {

		return false;
	}
	
}
