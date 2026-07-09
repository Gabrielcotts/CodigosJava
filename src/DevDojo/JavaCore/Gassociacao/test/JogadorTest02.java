    package DevDojo.JavaCore.Gassociacao.test;

    import DevDojo.JavaCore.Gassociacao.dominio.Jogador;
    import DevDojo.JavaCore.Gassociacao.dominio.Time;

    public class JogadorTest02 {
        public static void main(String[] args) {
            Jogador jogador1 = new Jogador("Ronaldo Fenômeno");
            //  jogador1.imprimeDados();
            Time time = new Time("Brasil");
            jogador1.setTime(time);
            jogador1.imprimeDados();


        }
    }
