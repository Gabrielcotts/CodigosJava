package DevDojo.JavaCore.Gassociacao.ZSeminarios.dominio;

public class Aluno {
    private String nome;
    private int idade;
    private Seminario seminario;


    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Aluno(String nome, int idade, Seminario seminario) {
        this(nome, idade);
        this.seminario = seminario;
    }

    public Aluno() {
    }

    public void imprimeDadosAluno() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
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
        return idade;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }
}
