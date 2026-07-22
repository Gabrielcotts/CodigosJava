package AtividadesGpt.PraticaDevDojo.ZRevision.Test;

import AtividadesGpt.PraticaDevDojo.ZRevision.Dominio.Carro;

import java.util.Scanner;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do carro: ");
        carro.setNome(scanner.nextLine());

        System.out.println("Digite a velocidade máxima do carro: ");
        carro.setVelocidadeMax(scanner.nextFloat());

        Carro.setVelocidadeLimite(180);

        carro.imprimeDados();

    }
}
