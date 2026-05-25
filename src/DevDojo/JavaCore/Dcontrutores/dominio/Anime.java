package DevDojo.Javacore.Dcontrutores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private String genero;
    private int episodio;
    private String estudio;

    /*Construtor não recebe retorno de nada! Se tem retorno é metodo!*/
    public Anime(String nome, String tipo, String genero, int episodio) {
        this(); //Só pode ser chamado desse jeito dentro de contrutores
        this.nome = nome;
        this.tipo = tipo;
        this.genero = genero;
        this.episodio = episodio;
    }

    public Anime(String nome, String tipo, String genero, int episodio, String estudio) {
        this(nome, tipo, genero, episodio); /*Para usar esse this em contrutores, ele
                                            obrigatoriamente precisa ser ZZa primeira linha executável */
        this.estudio = estudio;
    }

    /*Sobrecarga de construtores!*/
    public Anime() {
        System.out.println("Dentro do construtor sem argumentos!");
    }

    public void imprime() {

        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.genero);
        System.out.println(this.episodio);
        System.out.println(this.estudio);
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
