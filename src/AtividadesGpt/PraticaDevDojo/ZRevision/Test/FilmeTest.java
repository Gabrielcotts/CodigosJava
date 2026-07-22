package AtividadesGpt.PraticaDevDojo.ZRevision.Test;

import AtividadesGpt.PraticaDevDojo.ZRevision.Dominio.Filme;

import java.util.Scanner;

public class FilmeTest {
    public static void main(String[] args) {
        Filme filme = new Filme();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do filme: ");
        filme.setNome(scanner.nextLine());

        System.out.println("Digite o gênero do filme: ");
        filme.setGenero(scanner.nextLine());

        System.out.println("Digite a duração do filme: ");
        filme.setDuracao(scanner.nextLine());

        filme.imprimeDados();
    }
}
