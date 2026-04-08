//atividade 4

package AtividadesGpt.testPOO;

import AtividadesGpt.dominioPOO.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();

        pessoa.nome = "Gabriel";
        pessoa.idade = 21;
        pessoa.sexo = 'M';
        System.out.println("Pessoa 1: \n" + "Nome: " + pessoa.nome + "\nIdade: " + pessoa.idade + " anos \nSexo:" + pessoa.sexo);

        Pessoa pessoa2 = new Pessoa();

        pessoa2.nome = "Nathaly";
        pessoa2.idade = 20;
        pessoa2.sexo = 'F';
        System.out.println("\nPessoa 2: \n" + "Nome: " + pessoa2.nome + "\nIdade: " + pessoa2.idade + " anos \nSexo:" + pessoa2.sexo);

    }
}
