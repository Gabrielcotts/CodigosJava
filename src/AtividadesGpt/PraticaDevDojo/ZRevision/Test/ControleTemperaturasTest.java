package AtividadesGpt.PraticaDevDojo.ZRevision.test;

import AtividadesGpt.PraticaDevDojo.ZRevision.dominio.ControleTemperaturas;

import java.util.Scanner;

public class ControleTemperaturasTest {
    public static void main(String[] args) {
        ControleTemperaturas controleTemperaturas = new ControleTemperaturas();
        Scanner scanner = new Scanner(System.in);

        double[] temperaturasDigitadas = new double[7];

        System.out.println("Digite sete temperaturas: ");

        for (int i = 0; i < temperaturasDigitadas.length; i++) {
            System.out.println("Temperatura " + (i + 1));
            temperaturasDigitadas[i] = scanner.nextDouble();
        }

        controleTemperaturas.setTemperaturas(temperaturasDigitadas);

        controleTemperaturas.imprimeDados();
    }
}