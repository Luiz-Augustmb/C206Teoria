import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner valorTeclado = new Scanner(System.in);

        Zumbi zumbi1 = new Zumbi();
        Zumbi zumbi2 = new Zumbi();

        System.out.print("Entre com a vida do Zumbi 1: ");
        zumbi1.vida = valorTeclado.nextInt();
        System.out.print("Entre com a vida do Zumbi 2: ");
        zumbi2.vida = valorTeclado.nextInt();

        // juntando os dois, a memoria "zumbi1" recebe "zumbi2"
        zumbi1 = zumbi2;

        System.out.println("Vida do Zumbi 1: " + zumbi1.vida);
        System.out.println("Vida do Zumbi 2: " + zumbi2.vida);
    }
}