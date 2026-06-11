package AtividadesGpt.PraticaDevDojo.Test;

import AtividadesGpt.PraticaDevDojo.Dominio.Ingresso;

import java.util.Scanner;

public class IngressoTest {
    public static void main(String[] args) {

        Ingresso ingresso = new Ingresso();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seja bem-vindo ao nosso site de desconto!\n");

        System.out.println("Por favor, digite o nome do evento que você deseja: ");
        ingresso.setNomeEvento(scanner.nextLine());

        System.out.println("Você escolheu o evento: " + ingresso.getNomeEvento());

        System.out.println("Agora, digite o valor do ingresso: ");

        boolean valorValido = ingresso.setValor(scanner.nextFloat());

        if (!valorValido) {
            System.out.println(
             "Ops, parece que houve um engano. Os valores dos nossos ingressos são a partir de R$ 100,00."
            );
            scanner.close();
            return;
        }

        System.out.println("Valor do ingresso: R$ " + ingresso.getValor());

        System.out.println("Por fim, digite o desconto a ser aplicado: ");
        float percentual = scanner.nextFloat();

        float valorFinal = ingresso.aplicarDesconto(percentual);

        System.out.println("Valor final do ingresso: R$ " + valorFinal);

        scanner.close();
    }
}