package DevDojo.JavaCore.Gassociacao.test;

import DevDojo.JavaCore.Gassociacao.dominio.Escola;
import DevDojo.JavaCore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("DevDojo");
        Professor professor2 = new Professor("Gustavo Guanabara");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("YouTube", professores );

        escola.imprime();
    }
}
