package AtividadesGpt.PraticaDevDojo.ZRevision.test;

import AtividadesGpt.PraticaDevDojo.ZRevision.dominio.Player;

import java.util.Scanner;

public class PlayerTest {
    public static void main(String[] args) {
        Player player = new Player();
        Scanner scanner = new Scanner(System.in);

        Player[] players = {player};

        for (Player player1 : players) {
            if (player1 != null) {
                System.out.println(player1);
                player.setPlayer(player.getPlayer());
                player.imprimeDados();
            }
        }
        scanner.close();
    }
}
