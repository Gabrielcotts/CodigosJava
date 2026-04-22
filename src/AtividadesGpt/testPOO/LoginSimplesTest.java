package AtividadesGpt.testPOO;

import AtividadesGpt.dominioPOO.LoginSimples;
import java.util.Scanner;

public class LoginSimplesTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu usuário: ");
        String usuario = scanner.nextLine();

        System.out.println("Digite sua senha: ");
        String senha = scanner.nextLine();

        if (!LoginSimples.validarLogin(usuario, senha)) {
            System.out.println("Erro: dados inválidos");
        } else {
            System.out.println("Login válido!");
        }

        scanner.close();
    }
}
