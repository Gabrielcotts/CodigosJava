package AtividadesGpt.testePOO;

import AtividadesGpt.dominioPOO.AlunoMedia;

import java.util.Scanner;

public class AlunoMediaTest {
    public static void main(String[] args) {

        AlunoMedia aluno = new AlunoMedia();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        aluno.nome = scanner.nextLine();

        System.out.println("Digite a primeira nota: ");
        aluno.nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota: ");
        aluno.nota2 = scanner.nextDouble();

        double media = aluno.calcularMedia();

        System.out.println("Aluno: " + aluno.nome);
        System.out.println("Média: " + media);

        if (aluno.aprovado()) {
            System.out.println("Aprovado!");
        } else if (media >= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
        scanner.close();
    }
}

