public class Kart {

    String nome;
    Motor motorKart;
    Piloto pilotoKart;

    // Sem o kart nao existe motor, então se intancia o motor quando entrar o Kart
    public Kart(){

        motorKart = new Motor();
    }

    public void pular(){

        System.out.println("KART " + nome + " PULOU");
    }

    public void soltarTurbo(){

        System.out.println("KART " +nome + " ativou o TURBO");
    }

    public void fazerDrift(){

        System.out.println("KART " +nome + " fez um DRIFT");
    }

}
