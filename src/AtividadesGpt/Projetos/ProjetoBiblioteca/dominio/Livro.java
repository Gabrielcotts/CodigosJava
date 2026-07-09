package AtividadesGpt.Projetos.ProjetoBiblioteca.dominio;

public class Livro {

    private String titulo;
    private Autor autor;
    private int numeroPaginas;
    private int anoPublicacao;
    private boolean disponibilidade;

    public Livro(String titulo, Autor autor,
                 int quantidadePaginas, int anoPublicacao, boolean disponibilidade) {
        this();
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = quantidadePaginas;
        this.anoPublicacao = anoPublicacao;
        this.disponibilidade = disponibilidade;
    }

    public Livro() {
    }

    public boolean emprestarLivro() {
        if (disponibilidade) {
            disponibilidade = false;
            System.out.println("Livro emprestado com sucesso!");
            return true;
        } else {
            System.out.println("Livro indisponível!");
            return false;
        }
    }

    public boolean devolverLivro() {
        if (!this.disponibilidade) {
            this.disponibilidade = true;
            System.out.println("Livro devolvido com sucesso!");
            return true;
        } else {
            System.out.println("Esse livro já foi devolvido!");
            return false;
        }
    }

    public boolean validarNumeroPaginas() {
      return this.numeroPaginas >= 49;
    }
    public boolean validarNome(){
        return this.titulo != null && !this.titulo.isEmpty();
    }
    public boolean validarAutor(){
        return this.autor != null;
    }


    public void imprimeDados() {
        System.out.println("--- Dados do livro ---");
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: ");
        this.autor.imprimeDadosAutor();
        System.out.println("Número de páginas: " + this.numeroPaginas);
        System.out.println("Ano de publicação: " + this.anoPublicacao);
        System.out.println("Disponibilidade: " + this.disponibilidade);
    }



    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
}