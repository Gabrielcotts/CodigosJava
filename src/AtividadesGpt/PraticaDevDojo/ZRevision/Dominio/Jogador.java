package AtividadesGpt.PraticaDevDojo.ZRevision.dominio;

public class Jogador {
    private String[] nome = new String[11];

    public Jogador(String[] nome) {
        this.nome = nome;
    }

    public Jogador() {
    }

    public boolean validarNome() {
        return this.nome != null;
    }

    public void imprimeDados() {
        System.out.println("---- Time ----");
        if (!this.validarNome()) {
            System.out.println("Nome inválido!");
            return;
        }
        for (String jogador : nome) {
            if (jogador != null) {
                System.out.println(jogador);
            }
        }
        System.out.println();
    }


    public String[] getNome() {
        return nome;
    }

    public void setNome(String[] nome) {
        this.nome = nome;
    }
}
