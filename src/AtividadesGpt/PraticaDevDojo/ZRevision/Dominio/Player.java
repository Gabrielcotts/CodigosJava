package AtividadesGpt.PraticaDevDojo.ZRevision.dominio;

public class Player {
    private String nome;
    private Player[] player;

    public Player(String nome) {
        this.nome = nome;
    }
    public Player(){}

    public boolean validarNome(){
        return this.nome != null && !this.nome.isEmpty();
    }

    public Player(String nome, Player[] player) {
        this(nome);
        this.player = player;
    }

    public void imprimeDados(){
        System.out.println("---- JOGADOR ----");
        if (!validarNome()){
            System.out.println("Nome inválido!");
            return;
        }

        System.out.println("Nome: " + this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Player[] getPlayer() {
        return player;
    }

    public void setPlayer(Player[] player) {
        this.player = player;
    }
}
