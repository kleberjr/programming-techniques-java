package aprendizadoclasses;

public class Livro2 {
	private String titulo, autor;
	private short numeroPaginas, anoEdicao;
	
	public Livro2(String titulo, String autor, short numeroPaginas, short anoEdicao) {
		this.titulo = titulo;
		this.autor = autor;
		this.numeroPaginas = numeroPaginas;
		this.anoEdicao = anoEdicao;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public String getAutor() {
		return autor;
	}
	
	@Override
	public String toString() {
		return String.format("Título: %s\n", titulo) +
				String.format("Autor: %s\n", autor) +
				String.format("Número de Páginas: %d\n", numeroPaginas) +
				String.format("Ano de Edição: %d\n", anoEdicao);
	}
}
