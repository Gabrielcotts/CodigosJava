package AtividadesGpt.dominioPOO;

public class AlunoMedia {
        public String nome;
        public double nota1;
        public double nota2;

        public double calcularMedia() {
            return (nota1 + nota2) / 2;
        }

        public boolean aprovado() {
            return calcularMedia() >= 7;
        }
    }