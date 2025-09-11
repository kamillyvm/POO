package AnaliseString;
import java.util.Scanner;

public class AnaliseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite uma string: ");
        String texto = sc.nextLine();

        //numero de caracteres da string
        System.out.println("numero de caracteres: " + texto.length());

        //a string com todas suas letras em maiúsculo
        System.out.println("em maiúsculo: " + texto.toUpperCase());

        //numero de vogais da string
        int vogais = 0;
        for (char c : texto.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                vogais++;
            }
        }
        System.out.println("numero de vogais: " + vogais);

        //se a string digitada começa com “UNI” (ignorando maiúsculas/minúsculas)
        System.out.println("começa com 'UNI'? " + texto.toUpperCase().startsWith("UNI"));

        //se a string digitada termina com “RIO” (ignorando maiúsculas/minúsculas)
        System.out.println("termina com 'RIO'? " + texto.toUpperCase().endsWith("RIO"));

        //o numero de dígitos (0 a 9) da string
        int digitos = 0;
        for (char c : texto.toCharArray()) {
            if (Character.isDigit(c)) {
                digitos++;
            }
        }
        System.out.println("numero de dígitos: " + digitos);

        //se a string é um palíndromo ou não
        String limpo = texto.replaceAll("\\s+", "").toLowerCase();
        String invertido = new StringBuilder(limpo).reverse().toString();
        System.out.println("eh palindromo? " + limpo.equals(invertido));

        sc.close();
    }
}
