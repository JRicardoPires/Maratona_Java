package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.Person;

public class BuilderPatternTest01 {
    public static void main(String[] args) {
        Person build = Person.PersonBuilder
                .builder()
                .firstName("Ricardo")
                .lastName("Pires")
                .username("devdojo")
                .email("ricardo.devdojo@devdojo.academy")
                .build();
        System.out.println(build);

    }
}
