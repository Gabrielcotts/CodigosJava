//Esse código mostra na prática os parâmetros de tipos de referências
package DevDojo.JavaCore.BintroduçãoDeMetodos.test;

import DevDojo.JavaCore.BintroduçãoDeMetodos.dominio.Estudante;
import DevDojo.JavaCore.BintroduçãoDeMetodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressoraEstudante = new ImpressoraEstudante();

        estudante01.nome = "Gabriel";
        estudante01.idade = 21;
        estudante01.sexo = 'M';


        System.out.println("----------------------");

        estudante02.nome = "Nathaly";
        estudante02.idade = 19;
        estudante02.sexo = 'F';


        impressoraEstudante.imprime(estudante01);

        impressoraEstudante.imprime(estudante02);


        System.out.println("#############");

        impressoraEstudante.imprime(estudante01);

        impressoraEstudante.imprime(estudante02);
    }
}
