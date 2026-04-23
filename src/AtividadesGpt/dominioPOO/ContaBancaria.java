package AtividadesGpt.dominioPOO;

public class ContaBancaria {
        public String titular;
        public double saldo;

        public void depositar(double valorDeposito) {
            if (valorDeposito <= 0) {
                System.out.println("Erro: valor deve ser maior que zero");
            } else {
                saldo += valorDeposito;
                System.out.println("Depósito realizado!");
                System.out.println("Saldo atual: " + saldo);
            }
        }

        public void sacar(double valorSaque) {
            if (valorSaque > saldo) {
                System.out.println("Erro: saldo insuficiente!");
            } else if (valorSaque <= 0) {
                System.out.println("Erro: valor inválido!");
            } else {
                saldo -= valorSaque;
                System.out.println("Saque realizado!");
                System.out.println("Saldo atual: " + saldo);
            }
        }

        public double verSaldo() {
            return saldo;
        }
    }
