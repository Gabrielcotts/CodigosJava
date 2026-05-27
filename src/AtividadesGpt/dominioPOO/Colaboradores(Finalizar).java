//Prática dos contrutores e sobrecarga de métodos!
package AtividadesGpt.dominioPOO;

public class Colaboradores {
    private String nome;
    private String cargo;
    private double salario;

    public Colaboradores(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String nome(){
        return nome = nome;
    }

    public void inicializacao(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void imprimirDados() {
        System.out.println(this.nome);
        System.out.println(this.cargo);
        System.out.println(this.salario);
    }




    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    public String getCargo(){
        return this.cargo;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
    public double getSalario(){
        return this.salario;
    }

}
