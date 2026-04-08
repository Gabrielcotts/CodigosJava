public class ProjetoAcademia {
    static void main(String[] args) {

        double salario = 986.22;
        double passagem = 238.15;
        int mãeDivida = 200;
        int victorDivida = 150;

        double dinheiroTrabalho = salario + passagem;
        double rendimentoTotal = dinheiroTrabalho + mãeDivida + victorDivida;

        System.out.println("Valor recebido no trabalho " + dinheiroTrabalho);
        System.out.println("Valor total recebido " + rendimentoTotal);

        double dividaFaculdade = 745.52;
        double dividaVivo = 44.00;

        double dividasFixasParaPagar = dividaFaculdade + dividaVivo;

        System.out.println("Dívidas fixas a pagar por mês " + dividasFixasParaPagar);

        double sobraMensal = rendimentoTotal - dividasFixasParaPagar;

        System.out.println("Valor que sobra mensalmente: " + sobraMensal);


    }
}
