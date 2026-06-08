package AtividadesGpt.PraticaDevDojo.Dominio;

public class Biblioteca {

    public boolean regras(int quantidadePaginas) {
        return quantidadePaginas >= 0 && quantidadePaginas != 0;
    }

    public void imprimirInformacoes(String titulo, String autor, int quantidadePaginas) {
        System.out.println("Título - " + titulo);
        System.out.println("Autor - " + autor);

        if (regras(quantidadePaginas)) {
            System.out.println("Informações do livro: ");
            System.out.println("Quantidades de páginas - " + quantidadePaginas + " páginas");
        } else {
            System.out.println("Essa página é inexistente");
        }
    }

}