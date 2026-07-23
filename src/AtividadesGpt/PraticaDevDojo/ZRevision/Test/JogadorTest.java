package AtividadesGpt.PraticaDevDojo.ZRevision.test;

import AtividadesGpt.PraticaDevDojo.ZRevision.dominio.Jogador;

import java.util.Scanner;

public class JogadorTest {
    public static void main(String[] args) {
        Jogador jogador = new Jogador();
        Scanner scanner = new Scanner(System.in);

        String[] nomeJogador = new String[11];

        System.out.println("--- JOGADORES ---");
        for (int i = 0; i < nomeJogador.length; i++) {
            System.out.println("Nome do jogador " + (i + 1));
            nomeJogador[i] = scanner.nextLine();
        }

        jogador.setNome(nomeJogador);

        jogador.imprimeDados();

        scanner.close();
    }
}
