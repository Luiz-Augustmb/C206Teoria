package org.example;

import org.example.excepition01.ExceptionGrupoExistente;
import org.example.exception02.ExceptionNotaInsuficiente;
import org.example.Exception03.ExceptionProjetoNaoEncontrado;
import org.example.exception04.ExceptionNotaInvalida;



import java.util.HashMap;
import java.util.Map;

public class AdministraFETIN {

    private Map<String, Double> projetosFetin;

    public AdministraFETIN() {
        this.projetosFetin = new HashMap<>();
    }

    public void adicionarProjetoFetin(String nome, double nota) throws ExceptionGrupoExistente, ExceptionNotaInsuficiente, ExceptionNotaInvalida {
        if (projetosFetin.containsKey(nome)) {
            throw new ExceptionGrupoExistente();
        }

        if (nota < 0 || nota > 10) {
            throw new ExceptionNotaInvalida();
        }

        if (nota < 6) {
            throw new ExceptionNotaInsuficiente();
        }

        projetosFetin.put(nome, nota);
    }

    public double consultarNota(String nome) throws ExceptionProjetoNaoEncontrado {
        if (!projetosFetin.containsKey(nome)) {
            throw new ExceptionProjetoNaoEncontrado();
        }

        return projetosFetin.get(nome);
    }
}
