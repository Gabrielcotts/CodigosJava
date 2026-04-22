package AtividadesGpt.dominioPOO;

public class LoginSimples {

    public static boolean validarLogin(String usuario, String senha) {
        return usuario != null && !usuario.isEmpty() && senha != null && senha.length() >= 4;
    }
}
