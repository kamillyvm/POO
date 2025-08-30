package AbreviaNomes;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("digite um nome completo:");
        String nome = s.nextLine();

        AbreviaNomes abrevia = new AbreviaNomes(nome);
        System.out.println("abreviação: " + abrevia.abreviar());
    }
}
