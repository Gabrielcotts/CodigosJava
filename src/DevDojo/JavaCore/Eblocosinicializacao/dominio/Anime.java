/* bloco de inicialização de instância, como uma boa prática ele costumar ser
utilizado após os atributos e antes dos contrutores*/
package DevDojo.Javacore.Eblocosinicializacao.dominio;

public class Anime {
    private String nome;
//  private int[] episodios = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    private int[] episodios;
    /*    1 - Alocado em memória para o objeto.
          2 - Cada atributo de classe é criado e inicializado com valores default ou o que for passado.
          3 - Bloco de inicialização é executado.
          4 - Contrutor é executado
                                                                         */
    {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[148];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;

        }
    }
    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {

        for (int episodios: this.episodios) {
            System.out.print(episodios + ". ");
        }
        System.out.println();
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setEpisodios(int[] episodios) {
        this.episodios = episodios;
    }

    public int[] getEpisodios() {
        return this.episodios;
    }
}
