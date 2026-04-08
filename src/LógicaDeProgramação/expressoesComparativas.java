package LógicaDeProgramação;

import java.util.Scanner;

public class expressoesComparativas {
    public static void main(String[] args) {
        int arroz = 12;
        int feijao = 8;

        System.out.println(arroz == feijao);
        System.out.println(arroz != feijao);
        System.out.println(arroz > feijao);
        System.out.println(arroz < feijao);
        System.out.println(arroz >= feijao);
        System.out.println(arroz <= feijao);

        Scanner scanner = new Scanner(System.in);

        System.out.println(" <  significa maior e > significa menor, correto?: SIM(true) NÂO(false) ");
        boolean simbolo = scanner.nextBoolean();
        System.out.println("Sua resposta: " + simbolo);
    }
}