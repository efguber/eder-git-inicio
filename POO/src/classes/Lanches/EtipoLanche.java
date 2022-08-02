package classes.Lanches;

public enum EtipoLanche {
    X_SALADA("1"),
    X_BURGUER("2"),
    MISTO_QUENTE("3"),
    HOT_DOG("4"),
    MINI_PIZZA("5"),
    PIZZA("6");

    private final String valor;

    EtipoLanche(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return this.valor;
    }
}
