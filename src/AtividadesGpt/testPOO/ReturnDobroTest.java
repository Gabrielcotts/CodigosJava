package AtividadesGpt.testePOO;

import AtividadesGpt.dominioPOO.ReturnDobro;

import java.util.Scanner;

public class ReturnDobroTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        System.out.println("O dobro do seu número é: " + ReturnDobro.dobro(numero));
    }
}
