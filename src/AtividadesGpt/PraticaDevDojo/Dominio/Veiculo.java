package AtividadesGpt.PraticaDevDojo.Dominio;

public class Veiculo {
    private String modelo;
    private String marca;
    private int ano;

    public Veiculo() {
        System.out.println("Construtor vazio executado");
    }

    public Veiculo(String modelo) {
        this();
        this.modelo = modelo;
    }

    public Veiculo(String modelo, String marca) {
        this(modelo);
        this.marca = marca;
    }

    public Veiculo(String modelo, String marca, int ano) {
        this(modelo, marca);
        this.ano = ano;
    }

    public void imprimeDados() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Marca: " + this.marca);
        System.out.println("Ano: " + this.ano);
    }


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAno() {
        return this.ano;
    }

}
