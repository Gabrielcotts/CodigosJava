package DevDojo.JavaCore.AintroduçãoDeClasses.test;

import DevDojo.JavaCore.AintroduçãoDeClasses.dominio.Carro;


public class TestCarro {
    static void main(String[] args) {

        Carro carro = new Carro();

        carro.nome = "Uno";
        carro.modelo = "Fiat";
        carro.ano = 2010;

        Carro carro2 = new Carro();

        carro = carro2;

        carro2.nome = "Versa";
        carro2.modelo = "Nisan";
        carro2.ano = 2020;

        System.out.println("Carro 1: " + carro.modelo + " " + carro.nome + " " + carro.ano + "\n");
        System.out.println("Carro 2: " + carro2.modelo + " " + carro2.nome + " " + carro2.ano);

    }
}