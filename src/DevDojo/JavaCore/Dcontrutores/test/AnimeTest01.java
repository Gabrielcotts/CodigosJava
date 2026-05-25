package DevDojo.Javacore.Dcontrutores.test;

import DevDojo.Javacore.Dcontrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Dragon ball", "TV",  "ação", 800, "Production IG");
        Anime anime2 = new Anime();

        anime.imprime();
        anime2.imprime();

    }
}
