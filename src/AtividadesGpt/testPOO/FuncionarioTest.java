package AtividadesGpt.testePOO;

import AtividadesGpt.dominioPOO.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        boolean nomeValido = funcionario.setNome("Gabriel");

        if (!nomeValido) {
            System.out.println("Usuário não pode estar vazio");
            return;
        }

        funcionario.setSalario(986.27);
        funcionario.setCargo("Jovem aprendiz");

        funcionario.imprimeDados();
    }
}
