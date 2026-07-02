    package AtividadesGpt.ProjetoAcademia.test;

    import AtividadesGpt.ProjetoAcademia.dominio.Aluno;
    import AtividadesGpt.ProjetoAcademia.dominio.AvaliacoesFisicas;

    import java.util.Scanner;

    public class SistemaAcademiaTest {
        public static void main(String[] args) {
            Aluno aluno = new Aluno();
            AvaliacoesFisicas avaliacoesFisicas = new AvaliacoesFisicas();
            Scanner scanner = new Scanner(System.in);


            while (true) {
                int opcao = 0;

                System.out.println("1 - Cadastrar aluno");
                System.out.println("2 - Mostrar dados do aluno");
                System.out.println("3 - Calcular IMC");
                System.out.println("4 - Aplicar desconto na mensalidade");
                System.out.println("5 - Cadastrar avaliações físicas");
                System.out.println("6 - Mostrar relatório das avaliações");
                System.out.println("0 - Sair");

                switch (opcao){

                    case 1:
                        System.out.println("Digite seu nome: ");
                        aluno.setNome(scanner.nextLine());
                        aluno.validadorNome();

                        System.out.println("Digite sua idade: ");
                        aluno.setIdade(scanner.nextInt());
                        aluno.verificadorIdade();

                        System.out.println("Digite seu peso: ");
                        aluno.setPeso(scanner.nextDouble());

                        System.out.println("Digite sua altura: ");
                        aluno.setAltura(scanner.nextDouble());

                        System.out.println("Digite o plano que deseja cadastrar: ");
                        System.out.println("Opções de plano: Mensal, Semestral e anual");
                        aluno.setPlano(scanner.nextLine());


                        break;
                    case 2:
                        System.out.println("Seus dados: " );
                        aluno.imprimeDados();
                        break;
                    case 3:
                        System.out.println("Seu IMC: ");
                        aluno.calcularIMC();
                        break;
                    case 4:
                        System.out.println("Desconto: ");
                        aluno.aplicarDesconto();
                        break;
                    case 5:
                        System.out.println("Digite suas avaliações físicas: ");

                        break;
                    case 6:
                        System.out.println("Relatório de avaliações físicas:");
                        break;
                    case 0:
                        if (opcao == 0){
                            System.out.println("Atendimento encerrado.");

                        }
                        break;
                    default:
                        System.out.println("Opção inválida!");
                        break;
                }
                scanner.close();
            }
        }
    }
