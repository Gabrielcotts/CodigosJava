package AtividadesGpt.PraticaDevDojo.ZRevision.Test;

import AtividadesGpt.PraticaDevDojo.ZRevision.Dominio.Veiculo;

import java.util.Scanner;

public class VeiculoTest {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o modelo do veículo: ");
        veiculo.setModelo(scanner.nextLine());

        System.out.println("Digite a marca do veículo: ");
        veiculo.setMarca(scanner.nextLine());

        System.out.println("Digite o ano do veículo: ");
        veiculo.setAno(scanner.nextInt());

        veiculo.imprimeDados();

    }
}
