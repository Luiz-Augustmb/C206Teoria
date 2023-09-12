package org.example;

public class Cliente {
    String nome;
    long cpf;
    Computador[] newComputadores = new Computador[100];

    public float calculaTotalCompra(){
        float total = 0;
        for(int  i = 0 ; i < newComputadores.length; i ++){
            if(newComputadores[i] != null) {
                total += newComputadores[i].preco;
            }
        }
        return total;
    }

    void mostraInfo(){
        System.out.println("-----------------------------------------");
        System.out.println("Informações do cliente: ");
        System.out.println("Nome: " + nome);
        System.out.println("cpf: " + cpf);

        for(int i = 0 ; i < newComputadores.length ; i++){
            if(newComputadores[i] != null) {
                System.out.println("-----------------------------------------");
                System.out.println("Informacao da compra de numero " + (i+1) + ":");
                newComputadores[i].mostraPCConfigs();
            }
        }
        System.out.println("-----------------------------------------");
        System.out.println("Preço total: R$" + calculaTotalCompra());
    }

}
