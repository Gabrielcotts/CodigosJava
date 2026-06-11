package AtividadesGpt.PraticaDevDojo.Dominio;

public class ControleVendasSemanais {
    private double[] vendas = new double[5];

    public void registroVendas(double segunda, double terca, double quarta, double quinta, double sexta) {

        vendas[0] = segunda;
        vendas[1] = terca;
        vendas[2] = quarta;
        vendas[3] = quinta;
        vendas[4] = sexta;
    }

    public double totalVendido() {
        double soma = 0;

        for (double venda : vendas) {
            soma += venda;
        }

        return soma;
    }

    public double maiorVenda() {
        double maior = vendas[0];
        for (double venda : vendas) {
            if (venda > maior) {
                maior = venda;
            }
        }
        return maior;
    }

    public double menorVenda() {
        double menor = vendas[0];
        for (double venda : vendas) {
            if (venda < menor) {
                menor = venda;
            }
        }
        return menor;
    }

    public void imprimeDados() {
        System.out.println("--- RELATÓRIO DE VENDAS --- \n");
        System.out.println("Segunda-feira: R$ " + vendas[0]);
        System.out.println("Terça-feira: R$ " + vendas[1]);
        System.out.println("Quarta-feira: R$ " + vendas[2]);
        System.out.println("Quinta-feira: R$ " + vendas[3]);
        System.out.println("Sexta-feira: R$ " + vendas[4]);

        System.out.println("\nMaior venda: R$ " + this.maiorVenda());
        System.out.println("Menor venda: R$ " + this.menorVenda());
        System.out.println("Total de vendas na semana: R$ " + this.totalVendido());
    }

    public void setVendas(double[] vendas){
        this.vendas = vendas;
    }
    public double[] getVendas(){
        return this.vendas;
    }
}
