//atividade 5


package AtividadesGpt;

import java.util.Scanner;

public class ContarN {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double num = scanner.nextDouble();
        System.out.println("Número pedido: " + num + "\nComeçando contagem... ");

        for (int i = 1; i <= num; i++) {
            if (i <= num) {
                System.out.println(i);
            }
        }
        System.out.println("\nFim da contagem.");

    }
}
