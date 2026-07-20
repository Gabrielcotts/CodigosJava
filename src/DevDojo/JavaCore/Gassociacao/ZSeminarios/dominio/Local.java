package DevDojo.JavaCore.Gassociacao.ZSeminarios.dominio;

public class Local {
    private String endereco;

    public Local(String endereco){
        this.endereco = endereco;
    }
    public Local(){}

    public void imprimeDadosLocal(){
        System.out.println("Endereço: " + this.endereco);
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public String getEndereco(){
        return this.endereco;
    }

}
