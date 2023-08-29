import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner valorTeclado = new Scanner(System.in);

        Cantina cantina = new Cantina();
        cantina.nome = "Cantina do Inatel";

        Salgado[] salgado = new Salgado[3];
        salgado[0] = new Salgado();
        salgado[1] = new Salgado();
        salgado[2] = new Salgado();

        System.out.println("ADICIONE 3 SALGADOS NOVA NA CANTINA");
        for (int i = 0; i < salgado.length ; i++){
            System.out.print("Salgado " + i + ": ");
            salgado[i].nome = valorTeclado.nextLine();
            cantina.addSalgado(salgado[i]);
        }

        cantina.mostraInfo();

    }
}
