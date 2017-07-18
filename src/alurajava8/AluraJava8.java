package alurajava8;

import java.util.ArrayList;
import java.util.List;

public class AluraJava8 {

    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();
        palavras.add("alura online");
        palavras.add("casa do código");
        palavras.add("caelum");

        // Exemplos de Lambdas
        palavras.sort((s1, s2) -> s1.length() - s2.length());
        palavras.forEach(s -> System.out.println(s));

        System.out.println("------------------------------");

        List<String> lista = new ArrayList<>();
        lista.add("Tuto");
        lista.add("Felipe");
        lista.add("Osmar");

        // Exemplo de Comparator e Method Reference 
        lista.sort(String.CASE_INSENSITIVE_ORDER);
        lista.forEach(System.out::println);

        System.out.println("------------------------------");

        // Executando uma Thread em uma linha só
        new Thread(() -> System.out.println("Executando um Runnable")).start();
    }

}
