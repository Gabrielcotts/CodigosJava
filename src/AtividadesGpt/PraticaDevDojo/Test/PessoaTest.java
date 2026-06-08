package AtividadesGpt.PraticaDevDojo.Test;

import AtividadesGpt.PraticaDevDojo.Dominio.Pessoa;

import java.util.Scanner;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        pessoa.setNome(scanner.nextLine());

        System.out.println("Digite sua idade: ");
        pessoa.setIdade(scanner.nextInt());

        if (pessoa.maiorDeIdade()) {
            System.out.println(pessoa.getNome() + " você é maior de idade!");
        } else {
            System.out.println(pessoa.getNome() + " você não é maior de idade!");

        }
    }
}
