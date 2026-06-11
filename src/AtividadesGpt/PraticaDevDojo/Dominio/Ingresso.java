package AtividadesGpt.PraticaDevDojo.Dominio;

public class Ingresso {
    private String nomeEvento;
    private float valor;

    public float aplicarDesconto(float percentual) {

        if (percentual > 50) {
            percentual = 50;
            System.out.println("Desconto máximo permitido é 50%.");
        }

        if (percentual < 0) {
            System.out.println("Porcentagem de desconto inválida.");
            return valor;
        }

        float desconto = this.valor * (percentual / 100);

        return this.valor - desconto;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public float getValor() {
        return valor;
    }

    public boolean setValor(float valor) {

        if (valor < 100) {
            return false;
        }

        this.valor = valor;
        return true;
    }
}