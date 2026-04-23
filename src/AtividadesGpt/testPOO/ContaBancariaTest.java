package AtividadesGpt.testePOO;

import AtividadesGpt.dominioPOO.ContaBancaria;

import java.util.Scanner;

public class ContaBancariaTest {
    public static void main(String[] args) {

        ContaBancaria contaBancaria = new ContaBancaria();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o titular da conta: ");
        contaBancaria.titular = scanner.nextLine();

        contaBancaria.saldo = 1000;
        int opcao;

        while (true) {
            System.out.println("0 - Encerrar atendimento");
            System.out.println("1 - Depósito");
            System.out.println("2 - Saque");
            System.out.println("3 - Ver saldo");

            opcao = scanner.nextInt();

            if (opcao == 0) {
                System.out.println("Finalizando atendimento!");
                break;
            }

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor que deseja depositar: ");
                    contaBancaria.depositar(scanner.nextDouble());
                    break;

                case 2:
                    System.out.println("Digite o valor que deseja sacar: ");
                    contaBancaria.sacar(scanner.nextDouble());
                    break;

                case 3:
                    System.out.println("Seu saldo atual: " + contaBancaria.saldo);
                    break;

                default:
                    break;
            }
        }
    }
}
