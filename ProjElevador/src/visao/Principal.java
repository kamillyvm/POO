package visao;
import java.util.Scanner;
import aplicacao.Elevador;

public class Principal {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
		Elevador e = new Elevador(); 
		int op, cap, andar;

        System.out.println("digite a capacidade do elevador: ");
		cap = s.nextInt();
		System.out.println("digite quantos andares tem no predio: ");
		andar = s.nextInt();
				
		e.inicializa(cap, andar);

        do {
            System.out.println("Menu Elevador");
            System.out.println("1 - entrar pessoa");
            System.out.println("2 - sair pessoa");
            System.out.println("3 - subir andar");
            System.out.println("4 - descer andar");
            System.out.println("5 - sair");
            System.out.print("escolha uma opcao: ");
            op = s.nextInt();

            switch (opcao) {
                case 1 -> {
                    if (elevador.entra()) {
                        System.out.println("✅ Uma pessoa entrou.");
                    } else {
                        System.out.println("⚠️ Elevador cheio!");
                    }
                }
                case 2 -> {
                    if (elevador.sai()) {
                        System.out.println("✅ Uma pessoa saiu.");
                    } else {
                        System.out.println("⚠️ Elevador vazio!");
                    }
                }
                case 3 -> {
                    if (elevador.sobe()) {
                        System.out.println("✅ Subiu um andar.");
                    } else {
                        System.out.println("⚠️ Já está no último andar!");
                    }
                }
                case 4 -> {
                    if (elevador.desce()) {
                        System.out.println("✅ Desceu um andar.");
                    } else {
                        System.out.println("⚠️ Já está no térreo!");
                    }
                }
                case 5 -> {
                    System.out.println("📊 Status do Elevador:");
                    System.out.println("Andar atual: " + elevador.getAndarAtual());
                    System.out.println("Pessoas: " + elevador.getQtdPessoas() + "/" + capacidade);
                }
                case 0 -> System.out.println("Encerrando programa...");
                default -> System.out.println("❌ Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();
        
    }
}
