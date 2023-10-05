public class Lontra extends Mamifero implements Aquatico{


    public Lontra(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    public void emitirSom() {
        System.out.println("Nao faço ideia o som que uma lontra faz");
    }

    @Override
    public void nadar() {
        System.out.println("Lontrinha esta nadando");
    }
}
