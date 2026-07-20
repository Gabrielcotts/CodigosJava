package DevDojo.JavaCore.Gassociacao.ZSeminarios.test;

import DevDojo.JavaCore.Gassociacao.ZSeminarios.dominio.Aluno;
import DevDojo.JavaCore.Gassociacao.ZSeminarios.dominio.Local;
import DevDojo.JavaCore.Gassociacao.ZSeminarios.dominio.Professor;
import DevDojo.JavaCore.Gassociacao.ZSeminarios.dominio.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Local local = new Local("Rua das laranjeiras");
        Aluno aluno = new Aluno("Gabriel", 21);
        Professor professor = new Professor("DevDojo", "TI");
        Aluno[] alunosParaSeminario = {aluno};

        Seminario seminario = new Seminario("Programação em java", alunosParaSeminario, local);
        Seminario[] seminariosDisponiveis = {seminario};
        professor.setSeminario(seminariosDisponiveis);

        professor.imprimeDadosProfessor();

    }
}
