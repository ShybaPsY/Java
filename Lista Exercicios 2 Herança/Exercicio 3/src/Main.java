import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.inserir(new TermoSimples("gato", "cat", "ket"));
        dicionario.inserir(new TermoCompleto("cachorro", "dog", Arrays.asList("cão", "canino", "perro")));

        System.out.println("Tradução de 'gato': " + dicionario.traduzir("gato"));
        System.out.println("Tradução de 'cachorro': " + dicionario.traduzir("cachorro"));
        System.out.println("Removendo 'gato': " + dicionario.remover("gato"));
        System.out.println("Tradução de 'gato' após remoção: " + dicionario.traduzir("gato"));
    }
}
