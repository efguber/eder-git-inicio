package classes;

public class Hotdog extends Lanche {
    public Hotdog() {
        this.adicionarIngrediente("Pão");
        this.adicionarIngrediente("Salsicha");
        this.adicionarIngrediente("Purê de batata");
        this.adicionarIngrediente("Batata palha");
        this.adicionarIngrediente("Vinagrete");
        this.adicionarIngrediente("Queijo cheddar");
        this.adicionarIngrediente("Milho");
        this.adicionarIngrediente("Ervilha");
        this.tipo = "Hot Dog";
    }
}
