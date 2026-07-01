package AtividadesGpt.ProjetoAcademia.dominio;

public class AvaliacoesFisicas {
    private double[] avaliacoes = new double[5];

    public void notaAvaliacao(double a, double b, double c, double d, double e) {

        this.avaliacoes[0] = a;
        this.avaliacoes[1] = b;
        this.avaliacoes[2] = c;
        this.avaliacoes[3] = d;
        this.avaliacoes[4] = e;
    }

    public double maiorAvaliacao() {
        double maior = this.avaliacoes[0];
        for (double avaliacoe : avaliacoes) {
            if (avaliacoe > maior) {
                maior = avaliacoe;
            }
        }
        return maior;
    }

    public double menorAvaliacao() {
        double menor = avaliacoes[0];

        for (double avaliacoe : avaliacoes) {
            if (menor > avaliacoe) {
                menor = avaliacoe;
            }
        }
        return menor;
    }

    public double mediaAvaliacao() {
        double soma = 0;

        for (double avaliacoe : avaliacoes) {
            soma += avaliacoe;
        }
        double media = soma/avaliacoes.length;

        return media;
    }

    public boolean validarAvaliacoes() {
        for (double nota : this.avaliacoes) {
            if (nota < 0 || nota > 10) {
                return false;
            }
        }
        return true;
    }

    public void imprimeAvaliacoes(){

        System.out.println("---Avaliações físicas---\n");

        System.out.println("Maior avaliação física: " + this.maiorAvaliacao());
        System.out.println("Menor avaliação física: " + this.menorAvaliacao());
        System.out.println("Avaliação física média: " + this.mediaAvaliacao());

    }
}