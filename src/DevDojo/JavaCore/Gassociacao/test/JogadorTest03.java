package DevDojo.JavaCore.Gassociacao.test;

import DevDojo.JavaCore.Gassociacao.dominio.Jogador;
import DevDojo.JavaCore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Cafu");
        Jogador jogador2 = new Jogador("Pelé");
        Time time = new Time("Brasil");
        Jogador[] jogadores = {jogador, jogador2};

        jogador.setTime(time);
        jogador2.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("--- Jogador ---");
        jogador.imprimeDados();

        System.out.println("--- Time ---");
        time.imprime();

    }
}
