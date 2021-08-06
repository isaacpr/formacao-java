package curso9;

import java.util.*;
import java.util.stream.Collectors;

record Curso(String nome, int alunos) {

    public String getNome() {
        return nome;
    }

    public int getAlunos() {
        return alunos;
    }
}

public class ExemploCursos {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<Curso>();

        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 165));
        cursos.add(new Curso("Java 8", 152));
        cursos.add(new Curso("C", 60));

        cursos.sort(Comparator.comparing(Curso::getAlunos));

        int sum = cursos.stream().filter(c -> c.getAlunos() >= 50).mapToInt(Curso::getAlunos).sum();

        System.out.println(sum);

        OptionalDouble media = cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .mapToInt(Curso::getAlunos)
                .average();

        cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .collect(Collectors.toMap(
                        c -> c.getNome(),
                        c -> c.getAlunos()))
                .forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos + " alunos"));
    }
}