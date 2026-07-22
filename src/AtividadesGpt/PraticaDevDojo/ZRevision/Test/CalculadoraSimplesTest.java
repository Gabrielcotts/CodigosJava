package AtividadesGpt.PraticaDevDojo.ZRevision.test;

import AtividadesGpt.PraticaDevDojo.ZRevision.dominio.CalculadoraSimples;

import java.util.Scanner;

public class CalculadoraSimplesTest {
    public static void main(String[] args) {
        CalculadoraSimples calculadoraSimples = new CalculadoraSimples();
        Scanner scanner = new Scanner(System.in);


        System.out.println("-------");

        while (true) {
            System.out.println("Escolha uma opção: ");

            System.out.println("1 - SOMA");
            System.out.println("2 - SUBTRAÇÃO");
            System.out.println("3 - MULTIPLICAÇÃO");
            System.out.println("4 - DIVISÃO");
            System.out.println("0 - SAIR");

            int opcao = scanner.nextInt();

            if (opcao == 0){
                System.out.println("Programa finalizado!");
                break;
            }

            switch (opcao) {
                case 1:
                    System.out.println("Digite um número. ");
                    calculadoraSimples.setA(scanner.nextDouble());
                    System.out.println("Digite outro número. ");
                    calculadoraSimples.setB(scanner.nextDouble());

                    System.out.println(calculadoraSimples.getA() + " + " + calculadoraSimples.getB() + " = " + calculadoraSimples.somar());

                    break;
                case 2:
                    System.out.println("Digite um número. ");
                    calculadoraSimples.setA(scanner.nextDouble());
                    System.out.println("Digite outro número. ");
                    calculadoraSimples.setB(scanner.nextDouble());

                    System.out.println(calculadoraSimples.getA() + " - " + calculadoraSimples.getB() + " = " + calculadoraSimples.subtrair());

                    break;
                case 3:
                    System.out.println("Digite um número. ");
                    calculadoraSimples.setA(scanner.nextDouble());
                    System.out.println("Digite outro número. ");
                    calculadoraSimples.setB(scanner.nextDouble());

                    System.out.println(calculadoraSimples.getA() + " X " + calculadoraSimples.getB() + " = " + calculadoraSimples.multiplicar());

                    break;
                case 4:
                    System.out.println("Digite um número. ");
                    calculadoraSimples.setA(scanner.nextDouble());
                    System.out.println("Digite outro número. ");
                    calculadoraSimples.setB(scanner.nextDouble());

                    System.out.println(calculadoraSimples.getA() + " / " + calculadoraSimples.getB() + " = " + calculadoraSimples.dividir());
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        scanner.close();
    }
}
