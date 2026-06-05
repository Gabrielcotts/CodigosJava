package AtividadesGpt.PraticaDevDojo.Dominio;

public class Login {
    public String usuario;
    private String senha;

    public static boolean validarUsuario(String usuario) {
        return usuario != null && !usuario.isEmpty();
    }

    public static boolean validarSenha(String senha) {
        return senha != null && !senha.isEmpty() && senha.length() >= 6;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
