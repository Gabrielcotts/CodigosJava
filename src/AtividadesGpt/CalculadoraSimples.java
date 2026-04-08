//atividade 1

package AtividadesGpt;


import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double primeiroNumero = scanner.nextDouble();

        System.out.print("Digite o operador (+, -, *, /): ");
        char operador = scanner.next().charAt(0);

        System.out.println("Digite o segundo número: ");
        double segundoNumero = scanner.nextDouble();

        double resultado = 0;
        switch (operador) {

            case '+':
                resultado = primeiroNumero + segundoNumero;
                System.out.println(resultado);
                break;

            case '-':
                resultado = primeiroNumero - segundoNumero;
                System.out.println(resultado);
                break;

            case '*':
                resultado = primeiroNumero * segundoNumero;
                System.out.println(resultado);
                break;

            case '/':
                if (segundoNumero != 0) {
                    resultado = primeiroNumero / segundoNumero;
                    System.out.println(resultado);
                } else {
                    System.out.println("Erro por divisão por zero!");
                    return;
                }
                    break;

            default:
                System.out.println("Operador inválido!");
                return;
        }
        System.out.println("Resultado " + resultado);
    }
}
