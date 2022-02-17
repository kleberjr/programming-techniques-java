import java.util.*;

public class CorretorOrtografico {

	public static String ordenaPalavra(String palavra) {
		char[] charArray = palavra.toCharArray();
		Arrays.sort(charArray);
		String palavraOrdenada = new String(charArray);
		
		return palavraOrdenada;
	}
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int n = Integer.parseInt(input.nextLine());
		
		String[] palavras = new String[n];
		
		for (int i = 0; i < n; i++) {
			palavras[i] = input.nextLine();
		}
		
		String palavra = input.nextLine();
		
		if (Arrays.asList(palavras).contains(palavra)) {
			System.out.println("palavra correta");
		} else {
			System.out.println("palavra incorreta");
			
			String palavraOrdenada = ordenaPalavra(palavra);
			String chute = null;
			
			for (int i = 0; i < palavras.length; i++) {
				String aux = palavras[i];
				palavras[i] = ordenaPalavra(palavras[i]);
				
				if (palavras[i].equals(palavraOrdenada)) {
					chute = aux;
				}
			}
			
			if (chute != null) {
				System.out.println(chute + "?");				
			} else {
				System.out.println("nenhuma sugestão");
			}
		}
		
	}

}
