package DevDojo.JavaCore.Gassociacao.ZSeminarios.dominio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this(nome, especialidade);
        this.seminarios = seminarios;
    }

    public Professor() {
    }

    public void imprimeDadosProfessor() {
        System.out.println("---------");
        System.out.println("** Professor **");
        System.out.println("Nome: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);
        if (this.seminarios == null) {
            return;
        }
        System.out.println("** Seminários cadastrados **");
        for (Seminario seminario : this.seminarios) {
            System.out.println("Título: " + seminario.getTitulo());
            System.out.println("Endereço: " + seminario.getLocal().getEndereco());
            if (seminario.getAlunos() == null || seminario.getAlunos().length == 0) {
                continue;
            }
            System.out.println("** Alunos **");
            for (Aluno aluno : seminario.getAlunos()) {
                System.out.println("Aluno: " + aluno.getNome() + "\nIdade: " + aluno.getIdade());
            }
        }
        System.out.println("---------");
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return this.especialidade;
    }

    public Seminario[] getSeminario() {
        return seminarios;
    }

    public void setSeminario(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
