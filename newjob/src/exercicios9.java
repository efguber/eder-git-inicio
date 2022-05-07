import java.util.Scanner;

public class exercicios9 {
    public exercicios9() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int soma = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Informe um numero inteiro: ");
            soma += in.nextInt();
        }
        System.out.println("A soma é: "+soma);

            }
            
        }




