package classes.itens;

import classes.avaliacao.Avaliacao;
import classes.guardados.Estante;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Estante e = new Estante(5);
        boolean loop = true;
        while (loop) {
            int opcao = escolherOpcao();

            switch (opcao) =escolherOpcao() {
                case 0:
                    loop = false;
                    break;
                case 1:
                    loop = new Livro;
                    break;
                case 2:
                    loop = true;
                    break;
                case 3:
                    DVD = true;
                    break;
                case 4:
                    Avaliacao = true;
                    break;
                case 5:
                    Estante = true;
                    break;
                default:
                    System.err.println("Escolha uma opção válida!");
            }
        }
    }

    public static void adicionarItem(Estante e) {
        if (e.estanteCheia()) {
            System.out.println("Sua estante esta cheia! Não é possivel adicinar mais intens!");
        } else {
            Item i = null;
            int escolha = -1;
            while (escolha < 0 || escolha > 1) {
                System.out.println("Informe o item que deseja adicionar (0 - Livro / 1 - DVD");
                escolha = in.nextInt();
                if (escolha < 0 || escolha > 1) {
                    System.err.println("Selecione um opção valida!");
                }
            }
            in.nextLine();
            if (escolha == 0) {
                i = new Livro();
            } else {
                i = new DVD();
            }
            System.out.println("Informe o titulo: ");
            i.setTitulo(in.nextLine());
            System.out.println("Informe o genero: ");
            i.setGenero(in.nextLine());
            System.out.println("Informe o valor: ");
            i.setValor(in.nextDouble());
            in.nextLine();
            if (i instanceof Livro) {
                Livro l = ((Livro) i);
                System.out.println("Informe o autor: ");
                l.setAutor(in.nextLine());
                System.out.println("Informe a quantidade de paginas: ");
                l.setQtdePaginas(in.nextInt());
                System.out.println("Informe o ano de publicação: ");
                l.setAnoPublicacao(in.nextInt());
                System.out.println("Imforme a edição: ");
                l.setEdicao(in.nextInt());
                in.nextLine();
            } else {
                DVD dvd = ((DVD) i);
                System.out.println("Informe o diretor: ");
                dvd.setDiretor(in.nextLine());
                System.out.println("Informe a duração: ");
                dvd.setDuracao(in.nextDouble());
                System.out.println("Informe o ano de lançamento: ");
                dvd.setAnoLancamento(in.nextInt());
                in.nextLine();
            }
            if (!e.adicionarItem(i)) {
                System.out.println("Não foi possivel adicionar o item na estante!");
            } else {
                System.out.println("Item adicionado com sucesso!");
            }
        }

    }
}





