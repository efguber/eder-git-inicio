package classes.guardados;

import classes.itens.Item;

public class Estante {

    private int capMaxima;
    private Item[] itens;


    public Estante(int capMaxima) {
        setCapMaxima(capMaxima);
        setItens(new Item[capMaxima]);
        //TODO
    }

    public boolean estanteCheia() {


        //TODO
        return false;
    }

    public int quantidadedeItens() {
      //TODO
        return 0;
    }

    public Item buscarItem(String titulo) {
        //TODO
        return null;
    }

    public boolean adicionarItem(Item item) {
        for (int i = 0; i < this.getItens().length; i++) {
            if (this.getItens()[i] == null) {
                this.getItens()[i] = item;
                return true;
            }
        }
        return false;
    }

    public Item removerItem(int posicao) {
        //TODO
        return null;
    }


    // GETTER & SETTER abaixo

    public int getCapMaxima() {
        return capMaxima;
    }

    public void setCapMaxima(int capMaxima) {
        this.capMaxima = capMaxima;
    }

    public Item[] getItens() {
        return itens;
    }

    public void setItens(Item[] itens) {
        this.itens = itens;
    }
}
