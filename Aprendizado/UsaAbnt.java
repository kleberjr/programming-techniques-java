import aprendizadoclasses.*;

public class UsaAbnt {
	
	public static void main(String[] args) {
	
		Livro livro = new Livro("fim."); 
		Artigo artigo = new Artigo(1);
		
		livro.criarSumario();
		livro.definirEspacamento();
		livro.referenciar();
		artigo.criarSumario();
		artigo.definirEspacamento();
		artigo.referenciar();
	}
}
