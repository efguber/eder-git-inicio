import java.util.Scanner;

public class exercicios12 {
    public exercicios12() {
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe um numero: ");
        int numero = in.nextInt();

        int soma = 0;

        for (int i = 1; i < numero; i++) {
            soma += i;
            System.out.println(soma);
            soma = 0;

            }
        }
    }


