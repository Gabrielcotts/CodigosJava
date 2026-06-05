package AtividadesGpt.PraticaDevDojo.Dominio;

public class Notas {

    private float[] notas = new float[10];

    public float maiorNota() {
        float maior = notas[0];
        for (float nota : notas) {
            if (nota > maior){
                maior = nota;
            }
        }
        return maior;
    }

    public float menorNota() {
        float menor = notas[0];

        for (float nota : notas) {
            if (nota < menor){
                menor = nota;
            }
        }
        return menor;
    }

    public float calcularMedia() {
        float soma = 0;

        for (float nota : notas) {
            soma += nota;
        }
        float media = soma / notas.length;
        return media;
    }

    public void registroNotas(float matemática, float português, float história, float geografia, float inglês,
                               float física, float química, float biologia, float espanhol, float eduFisica) {

        this.notas[0] = matemática;
        this.notas[1] = português;
        this.notas[2] = história;
        this.notas[3] = geografia;
        this.notas[4] = inglês;
        this.notas[5] = física;
        this.notas[6] = química;
        this.notas[7] = biologia;
        this.notas[8] = espanhol;
        this.notas[9] = eduFisica;

        for (float nota : notas) {
            System.out.println(nota);
        }
    }


    public float[] getNotas() {
        return notas;
    }

    public void setNotas(float[] notas) {
        this.notas = notas;
    }
}
