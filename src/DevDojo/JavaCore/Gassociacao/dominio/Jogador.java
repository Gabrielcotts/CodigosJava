package DevDojo.JavaCore.Gassociacao.dominio;

public class Jogador {
    private String nome;

    public void imprimeDados() {
        System.out.println("Nome: " + this.nome);
    }

    public Jogador(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }


}