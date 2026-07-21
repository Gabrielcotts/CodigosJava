package AtividadesGpt.PraticaDevDojo.ZRevision.Dominio;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa() {
    }

    public boolean verificarIdade() {
        if (this.idade <= 0) {
            System.out.println("Idade incorreta! Idade tem que ser maior que 0");
        } else if (this.idade >= 140) {
            System.out.println("Não existem pessoas com essa idade!");
        }
        return this.idade >= 18;

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
}
