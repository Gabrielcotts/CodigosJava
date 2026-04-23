package AtividadesGpt.testePOO;

import AtividadesGpt.dominioPOO.Produto;

import java.util.Scanner;

public class ProdutoTest {
    public static void main(String[] args) {

        Produto produtos = new Produto();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do produto: ");
        produtos.nome = scanner.nextLine();

        System.out.println("Digite o valor do produto: ");
        produtos.preco = scanner.nextDouble();

        System.out.println("Digite a quantidade de itens: ");
        produtos.quantidade = scanner.nextInt();


        System.out.println("Produto: " + produtos.nome);
        System.out.println("Preço: " + produtos.preco);
        System.out.println("Quantidade: " + produtos.quantidade);
        System.out.println("Valor total: " + produtos.calcularTotal());

    }
}
