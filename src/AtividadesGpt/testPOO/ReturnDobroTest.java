package AtividadesGpt.testePOO;

import AtividadesGpt.dominioPOO.ReturnDobro;

import java.util.Scanner;

public class ReturnDobroTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        ReturnDobro.dobro(numero);
        System.out.println("O dobro do seu número é: " + numero);
    }
}