import AtividadesGpt.dominioPOO.Pessoa;

import java.util.Scanner;

public class CadastroPessoa {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Pessoa[] pessoas = new Pessoa[3];
        System.out.println("-----CADASTRO-----\n");

        for (int i = 0; i < pessoas.length; i++) {

            pessoas[i] = new Pessoa();


            System.out.println("Digite o nome:");
            pessoas[i].nome = scanner.nextLine();

            System.out.println("Digite a idade:");
            pessoas[i].idade = scanner.nextInt();
            scanner.nextLine();
        }

        for (int i = 0; i < pessoas.length; i++) {

            System.out.println("Pessoa " + (i+1));
            System.out.println("Nome: " + pessoas[i].nome);
            System.out.println("Idade: " + pessoas[i].idade);
        }

        scanner.close();
    }
}
