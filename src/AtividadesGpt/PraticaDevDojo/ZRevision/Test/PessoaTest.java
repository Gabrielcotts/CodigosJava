package AtividadesGpt.PraticaDevDojo.ZRevision.Test;

import AtividadesGpt.PraticaDevDojo.ZRevision.Dominio.Pessoa;

import java.util.Scanner;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        pessoa.setNome(scanner.nextLine());

        System.out.println("Digite sua idade: ");
        pessoa.setIdade(scanner.nextInt());

        System.out.println("------------------");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());

        if (pessoa.verificarIdade()) {
            System.out.println("Você é maior de idade");
        } else {
            System.out.println("Você é menor de idade");
        }
        System.out.println("------------------");


    }
}
