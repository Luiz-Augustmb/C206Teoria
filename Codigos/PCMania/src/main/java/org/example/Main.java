package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner valorTeclado = new Scanner(System.in);
        Cliente clientePCMania = new Cliente();

        System.out.print("Qual o seu nome cliente?: ");
        clientePCMania.nome = valorTeclado.nextLine();
        System.out.print("E qual o seu CPF?: ");
        clientePCMania.cpf = valorTeclado.nextLong();

        Computador[] computadoresPromocao = new Computador[3];

        // Inicializção PC da promoção 01

        computadoresPromocao[0] = new Computador("Positivos", 2300);
        SistemaOperacional sistemaOper01 = new SistemaOperacional("Linux Ubunto", 32);
        HardwareBasico hardwareBasic01 = new HardwareBasico("Processador Pentium Core I3", 2200);
        HardwareBasico hardwareBasic02 = new HardwareBasico("Memoria RAM", 8);
        HardwareBasico hardwareBasic03 = new HardwareBasico("HD Interno", 500);
        computadoresPromocao[0].hardware[0] = hardwareBasic01;
        computadoresPromocao[0].hardware[1] = hardwareBasic02;
        computadoresPromocao[0].hardware[2] = hardwareBasic03;
        MemoriaUSB mUSB01 = new MemoriaUSB();
        mUSB01.nome = "Pen-drive";
        mUSB01.capacidade = 16;
        computadoresPromocao[0].addMemoriaUSB(mUSB01);

        // Inicializção PC da promoção 02

        computadoresPromocao[1] = new Computador("Acer", 5800);
        SistemaOperacional sistemaOper02 = new SistemaOperacional("Windows 8", 64);
        HardwareBasico hardwareBasic04 = new HardwareBasico("Processador Pentium Core I5", 3370);
        HardwareBasico hardwareBasic05 = new HardwareBasico("Memoria RAM", 16);
        HardwareBasico hardwareBasic06 = new HardwareBasico("HD Interno", 1000);
        computadoresPromocao[1].hardware[0] = hardwareBasic04;
        computadoresPromocao[1].hardware[1] = hardwareBasic05;
        computadoresPromocao[1].hardware[2] = hardwareBasic06;
        MemoriaUSB mUSB02 = new MemoriaUSB();
        mUSB02.nome = "Pen-drive";
        mUSB02.capacidade = 32;
        computadoresPromocao[1].addMemoriaUSB(mUSB02);

        // Inicializção PC da promoção 03

        computadoresPromocao[2] = new Computador("Vaio", 1800);
        SistemaOperacional sistemaOper03 = new SistemaOperacional("Windows 10", 64);
        HardwareBasico hardwareBasic07 = new HardwareBasico("Processador Pentium Core I7", 4500);
        HardwareBasico hardwareBasic08 = new HardwareBasico("Memoria RAM", 32);
        HardwareBasico hardwareBasic09 = new HardwareBasico("HD Interno", 2000);
        computadoresPromocao[2].hardware[0] = hardwareBasic07;
        computadoresPromocao[2].hardware[1] = hardwareBasic08;
        computadoresPromocao[2].hardware[2] = hardwareBasic09;
        MemoriaUSB mUSB03 = new MemoriaUSB();
        mUSB03.nome = "HD Externo";
        mUSB03.capacidade = 1000;
        computadoresPromocao[2].addMemoriaUSB(mUSB03);

        // Setando cada sistema operacional em seu PC
        computadoresPromocao[0].setSistema(sistemaOper01);
        computadoresPromocao[1].setSistema(sistemaOper02);
        computadoresPromocao[2].setSistema(sistemaOper03);


        // MENU

        boolean flag = true;
        int opcaoMenu;
        valorTeclado.nextLine();
        int cont = 0;

        System.out.println("BEM VINDO A PC MANIA " + clientePCMania.nome);
        while (flag){
            System.out.println("-----------------------------------------");
            System.out.println("0 - Sair do menu");
            System.out.println("1 - PC da primeira promocao");
            System.out.println("2 - PC da segunda promocao");
            System.out.println("3 - PC da terceira promocao");
            System.out.print("Qual das nossas 3 promocao deseja?: ");
            opcaoMenu = valorTeclado.nextInt();

            switch (opcaoMenu) {
                case 1:
                    clientePCMania.newComputadores[cont] = computadoresPromocao[0];
                    break;
                case 2:
                    clientePCMania.newComputadores[cont] = computadoresPromocao[1];
                    break;
                case 3:
                    clientePCMania.newComputadores[cont] = computadoresPromocao[2];
                    break;
                case 0:
                    System.out.println("OBRIGADO POR ESCOLHER A PC MANIA!");
                    flag = false;
                    break;
                default:
                    System.out.println("Opcao invalida!");
                    break;
            }

            cont++;

        }

        clientePCMania.mostraInfo();
    }
}