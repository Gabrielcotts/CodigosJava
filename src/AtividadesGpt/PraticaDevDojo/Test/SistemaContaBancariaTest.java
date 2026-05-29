    package AtividadesGpt.PraticaDevDojo.Test;

    import AtividadesGpt.PraticaDevDojo.Dominio.SistemaContaBancaria;

    import java.util.Scanner;

    public class SistemaContaBancariaTest {
        public static void main(String[] args) {
            SistemaContaBancaria sistemaContaBancaria = new SistemaContaBancaria();
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite o titular da conta: ");
            sistemaContaBancaria.setTitular(scanner.nextLine());
            System.out.println("Seja bem-vindo(a) " + sistemaContaBancaria.getTitular());

            int opcao = 0;
            while (true) {

                System.out.println("1 - depositar");
                System.out.println("2 - sacar");
                System.out.println("3 - ver saldo");
                System.out.println("4 - sair");

                opcao = scanner.nextInt();

                if (opcao == 4) {
                    System.out.println("Espero pelo seu retorno " + sistemaContaBancaria.getTitular());
                    System.out.println("Atendimento finalizado!");
                    break;
                }

                switch (opcao) {
                    case 1:
                        System.out.println("Digite o valor do depósito: ");
                        sistemaContaBancaria.depositar(scanner.nextDouble());
                        break;
                    case 2:
                        System.out.println("Digite o valor que deseja sacar: ");
                        sistemaContaBancaria.sacar(scanner.nextDouble());
                        break;
                    case 3:
                        System.out.println("Seu saldo é de R$ " + sistemaContaBancaria.verSaldo());
                        break;
                    default:
                        System.out.println("Opção inválida!");
                        System.out.println("Tente novamente.");
                        break;
                }
            }
            scanner.close();
        }
    }
