package AtividadesGpt.PraticaDevDojo.ZRevision.Dominio;

public class Veiculo {
    private String modelo;
    private String marca;
    private int ano;


    public Veiculo(String modelo) {
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

    public Veiculo() {
    }

    public boolean validarModelo() {
        return this.modelo != null && !this.modelo.isEmpty();
    }

    public boolean validarMarca() {
        return this.marca != null && !this.marca.isEmpty();
    }

    public boolean validarAno() {
        return this.ano > 0 && this.ano < 2027;
    }

    public void imprimeDados() {
        System.out.println("---- DADOS ----");

        if (!this.validarModelo()) {
            System.out.println("Modelo inválido!");
            return;
        }
        if (!this.validarMarca()) {
            System.out.println("Marca inválida!");
            return;
        }
        if (!this.validarAno()) {
            System.out.println("Ano inválido!");
            return;
        }

        System.out.println("Modelo: " + this.modelo);
        System.out.println("Marca: " + this.marca);
        System.out.println("Ano: " + this.ano);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
