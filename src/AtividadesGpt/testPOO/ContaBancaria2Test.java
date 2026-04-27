package AtividadesGpt.testePOO;

import AtividadesGpt.dominioPOO.ContaBancaria2;

import java.util.Scanner;

public class ContaBancaria2Test {
    public static void main(String[] args) {

        ContaBancaria2 contaBancaria2 = new ContaBancaria2();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o titular da conta: ");
        contaBancaria2.titular = scanner.nextLine();
        System.out.println("Bem vindo(a) de volta, " + contaBancaria2.titular +
                "!\nQual das opções abaixo você vai escolher hoje?");

        int opcao;

        while (true) {
            System.out.println("0 - Sair");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Ver saldo");

            opcao = scanner.nextInt();

            if (opcao == 0) {
                System.out.println("Atendimento finalizado!");
                break;
            }
            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor que deseja depositar: ");
                    contaBancaria2.depositar(scanner.nextDouble());
                    break;
                case 2:
                    System.out.println("Digite o valor que deseja sacar: ");
                    contaBancaria2.sacar(scanner.nextDouble());
                    break;
                case 3:
                    System.out.println("Seu saldo é de: " + contaBancaria2.verSaldo());
                    break;

                default:
                        System.out.println("Opção inválida");
                        break;
            }
        }
        scanner.close();
    }
}
