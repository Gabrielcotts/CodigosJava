package DevDojo.Javacore.Csobrecargametodos.test;

import DevDojo.Javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();


     /* anime.setNome("Naruto");
        anime.setTipo("TV");
        anime.setEpisodio(12); */

        anime.inicialização("Naruto", "TV",  "ação", 12);
        anime.imprime();

    }
}