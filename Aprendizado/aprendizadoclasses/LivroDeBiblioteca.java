package aprendizadoclasses;
import aprendizadoenums.Estado;
import aprendizadointerfaces.*;

public class LivroDeBiblioteca extends Livro2 implements ItemDeBiblioteca {
	private boolean isEmprestado;
	private String localizacao;
	
	public LivroDeBiblioteca(String titulo, String autor, short numeroPaginas, short anoEdicao, String localizacao) {
		super(titulo, autor, numeroPaginas, anoEdicao);
		this.isEmprestado = false;
		this.localizacao = localizacao;
	}
	
	@Override
	public boolean isEmprestimo() {
		return this.isEmprestado;
	}

	@Override
	public void modificarEmprestimo(Estado estado) {
		if (estado == Estado.EMPRESTA) {
			this.isEmprestado = true;
			System.out.printf("O livro %s foi emprestado e deverá ser devolvido em %d dias", super.getTitulo(), MAX_DIAS_EMPRESTIMO);
		} else if (estado == Estado.DEVOLVE) {
			this.isEmprestado = false;
			System.out.printf("O livro %s foi devolvido", super.getTitulo());
		}
		
	}

	@Override
	public String getLocalizacao() {
		return this.localizacao;
	}
	
	@Override
	public String toString() {
		String livro = super.toString();
		livro += "Localização: " + this.localizacao + "\n";
		
		if (this.isEmprestado) {
			livro += "Este livro está emprestado.\n";
		} else {
			livro += "Este livro está disponível para empréstimo.\n";
		}
		
		return livro;
	}
	
}
