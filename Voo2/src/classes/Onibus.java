package classes;

import java.util.ArrayList;

public class Onibus implements MeioTransporte {
    private ArrayList<AssentoOnibus> assentos = new ArrayList<>();


    private boolean leito;


    public Onibus(int linhasCadeiras) {
        for (int i = 1; 1 <= 4 * linhasCadeiras; i++) { //professor passou que o onibus possui 4 cadeiras por linha
            AssentoOnibus a = new AssentoOnibus(); //criamos uma nova variante ou classe para poder executar a adição das cadeiras
            a.setLugar(String.valueOf(i)); //usamos este metodo para igualizar a String com Int
            assentos.add(a); // maneira de adicionar assentos no onibus
        }
    }

    //GETTER E SETTER ABAIXO

    public ArrayList<AssentoOnibus> getAssentos() {
        return assentos;
    }

    public void setAssentos(ArrayList<AssentoOnibus> assentos) {
        this.assentos = assentos;
    }

    public boolean isLeito() {
        return leito;
    }

    public void setLeito(boolean leito) {
        this.leito = leito;
    }

    //GETTER E SETTER ACIMA

    @Override
    public boolean verificaOcupacao(String assento) {
        for (AssentoOnibus a : this.assentos) {
            if (a.getLugar().equalsIgnoreCase(assento)) {
                return a.isOcupado();
            }
        }
        return false;
    }

    @Override
    public int quantidadeLivre() {
        int assentosLivre = 0;
        for (AssentoOnibus a : this.assentos) {
            if (!a.isOcupado()) {
                assentosLivre++;
            }
        }
        return assentosLivre;
    }

    //FALTA FAZER O MOSTRAR ASSENTOS CFME ABAIXO
    //    [01][02] || [03][04]
    //    [05][06] || [07][08]
    //    [09][10] || [11][12]
    //    [13][14] || [15][16]

    @Override
    public void mostrarAssentos() {
        for (int i = 0; i < assentos.size(); i++) {

            if (assentos.get(i).isOcupado()) {
                System.out.println("XX");
            }
            if (i % 4 == 0) {
                System.out.println();
            }
            if (i < 9) {
                System.out.println("[0" + assentos.get(i).getLugar() + "]");

            } else if (i > 9) {
                System.out.println("[" + assentos.get(i).getLugar() + "]");
            }
        }
    }


    @Override
    public Assento getAssento(String assento) {
        for (AssentoOnibus a : this.assentos) {
            if (a.getLugar().equalsIgnoreCase(assento)) {
                return a;
            }
        }
        return null;
    }
}