import java.util.*;

public class SiglasInternet {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Map<String, String> dictionary = new LinkedHashMap<String, String>();
	
		int n = Integer.parseInt(input.nextLine());
		
		for (int i = 0; i < n; i++) {
			dictionary.put(input.next(), input.next());
		}
		
		input.nextLine();
		
		String[] abbPhrase = input.nextLine().split(" ");
		
		for (int i = 0; i < abbPhrase.length; i++) {
			String word = abbPhrase[i].toLowerCase();
			
			if (dictionary.containsKey(word)) {
				abbPhrase[i] = dictionary.get(word);
			}
		}
		
		String finalPhrase = String.join(" ", abbPhrase);
		System.out.println(finalPhrase);
	}

}
