package org.example.exception02;

public class ExceptionNotaInsuficiente extends Exception{
    public ExceptionNotaInsuficiente() {
        System.out.println("Nota insuficiente! Projeto Reprovado!");
    }
}
