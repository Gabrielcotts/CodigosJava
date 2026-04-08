package DevDojo.Introdução;

public class EstruturaContinue {
    static void main() {
        double valorTotalCar = 30000;

        for (int parcela = (int) valorTotalCar; parcela >= 1; parcela--) {
            double valorParcela = valorTotalCar / parcela;
            if (valorParcela < 1000){
                continue;
            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }
    }
}