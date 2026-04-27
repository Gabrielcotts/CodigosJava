package AtividadesGpt.dominioPOO;

public class ContaBancaria2 {
    public String titular;
    public double saldo = 1000;

    public void depositar(double deposito){
        if (deposito <= 0){
            System.out.println("Atenção, não é possivel depositar esse valor!");
        } else {
            saldo += deposito;
            System.out.println("Seu saldo após o depósito: " + saldo);
        }
    }

    public void sacar(double saque){
        if(saque <= 0 || saque > saldo){
            System.out.println("Atenção, não é possivel sacar esse valor!");
        } else {
            saldo -= saque;
            System.out.println("Saque realizado com sucesso! ");
            System.out.println("Seu saldo após o saque: " + saldo);
        }
    }
    public double verSaldo(){
        return saldo;
    }
}
