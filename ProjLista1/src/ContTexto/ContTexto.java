package ContTexto;

import java.util.Scanner;

public class ContTexto {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("digite um texto:");
        String texto = s.nextLine();

        //número de caracteres (inclui espaços)
        int numCaracteres = texto.length();

        //número de palavras (ignora os espaços)
        String[] palavras = texto.trim().split("\\s+");
        int numPalavras = (texto.isBlank()) ? 0 : palavras.length;

        System.out.println("numero de caracteres: " + numCaracteres);
        System.out.println("numero de palavras: " + numPalavras);

        s.close();
    }
}
