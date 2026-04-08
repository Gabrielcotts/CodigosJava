package DevDojo.Introdução;

import java.util.Scanner;

public class EstruturaBreakAtividade {
    //Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
    //Condição valorDaParcela >= 1000
    static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o valor do carro: ");
        double valorTotalCar = scanner.nextDouble();
        System.out.println("Valor total do carro: " + valorTotalCar);


        for (int parcela = 1; parcela <= valorTotalCar; parcela++) {
            double valorParcela = valorTotalCar / parcela;
            double valorComJuros = valorTotalCar * Math.pow(1.02, parcela);
            valorParcela = valorComJuros / parcela;

            double valorTotalPago = valorParcela * parcela;

            if (valorParcela >= 1000 && !(parcela > 24)) {
                System.out.println("Parcela " + parcela + " R$ " + valorParcela);
                System.out.println("Valor total a pagar com juros de 2% por ao mês: " + valorTotalPago);
            } else {
                break;
            }
        }
    }
}
