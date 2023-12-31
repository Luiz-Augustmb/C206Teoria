public class Cliente {

    private String nome;
    private long cpf;

    public Cliente(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public Cliente[] setNome(String nome) {
        this.nome = nome;
        return new Cliente[0];
    }

    public long getCpf() {
        return cpf;
    }

    public Cliente[] setCpf(long cpf) {
        this.cpf = cpf;
        return new Cliente[0];
    }
}
