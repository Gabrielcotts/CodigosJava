package AtividadesGpt.Projetos.ProjetoBiblioteca.dominio;

public class Biblioteca {
    private int capacidadeMax = 100;
    private Livro[] livros = new Livro[capacidadeMax];
    private int quantidadeLivros = 0;

    public boolean cadastrarLivro(Livro novoLivro) {
        if (quantidadeLivros < capacidadeMax) {
            livros[quantidadeLivros] = novoLivro;
            quantidadeLivros++;
            System.out.println("Livro cadastrado com sucesso!");
            return true;
        } else {
            System.out.println("Biblioteca sem espaço para novos livros!");
            return false;
        }

    }

    public void mostrarTodosLivros() {

        for (int i = 0; i < quantidadeLivros ; i++) {
            System.out.println("Livro " + (i + 1));
            livros[i].imprimeDados();
            System.out.println();
        }

    }


    public void mostrarLivrosDisponiveis() {
    }

    public void mostrarLivrosEmprestados() {
    }

    public void totalLivrosCadastrados() {
    }

}
