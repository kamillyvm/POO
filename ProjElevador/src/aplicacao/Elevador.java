package aplicacao;

public class Elevador {
    private int andarAtual;
    private int totalAndares;
    private int capacidadeMax;
    private int qtdPessoas;

    //inicializa
    public void inicializa(int totalAndares, int capacidadeMax) {
        this.totalAndares = totalAndares;
        this.capacidadeMax = capacidadeMax;
        this.andarAtual = 0; //térreo
        this.qtdPessoas = 0; //vazio
    }

    public boolean entrarPessoas() {
        if(qtdPessoas < capacidadeMax){
            qtdPessoas++;
            return true;
        }
        return false;
    }

    public boolean sairPessoas() {
        if(qtdPessoas > 0){
            qtdPessoas--;
            return true;
        }
        return false;
    }

    public boolean subir() {
        if(andarAtual < totalAndares){
            andarAtual++;
            return true;
        }
        return false;
    }

    public boolean descer() {
        if(andarAtual > 0){
            andarAtual--;
            return true;
        }
        return false;
    }

    //parte extra: mover o elevador do andar atual até o andar desejado
    public void deslocar(int andar) {
        if(andar < 0 || andar > totalAndares) {
            System.out.println("andar invalido");
            return;
        }

        while(andarAtual != andar) {
            if(andarAtual < andar) {
                andarAtual++;
            }else{
                andarAtual--;
            }

            System.out.println("andar atual: " + andarAtual);

            //parte do código que pode gerar erro
            try{
                Thread.sleep(1000); // pausa de 1s
            }catch(InterruptedException e) { //se o erro acontecer
                e.printStackTrace();
            }
        }
        System.out.println("chegou ao andar " + andarAtual);
    }

}

