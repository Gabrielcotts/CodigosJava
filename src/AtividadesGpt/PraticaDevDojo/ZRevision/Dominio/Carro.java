package AtividadesGpt.PraticaDevDojo.ZRevision.Dominio;

public class Carro {
    private String nome;
    private float velocidadeMax;
    private static float velocidadeLimite = 250;

    public Carro(String nome, float velocidadeMax) {
        this.nome = nome;
        this.velocidadeMax = velocidadeMax;
    }

    public Carro() {
    }

    public boolean validarNome() {
        return this.nome != null && !this.nome.isEmpty();
    }
    public boolean validarVelocidadeMax(){
        return this.velocidadeMax > 0;
    }

    public void imprimeDados() {
        System.out.println("---- DADOS ----");

        if (!this.validarNome()) {
            System.out.println("Nome inválido!");
            return;
        }
        if (!this.validarVelocidadeMax()){
            System.out.println("Velocidade inválida!");
            return;
        }
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade máxima: " + this.velocidadeMax);
        System.out.println("Velocidade limite: " + velocidadeLimite);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(float velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

    public static float getVelocidadeLimite() {
        return velocidadeLimite;
    }

    public static void setVelocidadeLimite(float velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;
    }
}
