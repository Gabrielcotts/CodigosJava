package DevDojo.JavaCore.AintroduçãoDeClasses.test;

import DevDojo.JavaCore.AintroduçãoDeClasses.dominio.Student;

public class TestStudent02 {
    static void main(String[] args) {
        Student student = new Student();
        Student student02 = new Student();

        student.name = "sanji";
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.sex);

        System.out.println("\n---------------------");

        System.out.println(student02.name);
        System.out.println(student02.age);
        System.out.println(student02.sex);
    }
}
