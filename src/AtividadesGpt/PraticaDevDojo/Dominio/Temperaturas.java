package AtividadesGpt.PraticaDevDojo.Dominio;

public class Temperaturas {
    private double[] temperaturas = new double[7];


    public void controleDeTemperaturas(double a, double b, double c, double d, double e, double f, double g) {
        this.temperaturas[0] = a;
        this.temperaturas[1] = b;
        this.temperaturas[2] = c;
        this.temperaturas[3] = d;
        this.temperaturas[4] = e;
        this.temperaturas[5] = f;
        this.temperaturas[6] = g;

        for (double temperatura : temperaturas) {
            System.out.println(temperatura);
        }
    }

    public double maiorTemperatura() {
        double maior = this.temperaturas[0];
        for (double temperatura : temperaturas) {
            if (temperatura > maior) {
                maior = temperatura;
            }
        }

        return maior;
    }

    public double menorTemperatura() {
        double menor = this.temperaturas[0];
        for (double temperatura : temperaturas) {
            if (temperatura < menor) {
                menor = temperatura;
            }
        }
        return menor;
    }

    public double calcularMedia(){
        double soma = 0;

        for (double temperatura : temperaturas) {
            soma += temperatura;
        }
        double media = soma / temperaturas.length;
        return media;
    }

    public void imprimeDados(){
        System.out.println("\n---Descrição de temperaturas---\n");
        System.out.println("Maior temperatura: " + this.maiorTemperatura());
        System.out.println("Menor temperatura: " + this.menorTemperatura());
        System.out.println("Temperatura média: " + this.calcularMedia());
    }

    public double[] getTemperaturas() {
        return temperaturas;
    }

    public void setTemperaturas(double[] temperaturas) {
        this.temperaturas = temperaturas;
    }
}
