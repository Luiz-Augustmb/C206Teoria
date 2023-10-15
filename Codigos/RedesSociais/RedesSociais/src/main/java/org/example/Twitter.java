package org.example;

public class Twitter extends RedeSocial implements Compartilhamento{
    public Twitter(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void compartilhar() {
        System.out.println("Usuário compartilhu uma publicação no Twitter!");
    }

    @Override
    public void postarFoto() {
        System.out.println("Usuário postou uma foto no Twitter!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Usuário postou um vídeo no Twitter!");
    }

    @Override
    public void postarComentario() {
        System.out.println("Usuário comentou em uma publicação no Twitter!");
    }
    @Override
    public void curtirPublicacao(){
        super.curtirPublicacao();
        System.out.println(" no Twitter!");
    }
}
