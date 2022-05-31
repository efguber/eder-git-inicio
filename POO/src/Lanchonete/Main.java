package Lanchonete;

import java.util.Scanner;

public class Main {
    public static <lanche> void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("# JAVA LEE LANCHES e PIZZAS! #");
        System.out.println(" ");
        System.out.println("CARDÁPIO");
        System.out.println("(1) - X-Salada");
        System.out.println("(2) - X-Burguer");
        System.out.println("(3) - Misto Quente");
        System.out.println("(4) - Hot Dog");
        System.out.println("(5) - Mini Pizza");
        System.out.println("(6) - Pizza");
        System.out.println(" ");
        System.out.print("Opção escolhida: ");


        int escolha = in.nextInt();
        Lanche lanche = null;
        switch (escolha) {
            case 1:
                lanche = new XSalada();
                break;
            case 2:
                lanche = new XBurguer();
                break;
            case 3:
                lanche = new Mistoquente();
                break;
            case 4:
                lanche = new Hotdog();
                break;
            case 5:
                lanche = new Minipizza();
                break;
            case 6:
                lanche = new Pizza();
                break;
            default:
                System.err.println("Escolha uma opção válida!");
        }
        if (escolha == 1 || escolha == 2) {
            System.out.print("Lanche aberto? (S/N): ");
            in.nextLine();
            String aberto = in.next();
            ((XBurguer) lanche).setAberto(aberto.equalsIgnoreCase("S"));
        } else if (escolha == 5) {
            System.out.println("Escolha o sabor da pizza:");
            System.out.println("(1) = 4 QUEIJOS");
            System.out.println("(2) = CALABRESA");
            System.out.println("(3) = FRANGO COM CATUPIRY");
            System.out.println("(4) = MARGUERITA");
            System.out.println("(5) = PORTUGUESA");
            int sabor = in.nextInt();
            in.nextLine();
            Minipizza minipizza = ((Minipizza) lanche);

            switch (sabor) {
                case 1:
                    minipizza.adicionarSaboreIngredientes("4 QUEIJOS");
                    break;
                case 2:
                    minipizza.adicionarSaboreIngredientes("CALABRESA");
                    break;
                case 3:
                    minipizza.adicionarSaboreIngredientes("FRANGO COM CATUPIRY");
                    break;
                case 4:
                    minipizza.adicionarSaboreIngredientes("MARGUERITA");
                    break;
                case 5:
                    minipizza.adicionarSaboreIngredientes("PORTUGUESA");
                    break;
                default:
                    System.err.println("Escolha um sabor válido!");
            }
            if (lanche instanceof Pizza) {
                System.out.println("Informe o tamanho da pizza: ");
                System.out.println("XS = Broto");
                System.out.println("SM = Pequena");
                System.out.println("MD = Média");
                System.out.println("LG = Grande");
                System.out.println("XL = Extra Grande");
                ((Pizza) lanche).setTamanho(in.nextLine().toUpperCase());
            }

            System.out.print("Com borda recheada? (S/N) ");
            String aberto = in.nextLine();
            minipizza.setBordaRecheada(aberto.equalsIgnoreCase("S"));
            if (minipizza.isBordaRecheada()) {
                System.out.print("Qual o sabor da borda? ");
                minipizza.setSaborBorda(in.nextLine());
            }
        }
        System.out.print("Informe o valor do(a) " + lanche.getTipo() + " R$: ");
        lanche.setValor(in.nextDouble());
        lanche.montarComanda();
    }
}