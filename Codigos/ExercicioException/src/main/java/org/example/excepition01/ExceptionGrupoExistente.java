package org.example.excepition01;

public class ExceptionGrupoExistente extends Exception{

    public ExceptionGrupoExistente(){
        System.out.println("Nome ja está sendo usado por outro grupo");
    }
}
