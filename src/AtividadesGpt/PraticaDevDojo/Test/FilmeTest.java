package AtividadesGpt.PraticaDevDojo.Test;

import AtividadesGpt.PraticaDevDojo.Dominio.Filme;

public class FilmeTest {
    public static void main(String[] args) {
        Filme filme2 = new Filme();
        Filme filme = new Filme("Deadpool 1", "ação e comédia", 108);

        filme.imprimeDados();

    }
}
