package AtividadesGpt.PraticaDevDojo.Dominio;

public class Estudante {
    private String nome;
    private float[] nota = new float[3];

    public float[] calcularMedia(){
        for (float nota : this.nota) {
            System.out.println(nota);
        }
        return this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float[] getNota() {
        return nota;
    }

    public void setNota(float[] nota) {
        this.nota = nota;
    }
}
