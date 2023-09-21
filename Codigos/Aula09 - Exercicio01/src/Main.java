public class Main {
    public static void main(String[] args) {


        BrownieCafe brownieCafe = new BrownieCafe("Brownie de Cafe", 15, "Cafe");
        BrownieDoceDeLeite brownieDoceDeLeite = new BrownieDoceDeLeite("Brownie de Doce de leite", 20, "Doce de Leite");
        BrownieNutela brownieNutela = new BrownieNutela("Brownie de Nutella", 25, "Nutella");


        // Adicionando cada Brownie ao carrinho - pela SuperClasse

        brownieCafe.addCarinhoDeCompras();
        brownieNutela.addCarinhoDeCompras();
        brownieDoceDeLeite.addCarinhoDeCompras();

        //Fazendo adicionais de sabor

        brownieCafe.adicionaCafe();
        brownieNutela.adicionanNutela();
        brownieDoceDeLeite.adicionaDoceDeLeite();

        // Mostrando informações de cada brownie apartir da superclasse

        brownieCafe.mostraInfo();
        brownieNutela.mostraInfo();
        brownieDoceDeLeite.mostraInfo();

        // Calculado o valor total da compra de cada brownie

        brownieCafe.calculaValorTotalCompra();
        brownieNutela.calculaValorTotalCompra();
        brownieDoceDeLeite.calculaValorTotalCompra();
    }
}
