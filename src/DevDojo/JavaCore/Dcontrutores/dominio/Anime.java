package DevDojo.Javacore.Dcontrutores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private String genero;
    private int episodio;

/*Construtor não recebe retorno de nada! Se tem retorno é metodo!*/
    public Anime(String nome, String tipo, String genero, int episodio){
        System.out.println("Dentro do construtor");
        this.nome = nome;
        this.tipo = tipo;
        this.genero = genero;
        this.episodio = episodio;
    }

    /*Sobrecarga de construtores!*/
    public Anime(){

    }

    public void imprime() {

        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.genero);
        System.out.println(this.episodio);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setEpisodio(int episodio) {
        this.episodio = episodio;
    }

    public int getEpisodio() {
        return this.episodio;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}