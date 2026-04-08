package DevDojo.Introdução;

//variável Arrays. Exemplo: int [] idades = new int[3];
//Arrays são considerados obejetos na memória
//Arrays quase sempre começa de zero. Exemplo: 0, 1, 2 (isso é igual a 3)
//null = nulo
//Arreys são tipos de referência
//Variáveis normais do tipo primitivo não se pode iniciar com *null* Exemplo: int idade = null;
//String pode ser iniciado com *null* Exemplo: String nome = null;

public class Arrays01 {
    static void main() {

        int[] idades = new int[3];
        idades[0] =42;
        idades[1] =41;
        idades[2] =19;
        System.out.println("Sogro: " + idades[0] + " Sogra: " + idades[1] + " Noiva " + idades[2]);

    }
}
