package Atividades.testePOO;

import Atividades.dominioPOO.PraticandoMetodoBoolean;
import java.util.Scanner;

public class PraticandoMetodoBooleanTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        if (!PraticandoMetodoBoolean.numeroPositivo(numero)) {
            System.out.println("Erro: Número não pode ser menor ou igual a zero");
        } else {
            System.out.println("Número digitado: " + numero);
        }

        scanner.close();
    }
}
