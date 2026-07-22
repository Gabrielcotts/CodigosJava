package AtividadesGpt.PraticaDevDojo.ZRevision.Dominio;

public class Filme {
    private String nome;
    private String genero;
    private String duracao;

    public Filme(String nome, String genero, String duracao) {
        this.nome = nome;
        this.genero = genero;
        this.duracao = duracao;
    }

    public Filme() {
    }

    public boolean validarNome() {
        return this.nome != null && !this.nome.isEmpty();
    }


    public void imprimeDados() {
        System.out.println("---- DADOS ----");
        if (!this.validarNome()) {
            System.out.println("Nome inválido!");
            return;
        }
        System.out.println("Nome: " + this.nome);
        System.out.println("Gênero: " + this.genero);
        System.out.println("Duração: " + this.duracao);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }
}
