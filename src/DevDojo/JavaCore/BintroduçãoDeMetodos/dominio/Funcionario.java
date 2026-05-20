
package MaratonaJava.dominio;

public class Funcionario {

    public String nome;
    public int idade;
    public double[] salarios;

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
        double media = 0;

        for (double salarios : salarios){
            media += salarios;
        }
        media /= salarios.length;
        System.out.println("\nMédia salarial: " + media);
    }
}
