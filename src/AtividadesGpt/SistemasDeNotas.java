//atividade 6

package AtividadesGpt;

import java.util.Scanner;

public class SistemasDeNotas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        double[] nota = new double[4];

        nota[0] = 9.1;
        nota[1] = 5.9;
        nota[2] = 7.6;
        nota[3] = 3.7;

        double soma = 0;

        for (int i = 0; i < nota.length; i++) {
            soma = soma + nota[i];
        }
        double media = soma / 4; if (media >= 7){
            System.out.println("Aprovado\n" + nome + " está com a média " + media );
        } else if (media < 7 && media > 5) {
            System.out.println("Recuperação\n" + nome + " está com a média " + media );
        } else {
            System.out.println("Reprovado\n" + nome + " está com a média " + media );
        }
    }
}
