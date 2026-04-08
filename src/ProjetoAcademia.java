package Academia;

public class ProjetoAcademia {

    public double calcularReceita(double mensalidade, int totalAlunos) {
        return mensalidade * totalAlunos;
    }

    public double calcularDespesas(double aluguel, double funcionarios, double energia) {
        return aluguel + funcionarios + energia;
    }

    public double calcularLucro(double receita, double despesas) {
        return receita - despesas;
    }

    public void mostrarResumo(double receita, double despesas, double lucro) {
        System.out.println("\n--- RESUMO FINANCEIRO DA ACADEMIA ---");
        System.out.println("Receita mensal: R$ " + receita);
        System.out.println("Despesas mensais: R$ " + despesas);
        System.out.println("Lucro mensal: R$ " + lucro);

        if (lucro > 0) {
            System.out.println("Situação: Lucro ");
        } else if (lucro == 0) {
            System.out.println("Situação: Empate ");
        } else {
            System.out.println("Situação: Prejuízo ");
        }
    }
}
