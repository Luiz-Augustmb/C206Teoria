import Mamifero.Boi;
import Mamifero.Cachorro;
import Mamifero.Lontra;

public class Main {

    public static void main(String[] args) {


        // Instanciando um cachorro e chamando o seu método Abstract e o método mostraInfo() da superClass que ele estende
        Cachorro cachorro = new Cachorro("Caramelo", 100);

        cachorro.mostraInfo();
        cachorro.emitirSom();

        // Instanciando um lontra e chamando o seu método Abstract e o método mostraInfo() da superClass que ele estende
        Lontra lontra = new Lontra("Lontrinha", 80);

        lontra.mostraInfo();
        lontra.emitirSom();

        // Instanciando um boi e chamando o seu método Abstract e o método mostraInfo() da superClass que ele estende
        Boi boi = new Boi("Mimosa", 60);

        boi.mostraInfo();
        boi.emitirSom();

    }
}
