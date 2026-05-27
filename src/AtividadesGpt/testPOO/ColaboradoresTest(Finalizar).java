package AtividadesGpt.testePOO;

import AtividadesGpt.dominioPOO.Colaboradores;

public class ColaboradoresTest {
    public static void main(String[] args) {

        Colaboradores colaborador1 = new Colaboradores("Gabriel", "Jovem aprendiz", 986.71);
        colaborador1.inicializacao("Gabriel", "Jovem aprendiz", 986.71 );
        colaborador1.imprimirDados();

        System.out.println("");

        Colaboradores colaborador2 = new Colaboradores("Nathaly", "Estagiária", 1500);
        colaborador2.inicializacao("Nathaly", "Estagiária", 1500);
        colaborador2.imprimirDados();


    }
}
