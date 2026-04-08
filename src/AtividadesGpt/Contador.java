//atividade 1
package AtividadesGpt;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int soma = 0;
        int num;

        while (true) {
            System.out.println("Digite um número: ");
            num = scanner.nextInt();
            soma += num;

            if (num == 0){
                break;
            }
        }
        System.out.println("A soma dos números que você digitou é igual a " + soma );
    }
}