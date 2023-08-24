public class Zumbi {
    double vida;
    String nome;

    public double mostraVida(){
        return this.vida;
    }

    public boolean transfereVida(Zumbi zumbiAlvo, double quant){
        if(this.vida > quant){
            vida = vida - quant;
            zumbiAlvo.vida = zumbiAlvo.vida + quant;
            return true;
        }else {
            System.out.println("Impossível tranferir a quantidade de vida");
            return false;
        }

    }

}