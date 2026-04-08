//atividade 2

package AtividadesGpt;

import java.util.Scanner;

public class MenuCalculadora {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- MENU CALCULADORA ---");
            System.out.println("0 - Sair \n1 - Somar \n2 - Subtrair \n3 - Multiplicar\n4 - Dividir");
            System.out.print("Escolha uma das opções acima: ");
            char operador = scanner.next().charAt(0);

            if (operador == '0') {
                System.out.println("Encerrando a calculadora...");
                break;
            }

            System.out.print("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();

            double resultado = 0;

            switch (operador) {
                case '1':
                    resultado = num1 + num2;
                    System.out.println("Resultado da soma : " + resultado);
                    break;

                case '2':
                    resultado = num1 - num2;
                    System.out.println("Resultado da subtração: " + resultado);
                    break;

                case '3':
                    resultado = num1 * num2;
                    System.out.println("Resultado da multiplicação: " + resultado);
                    break;

                case '4':
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println("Resultado da divisão: " + resultado);
                    } else {
                        System.out.println("Erro: Não é possível dividir por zero!");
                    }
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }

        scanner.close();
    }
}