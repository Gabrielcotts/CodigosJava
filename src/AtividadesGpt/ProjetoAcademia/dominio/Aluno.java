package AtividadesGpt.ProjetoAcademia.dominio;

public class Aluno {
    private String nome;
    private int idade;
    private double peso;
    private double altura;
    private String plano;
    public static double mensalidadeBruta = 187.50;

    //Contrutores
    public Aluno(String nome) {
        this();
        this.nome = nome;
    }

    public Aluno(String nome, int idade, double peso, double altura, String plano) {
        this(nome);
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
        this.plano = plano;
    }

    public Aluno() {

    }

    //métodos
    public void calcularIMC() {
        double IMC = this.peso / (this.altura * this.altura);
        System.out.println("Seu índice de massa corporal (IMC) é: " + IMC);
    }

    public void aplicarDesconto() {
        double desconto = (20.0 / 100) * Aluno.mensalidadeBruta;
        double mensalidadeLiquida = Aluno.mensalidadeBruta - desconto;

        System.out.println("Desconto de 20%: R$ " + desconto);
        System.out.println("Mensalidade líquida: " + mensalidadeLiquida);
    }


    //regras de negócio
    public boolean validadorNome() {
        return this.nome != null && !this.nome.isEmpty();
    }

    public int verificadorIdade() {
        if (this.idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
        return this.idade;
    }


    public void imprimeDados() {
        System.out.println("----Dados do aluno----\n");

            System.out.println("Nome: " + this.nome);
            System.out.println("Idade: " + this.idade);
            System.out.println("Peso: " + this.peso);
            System.out.println("Altura: " + this.altura);
            System.out.println("Plano: " + this.plano);
            System.out.println("Mensalidade: R$ " + Aluno.mensalidadeBruta);
    }

    //getters and setters
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

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }
}
