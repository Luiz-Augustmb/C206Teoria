package org.example.exception04;

public class ExceptionNotaInvalida extends IllegalArgumentException {
    public ExceptionNotaInvalida() {
        System.out.println("Nota inválida, Valor deve ser entre 0 - 10");
    }
}
