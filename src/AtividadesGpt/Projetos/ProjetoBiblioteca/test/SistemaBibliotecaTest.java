package AtividadesGpt.Projetos.ProjetoBiblioteca.test;

import AtividadesGpt.Projetos.ProjetoBiblioteca.dominio.Biblioteca;
import AtividadesGpt.Projetos.ProjetoBiblioteca.dominio.Livro;

import java.util.Scanner;

public class SistemaBibliotecaTest {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("1 - Cadastrar livro");
            System.out.println("2 - Listar livro");
            System.out.println("3 - Procurar livro");
            System.out.println("4 - Emprestar livro");
            System.out.println("5 - Devolver livro");
            System.out.println("6 - Estatísticas");
            System.out.println("0 - Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();


            if (opcao == 0) {
                System.out.println("Atendimento encerrado!");
                break;
            }

            switch (opcao) {
                case 1:
                    System.out.println("Digite o título: ");
                    scanner.nextLine();


                    break;
                case 2:
                    biblioteca.mostrarTodosLivros();
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }

        scanner.close();
    }
}
