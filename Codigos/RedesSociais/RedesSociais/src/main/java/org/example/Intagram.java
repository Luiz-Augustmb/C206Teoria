package org.example;

public class Intagram extends RedeSocial{
    public Intagram(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void postarFoto() {
        System.out.println("Usuário postou uma foto no Instagram!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Usuário postou um vídeo no Instagram!");
    }

    @Override
    public void postarComentario() {
        System.out.println("Usuário comentou em uma publicação no Instagram!");
    }
    @Override
    public void curtirPublicacao(){
        super.curtirPublicacao();
        System.out.println(" no Intagram!");
    }
}
