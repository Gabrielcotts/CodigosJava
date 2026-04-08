package LógicaDeProgramação;

public class Strings {
        public static void main(String[] args) {

            String nome = "Gabriel";
            String nome2 = "Gabriel";

            int tamanhoDaString = nome.length();
            boolean saoIguais = nome.equals(nome2);


            { System.out.println("Olá " + nome.toLowerCase() + " seu nome tem " + tamanhoDaString + " caracteres");
                System.out.println("os nomes são iguais: " + saoIguais);


                String nomeNoiva = "Nathaly ";
                String sobrenomeNoiva = "Badias Pupo";

                int tamanhoDaString2 = nomeNoiva.length();
                boolean SaoDiferentes = nomeNoiva.equals(nome);
                String nomeCompleto = nomeNoiva.concat(sobrenomeNoiva);

                System.out.println("Olá, " + nome + " seu nome tem " + tamanhoDaString2 + " letras" );
                System.out.println("Os nomes são iguais: " + SaoDiferentes);
                System.out.println("Nome completo: " + nomeCompleto);

            }

        }
    }