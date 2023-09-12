package org.example;

public class Computador {
    String nome;
    float preco;
    SistemaOperacional sistema;
    HardwareBasico[] hardware =  new HardwareBasico[3];
    MemoriaUSB musb;

    public Computador(String nome, float preco) {
        this.nome = nome;
        this.preco = preco;
    }


    void mostraPCConfigs(){
        System.out.println("Marca: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Hardwares básicos: ");
        System.out.println(hardware[0].nome + " " + hardware[0].capacidade + " MHZ");
        System.out.println(hardware[1].nome + " " +  hardware[1].capacidade + " GB");
        System.out.println(hardware[2].nome + " " +  hardware[2].capacidade + " GB");
        System.out.println("Sistema operacional: " + sistema.nome + " bits");
        System.out.println("Memória USB: " + musb.nome + " de " + musb.capacidade + "GB");
    }

    void addMemoriaUSB(MemoriaUSB novaMusb){
        musb = novaMusb;
    }

    public void setSistema(SistemaOperacional sistema) {
        this.sistema = sistema;
    }

}
