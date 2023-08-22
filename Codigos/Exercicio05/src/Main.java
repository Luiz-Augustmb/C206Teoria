import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Personagem personagem = new Personagem();
        Arma arma = new Arma();

        personagem.armaUsada = arma;
        Scanner valorTeclado = new Scanner(System.in);

        System.out.print("Entre com o nome do seu personagem: ");
        personagem.nome = valorTeclado.nextLine();
        System.out.print("Entre com a vida dele: ");
        personagem.pontos = valorTeclado.nextInt();
        valorTeclado.nextLine();
        System.out.print("Entre com a arma do personagem: ");
        personagem.armaUsada.nome = valorTeclado.nextLine();
        System.out.print("Entre com o poder da arma: ");
        personagem.armaUsada.poder = valorTeclado.nextInt();
        System.out.print("Entre com a resistência da arma: ");
        personagem.armaUsada.resistencia = valorTeclado.nextInt();
        valorTeclado.nextLine();
        System.out.print("Entre com a descrição da arma: ");
        personagem.armaUsada.descricao = valorTeclado.nextLine();

        personagem.armaUsada.mostraInfoArma();

        while (true){
            boolean tomouDano;
            System.out.println("O personagem tomou dano?(TRUE/FALSE)");
            tomouDano = valorTeclado.nextBoolean();
            if(tomouDano){
                personagem.tomarDano();
                if(personagem.pontos <= 0){
                    System.out.println("GAME OVER");
                    break;
                }
            }else {
                System.out.println("INVENCIVEL");
                break;
            }
        }

        while (true){
            boolean usouArma;
            System.out.println("O personagem usou a arma?(TRUE/FALSE)");
            usouArma = valorTeclado.nextBoolean();
            if(usouArma){
                personagem.usarArma();
                if(personagem.armaUsada.resistencia <= 0 ) {
                    System.out.println("ARMA QUEBRADA");
                    break;
                }
            }else {
                System.out.println("ENTÃO USA");
                break;
            }
        }
    }
}
