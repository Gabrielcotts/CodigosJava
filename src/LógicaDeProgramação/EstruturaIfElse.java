package LógicaDeProgramação;

public class EstruturaIfElse {
    public static void main(String[] args){

//        int idade = 17;
//
//        if (idade >= 18){
//            System.out.println("Você é maior de idade");
//        }
//        else {
//            System.out.println("você é menor de idade");
//        }

//       boolean estaChovendo = true;
//
//       if (!estaChovendo){
//           System.out.println("vamos sair para passear");
//       }
//       else {
//           System.out.println("vamos ficar em casa");
//       }

        boolean temDinheiro = true;
        boolean temCartao = false;

        if (temCartao && temDinheiro) {
            System.out.println("Pede um ifood e um zé delivery");
        }
        else if (temDinheiro || temCartao){
            System.out.println("Pede um ifood");
        }
        else {
            System.out.println("Não pede nada");
        }





    }
}
