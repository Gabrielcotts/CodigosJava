//atividade 5
package AtividadesGpt.TestProduto;

import AtividadesGpt.dominioProduto.Produto;

public class ProdutoTest {
    public static void main(String[] args) {

        Produto produto = new Produto();

        produto.nome = "mouse";
        produto.preço = 47.02;
        produto.quantidade = 3;
        System.out.println("Produto 1:");
        System.out.println("Nome do produto - " + produto.nome + "\nPreço do produto - R$ " + produto.preço + "\nQuantidade do produto - " + produto.quantidade);


        Produto produto2 = new Produto();
        produto2.nome = "teclado";
        produto2.preço = 61.99;
        produto2.quantidade = 2;
        System.out.println("\nProduto 2");
        System.out.println("Nome do produto - " + produto2.nome + "\nPreço do produto - R$ " + produto2.preço + "\nQuantidade do produto - " + produto2.quantidade);
    }
}
