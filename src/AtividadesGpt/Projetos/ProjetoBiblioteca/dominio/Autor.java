package AtividadesGpt.Projetos.ProjetoBiblioteca.dominio;

public class Autor {
    private String nome;
    private String nacionalidade;

    public Autor(String nome, String nacionalidade) {
        this();
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }

    public Autor() {
    }

    public void imprimeDadosAutor() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Nacionalidade: " + this.nacionalidade);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }

    public void setNacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
    }
    public String getNacionalidade(){
        return this.nacionalidade;
    }
}
