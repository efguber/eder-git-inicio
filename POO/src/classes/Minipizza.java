package classes;

public class Minipizza extends Lanche {
    public boolean bordaRecheada;
    public String saborBorda;

    public Minipizza() {
        this.adicionarIngrediente("Massa");
        this.adicionarIngrediente("Molho");
        this.adicionarIngrediente("Queijo");
        this.adicionarIngrediente("Calabresa");
        this.tipo = "Mini Pizza";
    }

    @Override
    public void montarComanda() {
        super.montarComanda();
        if (this.bordaRecheada) {
            System.out.println("-- COM BORDA RECHEADA: "+this.saborBorda.toUpperCase()+" --");
        }
    }
}
