package AtividadesGpt.PraticaDevDojo.Test;

import AtividadesGpt.PraticaDevDojo.Dominio.ControleVendasSemanais;

public class ControleVendasSemanaisTest {
    public static void main(String[] args) {

        ControleVendasSemanais controleVendasSemanais = new ControleVendasSemanais();
        controleVendasSemanais.registroVendas(473.12, 214.63,565.14, 127.17, 399.11);
        controleVendasSemanais.imprimeDados();
    }
}
