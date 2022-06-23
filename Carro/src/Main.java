import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Double> carro = new HashMap<>();
        boolean executa = true;
        while (executa) {
            System.out.println("1 = Cadastrar o carro e o valor");
            System.out.println("2 = Localizar um carro especifico na lista");
            System.out.println("3 = Mostrar todos os carros da lista");
            System.out.println("4 = Vender um carro");
            System.out.println("0 = Sair");
            int escolha = in.nextInt();
            in.nextLine();
            switch (escolha) {
                case 0:
                    executa = false;
                    break;
                case 1:
                    System.out.print("Informe o carro: ");
                    String chave = in.nextLine();
                    if (carro.containsKey(chave)) {
                        System.out.print("Carro existente, deseja atualizar o valor? (S/N)");
                        if (in.nextLine().equalsIgnoreCase("N")) {
                            continue;
                        }

                    }
                    System.out.print("Informe o valor do carro R$: ");
                    double valor = in.nextDouble();
                    carro.put(chave, valor);
                    break;
                case 2:
                    if (carro.isEmpty()) {
                        System.out.println("Não há esse carro cadastrado!");
                    } else {
                        System.out.println("Informe o carro:");
                        String busca = in.nextLine().toLowerCase();
                        if (carro.containsKey(busca)) {
                            System.out.println(busca + " : " + carro.get(busca));
                        } else {
                            System.out.println("Veiculo '" +busca+ "' não encontrado!");
                        }
                    }
                    break;
                case 3:
                    System.out.println(carro);
                    break;
                case 4:
                    if (carro.isEmpty()) {
                        System.out.println("Não há carros cadastrados!");
                    } else {
                        System.out.println("Informe o carro:");
                        String busca = in.nextLine().toLowerCase();
                        if (carro.containsKey(busca)) {
                            carro.remove(busca);
                        } else {
                            System.out.println("Veiculo '"+ busca+ "'não encontrado!");
                        }
                    }
                default:
                    System.out.println("Carro vendido!");
                    break;
            }
        }
        System.out.println(carro);
    }
}




