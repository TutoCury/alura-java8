package alurajava8;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DatasJava8 {

    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        System.out.println("------------------------------");
        
        LocalDate futuro = LocalDate.of(2099, Month.JANUARY, 25);
        System.out.println(futuro);
        
        System.out.println("------------------------------");
        
        Period periodo = Period.between(hoje, futuro);
        System.out.println(periodo);
        
        System.out.println("------------------------------");

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(hoje.format(formatador));
    }

}
