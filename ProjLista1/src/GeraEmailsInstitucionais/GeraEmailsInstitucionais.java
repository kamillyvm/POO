package GeraEmailsInstitucionais;

//exercício 1
public class GeraEmailsInstitucionais {
    private String nome;

    public GeraEmailsInstitucionais(String nome) {
        this.nome = nome;
    }

    public String gerarEmail() {
        String[] partes = nome.toLowerCase().trim().split(" ");
        return partes[0] + "." + partes[partes.length - 1] + "@ufrn.br";
    }
}