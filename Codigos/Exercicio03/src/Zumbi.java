public class Zumbi {
    double vida;
    String nome;
    public double mostraVida(){
        return vida;
    }

    public void tranfereVida(Zumbi zumbiAlvo, double quantia){
        //vida do zumbi "X" que está tranferindo a vida abaixa
        vida = vida - quantia;

        //vida do zumbi "Y" que recebe a vida aumenta
        zumbiAlvo.vida = zumbiAlvo.vida + quantia;
    }

}
