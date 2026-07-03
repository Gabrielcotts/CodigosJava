package AtividadesGpt.Projetos.ProjetoBiblioteca.dominio;

public class Biblioteca {
    private String nome;
    private int idade;
    private int cpf;

    public void alugarLivro(){

    }

    public boolean validarNome(){
        return this.nome != null || !this.nome.isEmpty();
    }
    public boolean validarIdade(){
        return this.idade >= 18 && this.idade < 120;
    }
    public boolean validarCpf(){
        return this.cpf == 11;
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

    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
}