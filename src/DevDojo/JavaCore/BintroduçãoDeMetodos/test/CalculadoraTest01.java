package DevDojo.JavaCore.BintroduçãoDeMetodos.test;

import DevDojo.JavaCore.BintroduçãoDeMetodos.dominio.Calculadora;

public class CalculadoraTest01 {
    static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        System.out.println("Finalizando CalculadoraTest");
        calculadora.subtraiDoisNumeros();
    }
}