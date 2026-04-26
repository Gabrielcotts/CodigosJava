//Esse código mostra na prática os parâmetros de tipos de referências
package DevDojo.JavaCore.BintroduçãoDeMetodos.dominio;

public class ImpressoraEstudante {
    public void imprime(Estudante estudante) {
        System.out.println("----------------------");

        System.out.println(estudante.nome + "\n" + estudante.idade + "\n" + estudante.sexo);

        estudante.nome = "Luiza";
    }
}
