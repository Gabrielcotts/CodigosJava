package AtividadesGpt.PraticaDevDojo.ZRevision.Test;

import AtividadesGpt.PraticaDevDojo.ZRevision.Dominio.Funcionario;

import java.util.Scanner;

public class FuncionarioTest {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        funcionario.setNome(scanner.nextLine());

        System.out.println("Digite seu cargo: ");
        funcionario.setCargo(scanner.nextLine());

        System.out.println("Digite seu salário: ");
        funcionario.setSalario(scanner.nextDouble());

        funcionario.imprimeDados();
    }
}
