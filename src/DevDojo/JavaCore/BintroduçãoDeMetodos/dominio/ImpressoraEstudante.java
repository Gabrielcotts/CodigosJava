//Esse código mostra na prática os parâmetros de tipos de referências
package MaratonaJava.dominio;

public class ImpressoraEstudante {
    public void imprime(Estudante estudante){
        System.out.println("----------------------");

        estudante.nome = "Nathaly";
        estudante.idade = 19;
        estudante.sexo = 'F';

    }
}
