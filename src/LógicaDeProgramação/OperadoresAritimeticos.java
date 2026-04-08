package LógicaDeProgramação;

public class OperadoresAritimeticos {
        public static void main(String[] args){
            double pao = 10.50;
            double queijo = 7.00;
            double açucar = 1.00;
            double desconto = 5.00;
            int totalDiasDosMes = 30;


            double valorTotal = pao + queijo + açucar;
            double valortotalComDesconto = valorTotal - desconto;
            double valorTotalDividido = valortotalComDesconto/2;
            double valorTotalMensal = valortotalComDesconto * totalDiasDosMes;

            System.out.println("valor Total = R$" + valorTotalMensal);

        }
    }

