package visao;
import java.util.Scanner;
import aplicacao.Elevador;

public class Principal {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
		Elevador e = new Elevador();
		int op, cap, andar, destino;

        System.out.println("digite a capacidade do elevador: ");
		cap = s.nextInt();
		System.out.println("digite quantos andares tem no predio: ");
		andar = s.nextInt();
        System.out.print("digite o andar de destino: ");
        destino = s.nextInt();
				
		e.inicializa(cap, andar);

        do {
            System.out.println("Menu Elevador");
            System.out.println("1 - entrar pessoa");
            System.out.println("2 - sair pessoa");
            System.out.println("3 - subir andar");
            System.out.println("4 - descer andar");
            System.out.println("5 - sair");
            System.out.println("6 - deslocar para um andar desejado");
            System.out.print("escolha uma opcao: ");
            op = s.nextInt();

            switch (op) {
                case 1:
                    if(e.entrarPessoas()) {
                        System.out.println("uma pessoa entrou.");
                    }else{
                        System.out.println("elevador cheio!");
                    }

                case 2:
                    if(e.sairPessoas()) {
                        System.out.println("uma pessoa saiu.");
                    }else{
                        System.out.println("elevador vazio!");
                    }
                case 3:
                    if(e.subir()) {
                        System.out.println("subiu um andar.");
                    }else{
                        System.out.println("já está no último andar!");
                    }

                case 4:
                    if(e.descer()) {
                        System.out.println("desceu um andar.");
                    }else{
                        System.out.println("já está no térreo!");
                    }
                case 5:
                    System.out.println("opcao sair escolhida. encerrando programa.");
                    
                case 6:
                    e.deslocar(destino);

                default: System.out.println("opcao invalida");
            }
        }while(op != 5);

        s.close();
        
    }
}
