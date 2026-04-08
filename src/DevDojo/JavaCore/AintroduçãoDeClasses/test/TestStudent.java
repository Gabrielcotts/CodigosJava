import DevDojo.JavaCore.AintroduçãoDeClasses.dominio.Student;

public class TestStudent {
    static void main(String[] args) {

        Student student = new Student();

        student.name = "Gabriel";
        student.age = 20;
        student.sex = 'M';

        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.sex);
    }
}
