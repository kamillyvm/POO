package Questao3;
import java.util.ArrayList;
import java.util.Collections;

//SERPRO PRATICA 001
//questão 3

class Main {
    public static void main(String[] args) {
        //instanciar ArrayList de string
        ArrayList<String>  lista = new ArrayList<String>();
        
        //adicionar itens na lista
        lista.add("VERDE");
        lista.add("AZUL");
        lista.add("VERMELHO");
        lista.add("AMARELO");
        lista.add("CINZA");
        
        //quantos elementos tem na lista
        System.out.println(lista.size());
        //iterar sobre lista
        System.out.println(lista.toString());
        //remover elemento do indice 2
        lista.remove(2);
        System.out.println(lista.toString());
        //ordenar crescente (padrão)
        Collections.sort(lista, null);
        System.out.println(lista.toString());
        //ordenar decrescente
        //Collections.sort(lista, Collections.reverseOrder());
        //System.out.println(lista.toString());
        //criar método alterar que recebe a lista, o indice, e a nova cor
        alterar(lista, 2, "BRANCO");
        System.out.println(lista.toString());
        System.out.println("Fim do Programa!");

    }
    
    //método alterar
    public static void alterar(ArrayList<String> listaCores, int indice, String cor) {
        listaCores.set(2, cor);
    }
}
