package LógicaDeProgramação;

public class Calculadora {
    public static void main(String[] args) {
        double num1 = 16;
        double num2 = 10;
        double numRaiz2 = 0.5; // Usado somente para calcular raiz quadrada //

        char operador = '*';

        double resultado = 0;

        switch (operador) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Erro: Divisão por zero!");
                    return;
                }
                break;
            case '%':
                resultado = num1 * (num2 / 100);
                break;
            case '^': // Caso para exponenciação
                resultado = Math.pow(num1, num2);
                break;
            case '\\':
                resultado = Math.pow(num1, (numRaiz2));
                break;
            case '~':
                resultado = Math.cbrt(num1);
                break;
            default:
                System.out.println("Operador inválido!");
                return;
        }

        System.out.println("Resultado: " + resultado);
    }
}