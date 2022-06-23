import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Double> produtos = new HashMap<>();
        boolean executa = true;
        while (executa) {
            System.out.println("FRUTAS DO VERÃO");
            System.out.println("1 = Cadastrar produto");
            System.out.println("2 = Buscar produto");
            System.out.println("3 = Mostrar lista de produtos");
            System.out.println("4 = Remover produto");
            System.out.println("0 = Sair");
            int escolha = in.nextInt();
            in.nextLine();
            switch (escolha) {
                case 0:
                    executa = false;
                    break;
                case 1:
                    System.out.print("Informe o produto: ");
                    String chave = in.nextLine();
                    if (produtos.containsKey(chave)) {
                        System.out.print("Produto existente, deseja atualizar o valor? (S/N)");
                        if (in.nextLine().equalsIgnoreCase("N")) {
                            continue;
                        }
                    }
                    System.out.print("Informe o valor R$: ");
                    double valor = in.nextDouble();
                    produtos.put(chave, valor);
                    break;
                case 2:
                    if (produtos.isEmpty()) {
                        System.out.println("Não há produtos cadastrados!");
                    } else {
                        System.out.println("Informe o produto:");
                        String busca = in.nextLine().toLowerCase();
                        if (produtos.containsKey(busca)) {
                            System.out.println(busca + " : " + produtos.get(busca));
                        } else {
                            System.out.println("Produto '" + busca + "'não encontrado!");
                        }
                    }
                    break;
                case 3:
                    System.out.println(produtos);
                    break;
                case 4:
                    if (produtos.isEmpty()) {
                        System.out.println("Não há produtos cadastrados!");
                    } else {
                        System.out.println("Informe o produto:");
                        String busca = in.nextLine().toLowerCase();
                        if (produtos.containsKey(busca)) {
                            produtos.remove(busca);
                        } else {
                            System.out.println("Produto '" + busca + "'não encontrado!");
                        }
                    }
                default:
                    System.out.print("INFORME UMA OPÇÃO VÁLIDA! ");
                    break;
            }
        }
        System.out.println(produtos);
    }
}





