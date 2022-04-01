package lista9classes;
import lista9interfaces.*;

public class Cliente implements Classificavel {

	private String cpf, nome, endereco;
	
	@Override
	public boolean menorElemento(Classificavel obj) {

		return false;
	}
	
}
