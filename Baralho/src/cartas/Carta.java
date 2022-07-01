package cartas;

public class Carta {
    private Naipe naipe;
    private ValorCarta valor;

    private int valorReal;


    //GETTER E SETTER ABAIXO

    public int getValorReal() {
        return valorReal;
    }

    public void setValorReal(int valorReal) {
        this.valorReal = valorReal;
    }

    public Naipe getNaipe() {
        return naipe;
    }

    public void setNaipe(Naipe naipe) {
        this.naipe = naipe;
    }

    public ValorCarta getValor() {
        return valor;
    }

    public void setValor(ValorCarta valor) {
        this.valor = valor;
    }
}