package MaratonaJava.dominio;

public class Funcionario {

    private String nome;
    private int idade;
    private double[] salarios;
    private   double media;

    public void imprimeDados() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salarios == null){
            return;
        }
        for (double salarios : salarios) {
            System.out.print(salarios + " ");
        }
        imprimeMediaSalarial();
    }

    public void imprimeMediaSalarial() {
        if (salarios == null){
            return;
        }


        for (double salarios : salarios){
            media += salarios;
        }
        media /= salarios.length;
        System.out.println("\nMédia salarial: " + media);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
    }
}
