package AtividadesGpt.PraticaDevDojo.Test;

import AtividadesGpt.PraticaDevDojo.Dominio.Login;

import java.util.Scanner;

public class LoginTest {
    public static void main(String[] args) {

        Login login = new Login();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Login\n");

        System.out.println("Digite seu usuário: ");
        login.usuario = scanner.nextLine();

        System.out.println("Digite sua senha: ");
        login.setSenha(scanner.nextLine());

        if (!login.validarUsuario(login.usuario) || !login.validarSenha(login.getSenha())){
            System.out.println("Login não efetuado!");
        } else {
            System.out.println("Login efetuado com sucesso!\nSeja bem-vindo");
        }
        scanner.close();
    }
}
