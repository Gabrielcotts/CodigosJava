package Atividades.testePOO;

import Atividades.dominioPOO.MiniMercado;

import java.util.Scanner;

public class MiniMercadoTeste {
    public static void main(String[] args) {

        MiniMercado miniMercado = new MiniMercado();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do produto: ");
        miniMercado.nomeProduto = scanner.nextLine();
        System.out.println("Produto: " + miniMercado.nomeProduto + "\n");

        System.out.println("Digite o preço do produto: ");
        miniMercado.precoProduto = scanner.nextFloat();
        System.out.println("Preço: " + miniMercado.precoProduto + "\n");

        System.out.println("Digite a quantidade do produto: ");
        miniMercado.qntdProduto = scanner.nextInt();
        System.out.println("Quantidade: " + miniMercado.qntdProduto + "\n");

        float valorTotal = miniMercado.precoProduto * miniMercado.qntdProduto;

        if (miniMercado.precoProduto == 0) {
            System.out.println("Erro: não temos produto nesse valor!");
        } else if (miniMercado.qntdProduto == 0) {
            System.out.println("Erro: não vendemos essa Qntd!");
        } else {
            System.out.println("Descrição de produtos: ");
            System.out.println("Nome do produto: " + miniMercado.nomeProduto);
            System.out.println("Valor do produto: " + miniMercado.precoProduto);
            System.out.println("Quantidade do produto: " + miniMercado.qntdProduto);
            System.out.println("Valor total do produto: " + valorTotal);
        }
        scanner.close();
    }
}
