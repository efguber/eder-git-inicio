package classes.Lanches;

import java.util.ArrayList;

public abstract class Sanduiche extends Lanche {
    public ArrayList<String> adicionais = new ArrayList<>();

    public ArrayList<String> getAdicionais() {
        return adicionais;
    }

    public void adicionarAdicional(String adicional) {
        this.adicionais.add(adicional);

    }
}
