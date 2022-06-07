import classes.ChecklistItem;
import classes.Tarefa;
import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

    }

    public static Tarefa criarTarefa() {
        Tarefa t = new Tarefa();
        System.out.print("Informe o nome da tarefa: ");
        t.setNome(in.nextLine());
        System.out.print("Informe a descrição da tarefa: ");
        t.setDescricao(in.nextLine());
        System.out.print("Ordem da tarefa: ");
        t.setOrdem(in.nextInt());
        in.nextLine();
        System.out.print("Tarefa tem checklist? (S/N)");
        String checkList = in.nextLine();
        System.out.print("Informe o tamanho da checklist: ");
        if (checkList.equalsIgnoreCase("S")) {
            t.criarChecklist(in.nextInt());
            in.nextLine();
            while (true) {
                ChecklistItem item = new ChecklistItem();
                System.out.println("Informe um nome para o item: ");
                item.setNome(in.nextLine());
                System.out.println("Informe uma descrição para o item: ");
                item.setDescricao(in.nextLine());
                System.out.println("Deseja adicionar mais itesn? (S/N)");
                String add = in.nextLine();
                if (add.equalsIgnoreCase("N")) {
                    break;
                }

            }

        }


       //} chaves no lugar errado
    }