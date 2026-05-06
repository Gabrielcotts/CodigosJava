package MaratonaJava.test;

import MaratonaJava.dominio.Estudante;
import MaratonaJava.dominio.ImpressoraEstudante;

public class EstudanteTest02 {
    public static void main(String[] args) {

        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Gabriel";
        estudante01.idade = 21;
        estudante01.sexo = 'M';

        estudante02.nome = "Nathaly";
        estudante02.idade = 19;
        estudante02.sexo = 'F';

        estudante01.imprime();
        estudante02.imprime();

    }
}
