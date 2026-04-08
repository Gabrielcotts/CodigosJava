package LógicaDeProgramação;

public class GastoMensal {
    public static void main(String[] args) {
        double rendaMensal = 923.34;
        double passagemMensal = 242.00;
        double rendaVictor = 150.00;
        double rendaMãe = 100.00;

        double gastofaculdade = 745.52;
        double gastoCadeira = 79.28;
        double gastoMonitor = 98.21;

        double totalArrecadado = rendaMensal + passagemMensal + rendaVictor + rendaMãe;
        double totalDeGastos = gastofaculdade + gastoCadeira + gastoMonitor;
        double totalSobra = totalArrecadado - totalDeGastos;

        System.out.println("totalSobra: " + totalSobra);


    }
}