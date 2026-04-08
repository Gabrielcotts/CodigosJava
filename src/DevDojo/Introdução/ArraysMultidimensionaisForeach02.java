package DevDojo.Introdução;
//O : no código for (int num : arrayBase) é parte da sintaxe do loop for aprimorado (também conhecido como for-each),
// usado em linguagens como Java e C# para percorrer os elementos de um array ou coleção.
//Significado: O : significa "para cada" ou "em".

//para pular linha na hora de imprimir, use:     \n
// Exemplo:         System.out.println("\n");
public class ArraysMultidimensionaisForeach02 {
    static void main(String[] args) {

        //Formas de inicializar um Array Multidimensional

        int[] array = {1, 2, 3};

        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[2];
        arrayInt[1] = array; //Essa forma faz referência a "int [] array = {1,2,3};"
        arrayInt[2] = new int[]{1, 2, 3, 4, 5, 6};

        for (int[] arrayBase : arrayInt) {
            System.out.println("\n------");
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
        }

        //outras formas de inicializar um Array Multidimensional

        int[][] arrayInt2 = {{0, 0}, {1, 2, 3}, {1, 2, 3, 4, 5, 6}};


       for (int[] arrayBase : arrayInt2) {
            System.out.println("\n------");
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
        }
    }
}