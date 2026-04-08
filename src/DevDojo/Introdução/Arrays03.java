package DevDojo.Introdução;

//macete para Arrays
//Usar *Nome da veriável*.length em uma estrutura de repetição como
//*for, while ou Do while* ira retornar sempre o tamanho do Array.

public class Arrays03 {
    static void main() {

        String[] nomes = new String[3];
        nomes[0] = "Gabriel";
        nomes[1] = "Nathaly";
        nomes[2] = "Gabrielly";


        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

        /* OU↓↓

         String[] nomes2 = {"Gabriel, Nathaly, Gabrielly  "};

        for (int i = 0; i < nomes2.length; i++) {
            System.out.println(nomes2[i]);
        } */


    }
}
