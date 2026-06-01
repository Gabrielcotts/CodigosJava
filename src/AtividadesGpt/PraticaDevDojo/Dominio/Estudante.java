package AtividadesGpt.PraticaDevDojo.Dominio;

public class Estudante {
    private String nome; 
    public float nota1;
    public float nota2;
    public float nota3;

    public boolean validacao() {

        if (nota1 > 10 || nota2 > 10 || nota3 > 10) {
            System.out.println("Atenção: A nota não pode ser maior que 10!");
            return false;
        }

        if (nota1 < 0 || nota2 < 0 || nota3 < 0) {
            System.out.println("Atenção: A nota não pode ser menor que 0!");
            return false;
        }

        return true;
    }

    public float calcularMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {

        if (nome == null || nome.isEmpty()) {
            System.out.println("Nome inválido!");
            return;
        }

        this.nome = nome;
    }
}
