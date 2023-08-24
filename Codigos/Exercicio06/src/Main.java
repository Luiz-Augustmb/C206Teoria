import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner valorTeclado = new Scanner(System.in);

        Piloto piloto1 = new Piloto();
        Piloto piloto2 = new Piloto();

        Kart kart1 = new Kart();
        Kart kart2 = new Kart();

        while (true) {

            String cilindradasMotor;
            float velocidade;

            System.out.print("Entre com o nome do primeiro piloto: ");
            piloto1.nome = valorTeclado.nextLine();
            System.out.print("Ele é um vilão?(TRUE / FALSE) ");
            piloto1.vilao = valorTeclado.nextBoolean();

            valorTeclado.nextLine();
            System.out.print("Entre com o nome do Kart dele: ");
            kart1.nome = valorTeclado.nextLine();
            System.out.print("Entre com a cilindradas do motor (50,100,150): ");
            cilindradasMotor = valorTeclado.nextLine();
            if (cilindradasMotor != "50" || cilindradasMotor != "100" || cilindradasMotor != "150") {
                kart1.motorKart.cilindradas = cilindradasMotor;
            } else {
                System.out.println("CILINDRADAS INVÁLIDAS");
                break;
            }

            System.out.print("Entre com a velocidade maxima do motor (0 - 150): ");
            velocidade = valorTeclado.nextFloat();
            if (velocidade > 0 && velocidade <= 150) {
                kart1.motorKart.velocidadeMaxima = velocidade;
            } else {
                System.out.println("VELOCIDADE INVÁLIDA");
                break;
            }

            // Definindo o piloto1 como piloto do kart1
            kart1.pilotoKart = piloto1;
            break;
        }

        valorTeclado.nextLine();

        while (true) {
            System.out.print("Entre com o nome do segundo piloto: ");
            piloto2.nome = valorTeclado.nextLine();
            System.out.print("Ele é um vilão?(TRUE / FALSE) ");
            piloto2.vilao = valorTeclado.nextBoolean();

            valorTeclado.nextLine();
            String cilindradasMotor;
            float velocidade;

            System.out.print("Entre com o nome do Kart dele: ");
            kart2.nome = valorTeclado.nextLine();
            System.out.print("Entre com a cilindradas do motor (50,100,150): ");
            cilindradasMotor = valorTeclado.nextLine();
            if (cilindradasMotor != "50" || cilindradasMotor != "100" || cilindradasMotor != "150") {
                kart2.motorKart.cilindradas = cilindradasMotor;
            } else {
                System.out.println("CILINDRADAS INVÁLIDAS");
                break;
            }

            System.out.print("Entre com a velocidade maxima do motor (0 - 150): ");
            velocidade = valorTeclado.nextFloat();
            if (velocidade >= 0 && velocidade <= 150) {
                kart2.motorKart.velocidadeMaxima = velocidade;
            } else {
                System.out.println("VELOCIDADE INVÁLIDA");
                break;
            }

            // Definindo o piloto1 como piloto do kart1
            kart2.pilotoKart = piloto2;
            break;

        }

        // metodos piloto e kart 1
        piloto1.soltaSuperPoder();
        kart1.pular();
        kart1.fazerDrift();
        kart1.soltarTurbo();
        kart1.motorKart.mostraInfo();

        // metodos piloto e kart 2
        piloto2.soltaSuperPoder();
        kart2.pular();
        kart2.fazerDrift();
        kart2.soltarTurbo();
        kart2.motorKart.mostraInfo();



    }
}