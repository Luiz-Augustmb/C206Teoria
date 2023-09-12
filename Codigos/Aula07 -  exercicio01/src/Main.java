import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner valorTeclado = new Scanner(System.in);

        boolean outraFlag = true;
        int opcaoOutroMenu;

        while (outraFlag){
            System.out.println("-------------------------");
            System.out.println("BEM VINDO AO MENU PARA ADICIONAR CLIENTES!");
            System.out.print("Quandtos clientes deseja adicionar?: ");
            int quantidedeCliente = valorTeclado.nextInt();
            Cliente[] newCliente = new Cliente[quantidedeCliente];
            for(int i = 0 ; i < newCliente.length ; i++){
                Conta conta = new Conta();
                System.out.print("Qual o nome do cliente numero " + (i+1) + " : ");
                String nomeCliente = valorTeclado.nextLine();
                valorTeclado.nextLine();
                conta.setNewClientes(newCliente[i].setNome(nomeCliente));
                System.out.print("Qual o nome do cliente numero " + (i+1) + " : ");
                int cpfCliente = valorTeclado.nextInt();
                conta.setNewClientes(newCliente[i].setCpf(cpfCliente));
            }

        }


        boolean flag = true;
        int opcaoMenu;

        while (flag){
            System.out.println("-------------------------");
            System.out.println("BEM VINDO AO MENU!");
            System.out.println("1 - Checar os saldos!");
            System.out.println("2 - Fazer um deposito!");
            System.out.println("3 - Fazer um saque!");
            System.out.println("4 - Sai do menu!");

            opcaoMenu = valorTeclado.nextInt();

            switch (opcaoMenu){
                case 1:
                    System.out.println(conta.getSaldo());
                    break;
                case 2:
                    System.out.print("Entre com o valor a ser depositado: ");
                    float quantiaDeposito = valorTeclado.nextFloat();
                    conta.deposita(quantiaDeposito);
                    break;
                case 3:
                    System.out.print("Entre com o valor a ser sacado: ");
                    float quantiaSaque = valorTeclado.nextFloat();
                    conta.sacar(quantiaSaque);
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    System.out.println("Opcao Invalida!");
                    break;
            }
        }
    }
}
