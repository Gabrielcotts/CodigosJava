//atividade 1
package AtividadesGpt;

import java.util.Scanner;

public class VerificadorMaiorIdade {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade >= 18 ){
            System.out.println("Olá " + nome + " você é maior de idade! ");
        }else {
            System.out.println("Olá " + nome + " você é menor de idade! ");
        }
    }
}
