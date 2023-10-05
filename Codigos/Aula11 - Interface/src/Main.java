public class Main {

    public static void main(String[] args) {

        Cachorro c1 = new Cachorro("Caramelo", 100);
        Lontra l1 = new Lontra("Lontrinha", 90);
        Boi b1 = new Boi("Mimosa", 70);

        // Mostrando os métodos do cachorro

        c1.mostraInfo();
        c1.emitirSom();

        // Mostrando os métodos do Boi

        b1.mostraInfo();
        b1.emitirSom();

        // Mostrando os métodos da lontra

        /*
            A classe lontra implementa a interface "Aquatico" e assim tem o acesso a assinatura do método nadar,
            que foi sobrescrito na classe lontra
         */
        l1.mostraInfo();
        l1.emitirSom();
        l1.nadar();
    }
}
