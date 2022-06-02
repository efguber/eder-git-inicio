import java.util.Scanner;

public class exercicios8 {
    public exercicios8() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o numero de linhas: ");
        int linhas = in.nextInt();
        System.out.println("Digite o numero de colunas: ");
        int colunas = in.nextInt();

                for (int i = 0 ; i < linhas; i++) {
                    for (int j = 0; j < colunas; j++) {
                        System.out.print("#");
            }
            System.out.println("");
            }
        }
    }

