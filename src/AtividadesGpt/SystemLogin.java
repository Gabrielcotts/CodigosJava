import java.util.Scanner;

public class SystemLogin {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("----- SISTEMA DE LOGIN ----- \n");
        System.out.println("Digite o usuário:");
        String usuario = scanner.nextLine();

        System.out.println("Digite a senha:");
        String senha = scanner.nextLine();

        if (usuario.equals("admin") && senha.equals("1234")) {
            System.out.println("Login realizado com sucesso!");
        } else {
            System.out.println("Usuário ou senha incorretos.");
        }

        scanner.close();
    }
}
