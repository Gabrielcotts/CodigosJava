package MaratonaJava.test;

import MaratonaJava.dominio.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        /* ANTES
        pessoa.nome = "Jiraya";
        pessoa.idade = 70; */

        //Agora
        pessoa.setNome("Jiraya");
        pessoa.setIdade(70);
        pessoa.imprime();

        //como fazer a impressão
        System.out.println("\n" + pessoa.getNome());
        System.out.println(pessoa.getIdade());

        /* O que não fazer?
        System.out.println(pessoa.setNome("Jiraya"));
        Explicação: Não se deve colocar void dentro de um System.out.println();
         */

    }
}
