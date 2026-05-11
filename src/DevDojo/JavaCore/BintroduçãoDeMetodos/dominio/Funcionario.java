package AtividadesGpt.dominioPOO;

public class Funcionario {
    private String nome;
    private double salario;
    private String cargo;

    public void imprimeDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Salário: R$ " + this.salario);
        System.out.println("Cargo: " + this.cargo);
    }

    public boolean setNome(String nome) {

        if (nome == null || nome.isEmpty()) {
            return false;
        }
        this.nome = nome;
        return true;
    }

    public void setSalario(double salario) {
        if (salario < 0) {
            System.out.println("Salário inválido!");
            return;
        }
        this.salario = salario;
    }

    public void setCargo(String cargo) {

        if (cargo == null || cargo.isEmpty()) {
            return;
        }
        this.cargo = cargo;
    }

    public String getNome() {
        return this.nome;
    }

    public double getSalario() {
        return this.salario;
    }

    public String getCargo() {
        return this.cargo;
    }
}
