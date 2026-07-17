package DevDojo.JavaCore.Gassociacao.test;

import java.util.Scanner;

public class BolaDeCristal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("--- Software de previsão do futuro ---\n");

            System.out.println("Escolha uma opção: ");
            System.out.println("1 - Jogar");
            System.out.println("2 - Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 2){
                System.out.println("Encerrando programa.");
                break;
            }

            switch (opcao) {
                case 1:
                    System.out.println("\nDigite sua pergunta e eu responderei sim ou não");
                    String pergunta = scanner.nextLine();

                    if (pergunta.length() > 0 && pergunta.charAt(0) == ' ') {
                        System.out.println("SIM\n");
                    } else {
                        System.out.println("NÃO\n");
                    }
                    break;

                default:
                    System.out.println("Opção inválida");
            }
        }
    }
}
