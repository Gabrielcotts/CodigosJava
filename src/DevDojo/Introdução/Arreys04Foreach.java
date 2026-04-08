package DevDojo.Introdução;

public class Arreys04Foreach {
    static void main(String[] args) {


        int[] numbers = new int[3];
//Ou, a forma de inicializar um array com o tamnho e diretamente com os valores ↓↓↓
        int[] numbers2 = {1, 2, 3, 4, 5};

        for (int i = 0; i < numbers2.length; i++) {
            System.out.println(numbers2[i]);
        }
        //OU↓↓
        //atalho = iter
        for (int i : numbers2) {
            System.out.println(i);

        }
    }
}