package AtividadesGpt;

import java.util.Scanner;

public class ContadorDePares {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int contador = 0;

        for (int i = 1; i <= 10; i++) {

            System.out.println("Digite um número:");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                contador++;
            }
        }

        System.out.println("Quantidade de números pares: " + contador);

        scanner.close();
    }
}