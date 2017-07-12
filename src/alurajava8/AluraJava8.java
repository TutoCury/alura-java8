package alurajava8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class AluraJava8 {

    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Tuto");
        lista.add("Felipe");
        lista.add("Osmar");

        lista.sort(String.CASE_INSENSITIVE_ORDER);
        
        lista.forEach(System.out::println);
    }
    
}
