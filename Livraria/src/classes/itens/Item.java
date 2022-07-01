package classes.itens;

import java.util.ArrayList;
import java.util.Scanner;

import classes.avaliacao.Avaliacao;

public class Item {

    private String titulo;
    private String genero;
    private double valor;
    private ArrayList<Avaliacao> avaliacoes = new ArrayList<>();


    public void avaliar() {
        Scanner in = new Scanner(System.in);
        Avaliacao a = new Avaliacao();
        System.out.print("Informe o nome do avaliador: ");
        a.setNome(in.nextLine());
        System.out.print("Informe uma nota de 0 a 10: ");
        a.setRating(in.nextDouble());
        in.nextLine();
        System.out.print("Informe algum feedback (opcional): ");
        a.setFeedback(in.nextLine());
        for (int i = 0; i < getAvaliacoes().size(); i++) {
            if (getAvaliacoes().get(i) == null) {
                getAvaliacoes().set(i, a);
                break;
            }
        }
    }

    public double getTotalRating() {
        double soma = 0;
        int contador = 0;
        for (Avaliacao a : getAvaliacoes()) {
            if (a != null) {
                soma += a.getRating();
                contador++;
            }
        }
        return soma / contador;
    }


    // GETTER & SETTER abaixo

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public ArrayList<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(ArrayList<Avaliacao> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }


}
