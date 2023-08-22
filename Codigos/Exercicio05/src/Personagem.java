public class Personagem {
    String nome;
    int pontos;
    Arma armaUsada;

    void usarArma(){
        int newResistencia;
        newResistencia = armaUsada.resistencia - 2;
        armaUsada.resistencia = newResistencia;
        System.out.println("Resistencia da arma: " + newResistencia);
    }

    void tomarDano(){
        int newVida;
        newVida = pontos - 5;
        pontos = newVida;
        System.out.println("Vida do personagem: " + newVida);
    }
}
