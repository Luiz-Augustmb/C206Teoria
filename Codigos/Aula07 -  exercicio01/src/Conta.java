public class Conta {

    private int numero;
    private float saldo;
    private float limite;
    private Cliente[] newClientes;

    public float getSaldo() {
        for (int i = 0; i < this.newClientes.length; i++){
            if (this.newClientes[i] != null){
                System.out.println("Cliente " + (i+1) + " : " + this.newClientes[i].);
            }
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public Cliente[] getNewClientes() {
        return newClientes;
    }

    public void setNewClientes(Cliente[] newClientes) {
        this.newClientes = newClientes;
    }

    public void sacar(float quantia){
        if(this.saldo > quantia && quantia < this.limite) {
            this.saldo -= quantia;
            System.out.println("Saque realizado!");
        }else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void deposita(float quantia){
        if(quantia > 0){
            this.saldo += quantia;
            System.out.println("Quantia depositada!");
        }else {
            System.out.println("Não foi possivel depoisitar esse valor!");
        }
    }

}
