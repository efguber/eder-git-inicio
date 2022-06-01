package Lanchonete;

public class XBurguer extends Lanche {
    private boolean aberto;

    public XBurguer() {
        this.adicionarIngrediente("Hamburguer");
        this.adicionarIngrediente("Presunto");
        this.adicionarIngrediente("Queijo");
        this.adicionarIngrediente("Pão");
        this.settipo("X Burguer");
    }

    public String montarComanda() {
        super.montarComanda();
        if (this.getaberto()) {
            System.out.println("-LANCHE ABERTO-");
        }

        return null;
    }

    public void setAberto(boolean sabor) {
        this.aberto = sabor;
    }

    public boolean getaberto() {
        return this.aberto;
    }
}
