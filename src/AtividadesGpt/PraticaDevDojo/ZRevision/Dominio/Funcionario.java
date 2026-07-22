package AtividadesGpt.PraticaDevDojo.ZRevision.Dominio;

public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public Funcionario() {
    }

    public boolean validarNome() {
        return this.nome != null && !this.nome.isEmpty();
    }

    public boolean validarSalario() {
        return this.salario > 0;
    }

    public void imprimeDados() {
        System.out.println("---- DADOS ----");
        if (!this.validarNome()) {
            System.out.println("Nome inválido!");
            return;
        }
        if (!this.validarSalario()) {
            System.out.println("Salário deve ser maior que zero!");
            return;
        }
        System.out.println("Nome: " + this.nome);
        System.out.println("Cargo: " + this.cargo);
        System.out.println("Salário: " + this.salario);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
