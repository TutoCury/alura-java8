package alurajava8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExemploCurso {

    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

        cursos.sort(Comparator.comparingInt(Curso::getAlunos));
        cursos.forEach(c -> System.out.println(c.getNome()));

        System.out.println("-------------------------------");

        cursos.stream()
                .filter(c -> c.getAlunos() > 50)
                .map(Curso::getNome)
                .forEach(System.out::println);

        System.out.println("-------------------------------");

        cursos.stream()
                .filter(c -> c.getAlunos() > 50)
                .findFirst()
                .ifPresent(c -> System.out.println(c.getNome()));

        System.out.println("-------------------------------");

        cursos.stream()
                .mapToInt(Curso::getAlunos)
                .average()
                .ifPresent(System.out::println);

        System.out.println("-------------------------------");

        List<Curso> lista = cursos.stream()
                .filter(c -> c.getAlunos() > 50)
                .collect(Collectors.toList());
        lista.forEach(c -> System.out.println(c.getNome()));
    }

}
