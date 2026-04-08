package DevDojo.JavaCore.BintroduçãoDeMetodos.test;

import DevDojo.JavaCore.BintroduçãoDeMetodos.dominio.Calculadora;

public class CalculadoraTest04 {
    static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        double result = calculadora.dividaDoisNumeros02(20, 2);
        System.out.println(result);

        //OU
        System.out.println(calculadora.dividaDoisNumeros02(20, 4));

        System.out.println("----------");
      calculadora.imprimeDivisaoDeDoisNumeros(86, 5);
    }
}
