package AtividadesGpt.PraticaDevDojo.ZRevision.dominio;

public class ControleTemperaturas {
    private double[] temperaturas = new double[7];

    public ControleTemperaturas(double[] temperaturas) {
        this.temperaturas = temperaturas;
    }

    public ControleTemperaturas() {
    }

    public double maiorTemperatura() {
        double maior = temperaturas[0];

        for (double temperatura : temperaturas) {
            if (temperatura > maior) {
                maior = temperatura;
            }
        }
        return maior;
    }

    public double menorTemperatura() {
        double menor = temperaturas[0];

        for (double temperatura : temperaturas) {
            if (temperatura < menor) {
                menor = temperatura;
            }
        }
        return menor;
    }

    public double mediaTemperatura() {
        double soma = 0;

        for (double temperatura : temperaturas) {
            soma += temperatura;
        }
        double media = soma / temperaturas.length;

        return media;
    }

    public void imprimeDados() {
        System.out.println("---- DADOS ----");

        System.out.println("Temperaturas: ");
        System.out.println();
        for (double temperatura : temperaturas) {
            System.out.println("- " + temperatura + "°C ");
        }
        System.out.println();
        System.out.println("Maior temperatura: " + maiorTemperatura());
        System.out.println("Menor temperatura: " + menorTemperatura());
        System.out.println("Temperatura média: " + mediaTemperatura());

    }

    public double[] getTemperaturas() {
        return temperaturas;
    }

    public void setTemperaturas(double[] temperaturas) {
        this.temperaturas = temperaturas;
    }
}
