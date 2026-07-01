package AtividadesGpt.ProjetoAcademia.test;

import AtividadesGpt.ProjetoAcademia.dominio.Aluno;

public class AlunoTest {
    public static void main(String[] args) {
        Aluno academia = new Aluno
                ("Gabriel   ", 21, 92.71, 1.82, "Mensal" );



      if (!academia.validadorNome()){
              System.out.println("Nome precisa ser preenchido corretamente.");
      } else {
          academia.imprimeDados();
          academia.calcularIMC();
          academia.verificadorIdade();
          academia.aplicarDesconto();
      }
    }
}
