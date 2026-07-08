package DevDojo.JavaCore.Gassociacao.test;

import DevDojo.JavaCore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Ronaldo Fenômeno");
        Jogador jogador2 = new Jogador("Halland");
        Jogador jogador3 = new Jogador("Ronaldinho");

        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        //        Jogador[] jogadores = new Jogador[3];
        //        jogadores[0] = jogador1;
        //        jogadores[1] = jogador2;
        //        jogadores[2] = jogador3;

        for (Jogador jogador : jogadores) {
            if (jogador != null) {
                jogador.imprimeDados();

            }
        }
    }
}
