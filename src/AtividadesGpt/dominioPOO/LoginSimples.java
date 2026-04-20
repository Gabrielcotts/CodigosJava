package Atividades.dominioPOO;

public class LoginSimples {
    public static boolean validarLogin(String usuario, String senha){
        return usuario != null && usuario.isEmpty() && senha!= null && senha.isEmpty();

    }
}
