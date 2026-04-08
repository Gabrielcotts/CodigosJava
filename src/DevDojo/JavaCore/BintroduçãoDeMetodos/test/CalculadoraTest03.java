package DevDojo.JavaCore.BintroduçãoDeMetodos.test;

import DevDojo.JavaCore.BintroduçãoDeMetodos.dominio.Calculadora;

public class CalculadoraTest03 {
    static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(20,2);
        System.out.println(result);
        System.out.println("\n");
        // OU
        System.out.println(calculadora.divideDoisNumeros(20,2));

    }
}
