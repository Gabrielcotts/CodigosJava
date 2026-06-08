package AtividadesGpt.PraticaDevDojo.Test;

import AtividadesGpt.PraticaDevDojo.Dominio.SalarioFuncionario;

import java.util.Scanner;

public class SalarioFuncionarioTest {
    public static void main(String[] args) {

        SalarioFuncionario salarioFuncionario = new SalarioFuncionario();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        salarioFuncionario.setNome(scanner.nextLine());

        System.out.print("Digite seu salário bruto: R$ ");
        salarioFuncionario.setSalarioBruto(scanner.nextDouble());
        System.out.println(salarioFuncionario.getNome() + " seu sálario líquido é R$ " + salarioFuncionario.calcularSalarioLiquido());

    }
}
