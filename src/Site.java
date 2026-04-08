import java.io.*;
import java.util.*;

public class Site {

    public static void main(String[] args) {

        String arquivo = "dados.csv";

        List<String> nomes = new ArrayList<>();
        List<Double> salarios = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {

            String linha;
            br.readLine(); // Pular cabeçalho

            while ((linha = br.readLine()) != null) {

                if (linha.trim().isEmpty()) continue;

                String[] dados = linha.split(",");

                if (dados.length < 3) continue; // evita erro de índice

                try {
                    String nome = dados[0].trim();
                    double salario = Double.parseDouble(dados[2].trim());

                    nomes.add(nome);
                    salarios.add(salario);

                } catch (NumberFormatException e) {
                    System.out.println("Linha ignorada (salário inválido): " + linha);
                }
            }

        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo: " + e.getMessage());
            return;
        }

        if (salarios.isEmpty()) {
            System.out.println("Nenhum salário válido encontrado.");
            return;
        }

        System.out.println("===== RELATÓRIO DE ANÁLISE =====");

        double totalPago = calcularTotal(salarios);
        double media = calcularMedia(salarios);
        double mediana = calcularMediana(new ArrayList<>(salarios));
        double menor = Collections.min(salarios);
        double maior = Collections.max(salarios);
        double desvio = calcularDesvioPadrao(salarios);

        System.out.println("Quantidade de funcionários: " + salarios.size());
        System.out.println("Total pago: R$ " + totalPago);
        System.out.println("Média: R$ " + media);
        System.out.println("Mediana: R$ " + mediana);
        System.out.println("Menor salário: R$ " + menor);
        System.out.println("Maior salário: R$ " + maior);
        System.out.println("Desvio padrão: R$ " + desvio);

        // Listar os funcionários com o maior salário
        System.out.println("\n=== Funcionários com o maior salário ===");
        for (int i = 0; i < salarios.size(); i++) {
            if (salarios.get(i) == maior) {
                System.out.println(nomes.get(i) + " - R$ " + salarios.get(i));
            }
        }

        // Percentual do salário de cada funcionário
        System.out.println("\n=== Percentual do salário em relação ao total pago ===");
        for (int i = 0; i < salarios.size(); i++) {
            double percentual = (salarios.get(i) / totalPago) * 100;
            System.out.printf("%s - R$ %.2f (%.2f%%)%n", nomes.get(i), salarios.get(i), percentual);
        }
    }

    public static double calcularMedia(List<Double> lista) {
        double soma = 0;
        for (double valor : lista) soma += valor;
        return soma / lista.size();
    }
    public static double calcularMediana(List<Double> lista) {
        Collections.sort(lista);
        int tamanho = lista.size();
        if (tamanho % 2 == 0) {
            return (lista.get(tamanho / 2 - 1) + lista.get(tamanho / 2)) / 2;
        } else {
            return lista.get(tamanho / 2);
        }
    }

    public static double calcularDesvioPadrao(List<Double> lista) {
        double media = calcularMedia(lista);
        double soma = 0;
        for (double valor : lista) soma += Math.pow(valor - media, 2);
        return Math.sqrt(soma / lista.size());
    }

    public static double calcularTotal(List<Double> lista) {
        double soma = 0;
        for (double valor : lista) soma += valor;
        return soma;
    }
}