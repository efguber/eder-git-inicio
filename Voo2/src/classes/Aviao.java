package classes;

import java.util.ArrayList;

public class Aviao implements MeioTransporte {
    private ArrayList<AssentoVoo> assentos = new ArrayList<>();

    public ArrayList<AssentoVoo> getAssentos() {
        return assentos;
    }

    public void setAssentos(ArrayList<AssentoVoo> assentos) {
        this.assentos = assentos;
    }

    @Override
    public boolean verificaOcupacao(String assento) {
        for (AssentoVoo a : this.assentos) {
            if (a.getCodigo().equalsIgnoreCase(assento)) {
                return a.isOcupado();
            }
        }
        return false;
    }

    @Override
    public int quantidadeLivre() {
        int AssentosLivres = 0;
        for (AssentoVoo a : this.assentos) {
            if (!a.isOcupado()) {
                AssentosLivres++;
            }
        }
        return AssentosLivres;
    }


    @Override
    public void mostrarAssentos() {

    }

    @Override
    public Assento getAssento(String assento) { //para ver se ha assentos livres
        for (AssentoVoo a : this.assentos) {
            if (a.getCodigo().equalsIgnoreCase(assento)) {
                return a;
            }
        }
        return null;
    }

    //abaixo para ver se há acentos livre por classe
    public Assento getAssento(String assento, String classe) { //sobreposição de comportamento de um metodo sem estar subscrevendo ele
        for (AssentoVoo a : this.assentos) { //procurar os assentos na lista
            if (a.getCodigo().equalsIgnoreCase(assento)  //se o codigo do assento for igual ao parametro
                    && a.getClasse().equalsIgnoreCase(classe)) {
                return a; //retorna o assento
            }
        }
        return null; //caso a pessoa digite o numero não existente essa função fara voltar o sistema
    }
}
