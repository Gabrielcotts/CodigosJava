package AtividadesGpt.PraticaDevDojo.Test;

import AtividadesGpt.PraticaDevDojo.Dominio.Estudante;

import java.util.Scanner;

public class EstudanteTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Estudante estudante = new Estudante();

        System.out.println("Digite o nome do estudante: ");
        estudante.setNome(scanner.nextLine());

        System.out.println("Digite a nota de Matemática: ");
        estudante.nota1 = scanner.nextFloat();

        System.out.println("Digite a nota de Português: ");
        estudante.nota2 = scanner.nextFloat();

        System.out.println("Digite a nota de História: ");
        estudante.nota3 = scanner.nextFloat();


        if (!estudante.validacao()) {
            System.out.println("Programa encerrado devido a notas inválidas.");
            scanner.close();
            return;
        }

        float media = estudante.calcularMedia();

        System.out.println("\nAluno: " + estudante.getNome());
        System.out.println("Média final: " + media);

        if (media >= 7) {
            System.out.println("Status: Aprovado!");
        } else if (media >= 5) {
            System.out.println("Status: Recuperação!");
        } else {
            System.out.println("Status: Reprovado!");
        }

        scanner.close();
    }
}
