package DevDojo.JavaCore.Fmodificadorestatico.test;

import DevDojo.JavaCore.Fmodificadorestatico.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        //Carro.velocidadeLimite = 180;
        Carro.setVelocidadeLimite(180);

        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Mercedes", 275);
        Carro c3 = new Carro("Audi", 290);

//      c1.setVelocidadeLimite(180);

        c1.imprimeDados();

        c2.imprimeDados();

        c3.imprimeDados();
    }
}
