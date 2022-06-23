package classes.guardados;

import classes.itens.Item;

public class Estante {
    private int capMaxima;
    private Item[] itens;

    public Estante(int capMaxima) {
        setCapMaxima(capMaxima);
        setItens(new Item[capMaxima]);
    }

    public boolean estanteCheia() {
        return this.quantidadeItens() == this.getCapMaxima(); //metodo de verificação boobleano enxuto. informando de forma simples.
    }

    public int quantidadeItens() {
        int contador = 0; //variante criada para contar os itens checados.
        for (Item i : this.getItens()) { //esta configuração usa-se quando pretende-se percorrer todas as posições matriz (forma simplificada).
            if (i != null) {
                contador++;
            }
        }
        return contador;//retorna ao ponto de parada para somar os valores.
    }

    public Item buscarItem(String titulo) {
        for (Item i : this.getItens()) {
            if (i != null && i.getTitulo().toLowerCase().contains(titulo.toLowerCase())) { //para igualar/padronizar todas as entradas em minusculas
                return i;
            }
        }
        return null;
    }

    public boolean adicionarItem(Item i) {
        for (int i = 0; i < this.getItens().length; i++) { //para ver os espaços null e ocupa-los com novos itens.
            if (this.getItens()[i] == null) {
                Item item = null;
                this.getItens()[i] = item;
                return true;
            }
        }
        return false;
    }

    public Item removerItem(int posicao) { //para remover itens guardando o valor da posição original na variavel "i".
        Item i = this.getItens()[posicao];
        this.getItens()[posicao] = null;
        return i;
    }

    // GETTERS & SETTERS

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