import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner valorTeclado = new Scanner(System.in);

        System.out.print("Entre com o nome da banda: ");
        String nomeBanda = valorTeclado.nextLine();
        System.out.print("A banda " + nomeBanda + " toca qual genero de musica?: ");
        String bandaGenero = valorTeclado.nextLine();

        Banda banda = new Banda(nomeBanda, bandaGenero);

        System.out.print("A banda " + nomeBanda + " possui empresario?(TRUE/FALSE): ");
        boolean possuiEmpresario = valorTeclado.nextBoolean();

        if(possuiEmpresario == false){
            System.out.println("Adicione um empresario!");
            System.out.print("Qual o nome dele: ");
            valorTeclado.nextLine();
            String nomeEmpresario = valorTeclado.nextLine();
            System.out.print("E qual o CNPJ dele: ");
            long empresarioCNPJ = valorTeclado.nextLong();
            Empresario empresarioBanda = new Empresario(nomeEmpresario, empresarioCNPJ);
            banda.empresarioDaBanda = empresarioBanda;
        }

        System.out.print("Deseja adicionar quantas musicas novas?: ");
        int quantidadeMusicas = valorTeclado.nextInt();

        for (int i = 0 ; i < quantidadeMusicas; i++){
            Musica[] musicas = new Musica[quantidadeMusicas];
            System.out.print("Nome da musica: ");
            String nomeMusica = valorTeclado.nextLine();
            System.out.print("Duracao: ");
            float duracaoMusica = valorTeclado.nextFloat();

            musicas[i] = new Musica(nomeMusica, duracaoMusica);
        }

        banda.mostraInfo();
    }
}
