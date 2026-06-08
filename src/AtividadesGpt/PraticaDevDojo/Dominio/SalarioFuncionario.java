package AtividadesGpt.PraticaDevDojo.Dominio;

public class SalarioFuncionario {
    private String nome;
    private double salarioBruto;

    public double calcularSalarioLiquido() {
        double salarioLiquido = salarioBruto * 0.90;
        return salarioLiquido;

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setSalarioBruto(double salarioBruto) {
        if (salarioBruto <= 0) {
            System.out.println("Salário inválido!");
            return;
        }

        this.salarioBruto = salarioBruto;
    }

    public double getSalarioBruto() {
        return this.salarioBruto;
    }
}
