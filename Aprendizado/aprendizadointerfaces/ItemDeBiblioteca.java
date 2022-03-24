package aprendizadointerfaces;
import aprendizadoenums.*;

public interface ItemDeBiblioteca {
	int MAX_DIAS_EMPRESTIMO = 14;
	
	boolean isEmprestimo();
	void modificarEmprestimo(Estado estado);
	String getLocalizacao();
}
