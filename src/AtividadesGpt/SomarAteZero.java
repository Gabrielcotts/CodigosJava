package AtividadesGpt;

import java.util.Scanner;

public class
SomarAteZero {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o primeiro número: ");
        double num2 = scanner.nextDouble();

        double resultado = num1 + num2;

        for (int i = 0; i < resultado; i++) {
            if (resultado != 10) {
                System.out.println("Código interrompido");
                return;
            }
        }
    }
}
