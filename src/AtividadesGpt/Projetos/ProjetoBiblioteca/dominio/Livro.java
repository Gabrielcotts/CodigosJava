package AtividadesGpt.Projetos.ProjetoBiblioteca.dominio;

public class Livro {

    private String titulo;
    private String autor;
    private String categoria ;
    private int quantidadePaginas ;
    private int anoPublicacao;
    private String disponibilidade;

    public Livro(String titulo, String autor, String categoria,
                 int quantidadePaginas, int anoPublicacao, String disponibilidade){
       this();
       this.titulo = titulo;
       this.autor = autor;
       this.categoria = categoria;
       this.quantidadePaginas = quantidadePaginas;
       this.anoPublicacao = anoPublicacao;
       this.disponibilidade = disponibilidade;
    }

    public Livro(){}

    public boolean validarTitulo(){
        return this.titulo != null || !this.titulo.isEmpty();
    }
    public boolean validarAutor(){
        return this.autor != null || !this.autor.isEmpty();
    }
    public boolean validarQuantidadePaginas(){
        return this.quantidadePaginas > 0;
    }

    public void imprimeDados(){
        System.out.println("--- Cadastro ---");
        System.out.println("Título do livro: " + this.titulo);
        System.out.println("Autor do livro: " + this.autor);
        System.out.println("Categoria do livro: " + this.categoria);
        System.out.println("Quantidades de páginas do livro: " + this.quantidadePaginas);
        System.out.println("Ano de publicação do livro: " + this.anoPublicacao);
        System.out.println("Disponibilidade do livro: " + this.disponibilidade);
    }

    public boolean validarAnoPublicacao(){
        return this.anoPublicacao <= 2026 && this.anoPublicacao >= 1455;
    }

    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getQuantidadePaginas() {
        return quantidadePaginas;
    }
    public void setQuantidadePaginas(int quantidadePaginas) {
        this.quantidadePaginas = quantidadePaginas;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }
    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public String getDisponibilidade() {
        return disponibilidade;
    }
    public void setDisponibilidade(String disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
}