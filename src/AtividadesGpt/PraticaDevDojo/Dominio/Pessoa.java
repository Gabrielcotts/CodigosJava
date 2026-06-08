package AtividadesGpt.PraticaDevDojo.Dominio;

public class Pessoa {
    private String nome;
    private int idade;

    public boolean maiorDeIdade() {
        return this.idade >= 18;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return this.idade;
    }
}
