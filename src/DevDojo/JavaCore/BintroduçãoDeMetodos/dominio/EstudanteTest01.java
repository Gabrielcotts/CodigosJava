package MaratonaJava.test;

import MaratonaJava.dominio.Estudante;

public class EstudanteTest01 {
    static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Gabriel";
        estudante01.idade = 21;
        estudante01.sexo = 'M';

        System.out.println(estudante01.nome + "\n" + estudante01.idade + "\n" + estudante01.sexo);

        System.out.println("----------------------");

        estudante02.nome = "Nathaly";
        estudante02.idade = 19;
        estudante02.sexo = 'F';

        System.out.println(estudante02.nome + "\n" + estudante02.idade + "\n" + estudante02.sexo);
    }
}
