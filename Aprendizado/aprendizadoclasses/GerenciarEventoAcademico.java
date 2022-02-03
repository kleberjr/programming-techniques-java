package aprendizadoclasses;

public class GerenciarEventoAcademico {

	public static void main(String[] args) {
		EventoAcademico isic;
		EventoAcademico sibgrapi;
		
		DataSimples dataInicialIsic = new DataSimples((byte) 3, (byte) 2, (short) 2022);
		DataSimples dataFinalIsic = new DataSimples((byte) 5, (byte) 2, (short) 2022);
		
		DataSimples dataInicialSibgrapi = new DataSimples((byte) 5, (byte) 3, (short) 2022);
		DataSimples dataFinalSibgrapi = new DataSimples((byte) 10, (byte) 3, (short) 2022);
		
		isic = new EventoAcademico("ISIC", "Brasília-DF", dataInicialIsic, dataFinalIsic, 500);
		sibgrapi = new EventoAcademico("SIBGRAPI", "Rio de Janeiro-RJ", dataInicialSibgrapi, dataFinalSibgrapi, 300);

		System.out.println(isic);
		System.out.println(sibgrapi);
	}

}
