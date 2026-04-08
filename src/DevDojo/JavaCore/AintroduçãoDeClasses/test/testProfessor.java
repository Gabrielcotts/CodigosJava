package DevDojo.JavaCore.AintroduçãoDeClasses.test;

import DevDojo.JavaCore.AintroduçãoDeClasses.dominio.Professor;

public class testProfessor {
    static void main(String[] args) {

        Professor professor = new Professor();
        professor.name = "Robson";
        professor.age = 60;
        professor.sexo = 'M';

        System.out.println("Nome: " + professor.name + "\n" + "Idade: " +
                 professor.age + "\nGênero: " + professor.sexo);

    }
}