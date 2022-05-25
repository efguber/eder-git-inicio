package classes;

public class XBurguer extends Lanche {

    public boolean aberto;

    public XBurguer() {
        this.adicionarIngrediente("Hamburguer");
        this.adicionarIngrediente("Presunto");
        this.adicionarIngrediente("Queijo");
        this.adicionarIngrediente("Pão");
        this.tipo = "X Burguer";
    }

    @Override
    public void montarComanda() {
        super.montarComanda();
        if (this.aberto) {
            System.out.println("-LANCHE ABERTO-");
        }

    }

}