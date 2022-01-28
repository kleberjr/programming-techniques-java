import java.util.*;

public class operacoesDeVenda {
    public static void main(String[] args) {
        int n, currentAmount, wantedAmount, newAmount;
        String product;
        Scanner input = new Scanner(System.in);

        /* Cria um dicionário com keys do tipo String e values do tipo inteiro */
        /* O Linked Hash Map preserva a ordem de inserção dos pares */
        Map<String, Integer> stock = new LinkedHashMap<String, Integer>();

        n = input.nextInt();
        /* Ao ler um inteiro, o Scanner não considera a quebra de linha, portanto não
        podemos ler uma linha da maneira convencional após a leitura de um inteiro. Ou seja, isto não é possível:
        input.nextLine() */


        for (int i = 0; i < n; i++) {
            /* Podemos ler palavras separadas por espaço em uma única linha através do método next() */

            /* Adiciona a primeira palavra da entrada como key e a segunda palavra como value */
            stock.put(input.next(), Integer.parseInt(input.next()));
        }

        while (true) {
            product = input.next();

            if (product.equals("fim")) {
                break;
            }

            /* Checa se a chave existe no hashmap */
            if (stock.containsKey(product)) {
                currentAmount = stock.get(product);
                wantedAmount = Integer.parseInt(input.next());

                newAmount = currentAmount - wantedAmount;

                System.out.printf("%s %d\n", product, wantedAmount);

                stock.put(product, newAmount);
            } else {
                System.out.printf("%s produto não encontrado\n", product);
            }
        }

        // Itera através dos pares de um HashMap (ou Linked HashMap)
        // O método entrySet() retorna um set de entradas (pares de key-value) do HashMap
        for (Map.Entry<String, Integer> element : stock.entrySet()) {
            System.out.printf("%s %d\n", element.getKey(), element.getValue());
        }
    }
}

/* Mais informações em: https://stackoverflow.com/questions/26626106/why-string-inputs-after-integer-input-gets-skipped-in-java */