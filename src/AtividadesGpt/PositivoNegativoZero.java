//atividade 1

package AtividadesGpt;

import java.util.Scanner;

public class PositivoNegativoZero {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double positivoNegativoZero = scanner.nextDouble();


        if (positivoNegativoZero > 0) {
            System.out.println(positivoNegativoZero + " é positivo");
        } else if (positivoNegativoZero < 0) {
            System.out.println(positivoNegativoZero + " é negativo");

        } else {
            System.out.println(positivoNegativoZero + " é zero");
        }
    }
}

