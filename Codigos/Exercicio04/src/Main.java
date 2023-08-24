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

        while (true){
            System.out.print("Zumbi 1 tranfere vida para o Zumbi 2? (TRUE / FALSE)");
            if (valorTeclado.nextBoolean()){
                double quantidade;
                System.out.print("Entre com a quantidade de vida a ser tranferida: ");
                quantidade = valorTeclado.nextDouble();
                if (zumbi1.transfereVida(zumbi2, quantidade)){
                    System.out.println("ZUMBI 1 TRANFERIU VIDA PARA O ZUMBI 2");
                    System.out.println("Vida nova do zumbi 1: " + zumbi1.vida);
                    System.out.println("Vida nova do zumbi 2: " + zumbi2.vida);
                }
            }else {
                break;
            }
        }



        while (true){
            System.out.print("O Zumbi 2 tranfere vida para o zumbi 1? (TRUE / FALSE) ");
            if (valorTeclado.nextBoolean()){
                double quantidade;
                System.out.print("Entre com a quantidade de vida a ser tranferida: ");
                quantidade = valorTeclado.nextDouble();
                if (zumbi2.transfereVida(zumbi1, quantidade)){
                    System.out.println("ZUMBI 2 TRANFERIU VIDA PARA O ZUMBI 1");
                    System.out.println("Vida nova do zumbi 1: " + zumbi1.vida);
                    System.out.println("Vida nova do zumbi 2: " + zumbi2.vida);
                }
            }else {
                break;
            }
        }

    }
}