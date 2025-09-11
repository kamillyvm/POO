package NumExtenso;

import java.util.Scanner;

public class NumExtenso {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("digite um numero inteiro: ");
        int numero = s.nextInt();

        String[] extenso = {
            "zero", "um", "dois", "tres", "quatro",
            "cinco", "seis", "sete", "oito", "nove"
        };

        //transforma o número em string para pegar dígito por dígito
        String numStr = String.valueOf(numero);

        System.out.print("saida: ");
        for (int i = 0; i < numStr.length(); i++) {
            char c = numStr.charAt(i);
            int digito = Character.getNumericValue(c);
            System.out.print(extenso[digito]);
            if (i < numStr.length() - 1) {
                System.out.print(", ");
            }
        }

        s.close();
    }
}

