package AtividadesGpt.PraticaDevDojo.Test;

import AtividadesGpt.PraticaDevDojo.Dominio.Temperaturas;

public class TemperaturasTest {
    public static void main(String[] args) {
        Temperaturas temperaturas = new Temperaturas();
        System.out.println("Temperaturas registradas: ");
        temperaturas.controleDeTemperaturas(34.1, 12.95, 17, 26.4, -14.6, -1, -6.9);
        temperaturas.imprimeDados();
    }
}
