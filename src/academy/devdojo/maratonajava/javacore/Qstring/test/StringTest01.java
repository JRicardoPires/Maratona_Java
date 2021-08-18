package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Joao"; //String constant pool
        String nome2 = "Joao";
        nome = nome.concat(" Ricardo");
        System.out.println(nome);
        System.out.println(nome == nome2);
        String nome3 = new String("Joao"); // 1 variavel de referência, 2 objeto do tipo string, 3 uma string no pool de string
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }
}
