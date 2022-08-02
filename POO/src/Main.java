
import classes.Lanches.*;
import classes.cliente.Cliente;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Cliente cl = new Cliente();
        System.out.println("Insira o nome do cliente: ");
        cl.setNome(in.nextLine());
        while (true){
            cl.getPedido().adicionarLanche(montarLanche());
            System.out.println("Deseja mais um lanche? (S/N)");
            if (in.nextLine().equalsIgnoreCase("N")) {
                break;
            }
        }
        System.out.println("Cliente: " + cl.getNome());
        cl.getPedido().imprimirComanda();
    }

    private static Lanche montarLanche() {
        System.out.println("-MENU: Escolha uma opção-");
        System.out.println("(1) - X-Salada");
        System.out.println("(2) - X-Burguer");
        System.out.println("(3) - Misto Quente");
        System.out.println("(4) - Hot Dog");
        System.out.println("(5) - Mini Pizza");
        System.out.println("(6) - Pizza");
        int escolha = 0;
        try {
            escolha = in.nextInt();
        } catch (InputMismatchException e){
            System.out.println("Escolha um lanche valido!");
        } finally {
            in.nextLine();
        }

        Lanche lanche = null;
        switch (escolha) {
            case 1 -> lanche = new XSalada();
            case 2 -> lanche = new XBurguer();
            case 3 -> lanche = new MistoQuente();
            case 4 -> lanche = new HotDog();
            case 5 -> lanche = new MiniPizza();
            case 6 -> lanche = new Pizza();
            default -> System.err.println("Escolha uma opção válida!");
        }
        if (lanche instanceof Sanduiche) {
            System.out.println("Deseja adicionais? (S/N)");
            String adiconais = in.nextLine();
            if (adiconais.equalsIgnoreCase("S")) {
                for (int i = 0; i < 10; i++) {
                    System.out.print("Informe o adicional: ");
                    ((Sanduiche) lanche).adicionarAdicional(in.nextLine());
                    System.out.println("Deseja adicionar mais adicionais? (S/N)");
                    String parada = in.nextLine();
                    if (parada.equalsIgnoreCase("N")) {
                        break;
                    }
                }
            }
            if (lanche instanceof XBurguer) {
                System.out.println("Lanche aberto? (S/N)");
                String aberto = in.nextLine();
                ((XBurguer) lanche).setAberto(aberto.equalsIgnoreCase("S"));
            }
        } else {
            System.out.println("Escolha o sabor da pizza:");
            System.out.println("(1) - 4 Queijos");
            System.out.println("(2) - Calabresa");
            System.out.println("(3) - Frango c/ catupiry");
            System.out.println("(4) - Marguerita");
            System.out.println("(5) - Portuguesa");
            int sabor = in.nextInt();
            in.nextLine();
            MiniPizza miniPizza = ((MiniPizza) lanche);
            switch (sabor) {
                case 1 -> miniPizza.adicionarSaborEIngredientes("4 queijos");
                case 2 -> miniPizza.adicionarSaborEIngredientes("calabresa");
                case 3 -> miniPizza.adicionarSaborEIngredientes("frango c/ catupiry");
                case 4 -> miniPizza.adicionarSaborEIngredientes("marguerita");
                case 5 -> miniPizza.adicionarSaborEIngredientes("portuguesa");
                default -> System.err.println("Escolha um sabor válido");
            }

            if (lanche instanceof Pizza) {
                System.out.println("Informe o tamanho da pizza: ");
                System.out.println("XS - broto");
                System.out.println("SM - pequena");
                System.out.println("MD - média");
                System.out.println("LG - grande");
                System.out.println("XL - família");
                ((Pizza) lanche).setTamanho(in.nextLine().toUpperCase());
            }

            System.out.println("Com borda recheada? (S/N)");
            String aberto = in.nextLine();
            miniPizza.setBordaRecheada(aberto.equalsIgnoreCase("S"));
            if (miniPizza.isBordaRecheada()) {
                System.out.println("Qual o sabor da borda?");
                miniPizza.setSaborBorda(in.nextLine());
            }
        }
        System.out.print("Informe o valor do(a) " + lanche.getTipo() + ": R$");
        lanche.setValor(in.nextDouble());
        in.nextLine();
        return lanche;
    }
}