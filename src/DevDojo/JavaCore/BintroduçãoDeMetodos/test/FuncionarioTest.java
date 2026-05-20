package MaratonaJava.test;

import MaratonaJava.dominio.Funcionario;

import java.util.Scanner;

public class FuncionarioTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Sanji";
        funcionario.idade = 21;
        funcionario.salarios = new double[]{1200.76, 987.32, 1678.21};

        funcionario.imprimeDados();

    }
}
