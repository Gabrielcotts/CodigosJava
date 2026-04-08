//atividade 4


package AtividadesGpt;

import java.util.Scanner;

public class NotaMedia {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeiro nota: ");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("Sua média é:  " + media);

        if (media > 7) {
            System.out.println("aprovado");
        } else if (media >= 5 ) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

    }
}
