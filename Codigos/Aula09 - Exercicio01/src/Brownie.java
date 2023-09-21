public class Brownie {

    protected String nome;
    protected double preco;
    protected String sabor;


    public Brownie(String nome, double preco, String sabor) {
        this.nome = nome;
        this.preco = preco;
        this.sabor = sabor;
    }

    public void addCarinhoDeCompras(){
        System.out.println("--------------------------");
        System.out.println(nome + " adcionado ao carrinho de compras");
    }

    public void calculaValorTotalCompra(){
        System.out.println("--------------------------");
        System.out.println(nome + " custa R$ " + preco);
    }

    public void mostraInfo(){
        System.out.println("--------------------------");
        System.out.println("Nome do brownie: "+ nome);
        System.out.println("Preço do brownie: "+preco);
        System.out.println("Sabor do brownie: "+sabor);
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getSabor() {
        return sabor;
    }
}

