package classes.Lanches;

import java.util.ArrayList;

public abstract class Lanche {
    private ArrayList<String> ingredientes = new ArrayList<>();
    private double valor;

    private String tipo;

    public ArrayList<String> getIngredientes() {
        return ingredientes;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void adicionarIngrediente(String ingrediente) {
        this.ingredientes.add(ingrediente);

            }
        }


