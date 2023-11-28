package org.example;

import org.example.excepition01.ExceptionGrupoExistente;
import org.example.exception02.ExceptionNotaInsuficiente;
import org.example.Exception03.ExceptionProjetoNaoEncontrado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner valorTeclado = new Scanner(System.in);
        AdministraFETIN adminProjetos = new AdministraFETIN();
        boolean flag = true;

        try {
            while (flag) {
                System.out.println("---------------------");
                System.out.println("Bem vindo! Administrador da FETIN");
                System.out.println("1. Adicionar projeto");
                System.out.println("2. Consultar nota");
                System.out.println("3. Sair");

                System.out.print("Escolha uma opção: ");
                int opcao = valorTeclado.nextInt();
                valorTeclado.nextLine();

                switch (opcao) {
                    case 1:
                        System.out.println("---------------------");
                        System.out.println("Adicionando Projeto");

                        boolean projetoAdicionadoComSucesso = false;

                        do {
                            try {
                                System.out.print("Digite o nome do projeto: ");
                                String nomeProjeto = valorTeclado.nextLine();

                                double notaProjeto = 0;
                                boolean notaValida;

                                do {
                                    System.out.print("Digite a nota do projeto: ");
                                    try {
                                        notaProjeto = Double.parseDouble(valorTeclado.nextLine());
                                        notaValida = notaProjeto >= 0 && notaProjeto <= 10; // verificação booleana, se estiver no intervalo a variavel é possitiva
                                        if (!notaValida) {
                                            System.out.println("Nota inválida. Deve estar entre 0 e 10.");
                                        }
                                    } catch (NumberFormatException ex) { // dever entrar com valor númerico, se entrar com letras na nota cairá no catch
                                        System.out.println("Entrada inválida. Por favor, digite um número.");
                                        notaValida = false;
                                    }
                                } while (!notaValida);

                                adminProjetos.adicionarProjetoFetin(nomeProjeto, notaProjeto);
                                System.out.println("Projeto adicionado com sucesso!");
                                projetoAdicionadoComSucesso = true;
                            } catch (ExceptionGrupoExistente | ExceptionNotaInsuficiente e) {
                                System.out.print("Deseja tentar novamente? (S/N): ");
                                String resposta = valorTeclado.next();
                                valorTeclado.nextLine();

                                if (!resposta.equalsIgnoreCase("S")) {
                                    break;
                                }
                            }
                        } while (!projetoAdicionadoComSucesso);
                        break;
                    case 2:
                        System.out.println("---------------------");
                        System.out.print("Digite o nome do projeto para consultar a nota: ");
                        String nomeConsulta = valorTeclado.nextLine();
                        try {
                            double nota = adminProjetos.consultarNota(nomeConsulta);
                            System.out.println("A nota do projeto " + nomeConsulta + " é: " + nota);
                        } catch (ExceptionProjetoNaoEncontrado e) {

                        }
                        break;
                    case 3:
                        flag = false;
                        break;
                    default:
                        System.out.println("Opção inválida! Tente novamente.");
                }
            }
        }catch (Exception e) {
            throw new RuntimeException(e);
        }

        valorTeclado.close();
    }
}
