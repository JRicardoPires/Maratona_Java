package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Ricardo"; //String constant pool
        String nome2 = "Ricardo";
        nome = nome.concat(" Pires"); // nome += " Pires"
        System.out.println(nome);
        System.out.println(nome == nome2);
        String nome3 = new String("Ricardo"); // 1 variavel de referĂȘncia, 2 objeto do tipo string, 3 uma string no pool de string
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }
}
