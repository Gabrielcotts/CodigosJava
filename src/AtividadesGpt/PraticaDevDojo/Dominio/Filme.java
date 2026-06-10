package AtividadesGpt.PraticaDevDojo.Dominio;

public class Filme {
    private String nome;
    private String genero;
    private float duracao;


    public Filme(String nome, String genero, float duracao) {
        this.nome = nome;
        this.genero = genero;
        this.duracao = duracao;
    }

    public Filme() {
        System.out.println("Dentro do construtor");
    }

    public void imprimeDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Gênero: " + this.genero);
        System.out.println("Duração: " + this.duracao + " minutos");
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setDuracao(float duracao) {
        this.duracao = duracao;
    }

    public float getDuracao() {
        return this.duracao;
    }


}
