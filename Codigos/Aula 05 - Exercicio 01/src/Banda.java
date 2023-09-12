public class Banda {
    String nome;
    String genero;
    Empresario empresarioDaBanda;

    public Banda(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
    }

    public void mostraInfo(){
        System.out.println("A banda " + this.nome + " é do genero " + this.genero);
        System.out.println(empresarioDaBanda.nome + " é o empresario, com CNPJ = " + empresarioDaBanda.cnpj);
    }

    public void addMusicaNova(Musica musica){
        
    }

    public void addMembroNovo(){

    }
}
