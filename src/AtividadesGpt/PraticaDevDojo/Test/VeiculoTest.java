package AtividadesGpt.PraticaDevDojo.Test;

import AtividadesGpt.PraticaDevDojo.Dominio.Veiculo;

public class VeiculoTest {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo("Toro");
        Veiculo veiculo2 = new Veiculo("Toro", "Fiat");
        Veiculo veiculo3 = new Veiculo("Toro", "Fiat", 2024);
        Veiculo veiculo4 = new Veiculo();

        veiculo1.imprimeDados();
        System.out.println(" ");
        veiculo2.imprimeDados();
        System.out.println(" ");
        veiculo3.imprimeDados();
        System.out.println(" ");
        veiculo4.imprimeDados();


    }
}
