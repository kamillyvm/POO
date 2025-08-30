package GeraEmailsInstitucionais;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        GeraEmailsInstitucionais[] lista = new GeraEmailsInstitucionais[5]; // 5 para teste, são 20

        System.out.println("Digite os nomes completos:");
        for (int i = 0; i < lista.length; i++) {
            String nome = s.nextLine();
            lista[i] = new GeraEmailsInstitucionais(nome);
        }

        System.out.println("\nE-mails gerados:");
        for (GeraEmailsInstitucionais g : lista) {
            System.out.println(g.gerarEmail());
        }
    }
}
