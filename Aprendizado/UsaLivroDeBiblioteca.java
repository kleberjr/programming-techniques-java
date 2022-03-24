import aprendizadoclasses.*;
import aprendizadointerfaces.*;
import aprendizadoenums.*;

public class UsaLivroDeBiblioteca {

	public static void main(String[] args) {
		LivroDeBiblioteca livroA = new LivroDeBiblioteca("Java: como programar", 
				"Paul Deitel, Harvey Deitel", (short)934, (short)2017, "prateleira 5A");
		
		LivroDeBiblioteca livroB = new LivroDeBiblioteca("Introdução a POO usando Java", 
				"Rafael Santos", (short)934, (short)2017, "prateleira 5C");
		
		livroA.modificarEmprestimo(Estado.EMPRESTA);
		System.out.println(livroA);
		System.out.println(livroB);
	}
}
