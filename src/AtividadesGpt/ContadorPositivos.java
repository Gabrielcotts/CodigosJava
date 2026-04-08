package AtividadesGpt;

import java.util.Scanner;

public class ContadorPositivos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("----Digite 5 números----\n ");

        System.out.println("Digite um número: ");
        double num1 = scanner.nextDouble();
        System.out.println("Digite um número: ");
        double num2 = scanner.nextDouble();
        System.out.println("Digite um número: ");
        double num3 = scanner.nextDouble();
        System.out.println("Digite um número: ");
        double num4 = scanner.nextDouble();
        System.out.println("Digite um número: ");
        double num5 = scanner.nextDouble();

        int zero = 0;
        if (num1 > zero && num2 > zero && num3 > zero && num4 > zero && num5 > zero){
            System.out.println("Positivo");
        } else if (zero == 0) {
            System.out.println("Zero");
        } else {
            System.out.println("Negativo");
        }
    }
}
