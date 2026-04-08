//atividade 2

package AtividadesGpt;

import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int tabuada = scanner.nextInt();


        for (int i = 1; i <= 10; i++) {
            System.out.println(tabuada + " x " + i + " = " + (tabuada * i));
        }
        scanner.close();
    }
}
