//Isso é uma demonstração de sobrecarga de método
package DevDojo.Javacore.Csobrecargametodos.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private String genero;
    private int episodio;


    public void inicialização(String nome, String tipo, String genero) {
        this.nome = nome;
        this.tipo = tipo;
        this.genero = genero;
    }

    public void inicialização(String nome, String tipo, String genero, int episodio) {
        this.inicialização(nome, tipo, genero);
        this.episodio = episodio;
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