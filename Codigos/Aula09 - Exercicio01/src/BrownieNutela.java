public class BrownieNutela extends Brownie{

    public BrownieNutela(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    public void adicionanNutela(){
        System.out.println(super.nome + " adicione mais nutela");
    }
}
