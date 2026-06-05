package AtividadesGpt.PraticaDevDojo.Test;

import AtividadesGpt.PraticaDevDojo.Dominio.Notas;

public class NotasTest {
    public static void main(String[] args) {

        Notas notas = new Notas();


        notas.registroNotas(8.7F, 4.5F, 9.1F, 4.97F, 5.67F,
                7.46F, 9.61F, 8.41F, 6.24F, 2.54F);


        System.out.println("Nota maior: " + notas.maiorNota());
        System.out.println("Nota menor: " + notas.menorNota());
        System.out.println("media: " + notas.calcularMedia());


    }
}
