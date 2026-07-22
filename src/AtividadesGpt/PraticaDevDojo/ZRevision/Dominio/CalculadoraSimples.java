package AtividadesGpt.PraticaDevDojo.ZRevision.dominio;

public class CalculadoraSimples {
    private double a;
    private double b;

    public CalculadoraSimples() {
    }


    public double somar() {
        return a + b;
    }

    public double subtrair() {
        return a - b;
    }

    public double multiplicar() {
        return a * b;
    }

    public double dividir() {
        if (b == 0) {
            System.out.println("Não é possivel dividir por 0!");
            return 0;
        }
        return a / b;
    }


    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}
