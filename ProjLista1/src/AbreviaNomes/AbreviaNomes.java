package AbreviaNomes;

public class AbreviaNomes {
    private String nome;

    public AbreviaNomes(String nome) {
        this.nome = nome;
    }

    public String abreviar() {
        String[] partes = nome.split(" ");
        String resultado = "";
        for (String p : partes) {
            if (p.length() > 2) {
                resultado += p.toUpperCase().charAt(0) + ". ";
            } else {
                resultado += p.toLowerCase() + " ";
            }
        }
        return resultado.trim();
    }
}
