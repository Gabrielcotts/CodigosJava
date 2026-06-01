package AtividadesGpt.PraticaDevDojo.Dominio;

public class SistemaContaBancaria {
    private String titular;  
    private double saldo;

    public void depositar(double valorDeposito) {
        if (valorDeposito <= 0) {
            System.out.println("Valor inválido!");
            System.out.println("Tente novamente.");
            return;
        } else {
            this.saldo = this.saldo + valorDeposito;
            System.out.println("Sucesso no deposito!");
            System.out.println("Seu saldo após o depósito é de R$ " + this.saldo);
        }
    }

    public void sacar(double valorSaque) {

        if (valorSaque > this.saldo || valorSaque <= 0) {
            System.out.println("Valor inválido!");
            System.out.println("Tente novamente.");
            return;
        } else {
            this.saldo = this.saldo - valorSaque;
            System.out.println("Saque realizado com sucesso!");
            System.out.println("Seu saldo após o saque R$ " + this.saldo);
        }
    }

    public double verSaldo() {
        return this.saldo;
    }

    public String getTitular() {
        return this.titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setTitular(String titular) {
        if (titular == null || titular.isEmpty()) {
            System.out.println("Nome inválido!");
            return;
        }
        this.titular = titular;
    }
}
