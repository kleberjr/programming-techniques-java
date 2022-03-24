package aprendizadointerfaces;

public interface Abnt {
	/* Uma interface não pode ser instanciada */
	
	/* Em uma inteface, não podemos criar atributos que não sejam constantes, isto é
	 * atributos inicializados dentro da classe e com valor inalterável. Automaticamente
	 * todos recebem os modificadores de acesso public, static e final */
	
	/* public static final */ int TAMANHO_DA_PAGINA = 80;
	
	/* Quando não queremos definir (implementar) nenhum método, devemos
	 * criar uma interface. */
	
	/* Métodos declarados em uma interface possuem os modificadores de acesso
	 * public e abstract por padrão, logo não é necessário declará-los. */
	/* public abstract */ void criarSumario();
	/* public abstract */ void definirEspacamento();
	/* public abstract */ void referenciar();
	
	/* Podemos implementar um método em uma interface caso usemos a keyword defalut */
	default void teste() {
		System.out.print("Qualquer coisa!");
	}
}
