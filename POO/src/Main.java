import classes.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("# JAVA LEE LANCHES e PIZZAS! #");
        System.out.println(" ");
        System.out.println("CARDÁPIO");
        System.out.println("(1) - X-Salada");
        System.out.println("(2) - X-Burguer");
        System.out.println("(3) - Misto Quente");
        System.out.println("(4) - Hot Dog");
        System.out.println("(5) - Mini Pizza");
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
            default:
                System.err.println("Escolha uma opção válida!");
        }
        if (escolha == 1 || escolha == 2) {
            System.out.print("Lanche aberto? (S/N): ");
            in.nextLine();
            String aberto = in.next();
            ((XBurguer) lanche).aberto = aberto.equalsIgnoreCase("S");
        } else if (escolha == 5) {
            System.out.print("Borda recheada? (S/N): ");
            in.nextLine();
            String aberto = in.next();
            Minipizza minipizza = (Minipizza) lanche;
            minipizza.saborBorda = aberto.equalsIgnoreCase("S");
            if (minipizza.borda) {
                System.out.print("Qual o sabor da borda?");
                minipizza.saborBorda = in.nextLine();
            }
        }
            System.out.print("Informe o valor do(a) " + lanche.tipo + " R$: ");
            lanche.valor = in.nextDouble();
            lanche.montarComanda();
        }
}
