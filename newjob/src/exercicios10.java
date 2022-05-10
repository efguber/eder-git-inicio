import java.util.Scanner;

public class exercicios10 {
    public exercicios10() {
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         System.out.println("Informe um numero: ");
         int fatorial = in.nextInt();
         int valorfinal = 1;
         if(fatorial == 0) {
             valorfinal = 0;
         }
         for (int i = fatorial; i > 0; i--) {
             valorfinal *= i;
            System.out.println("Fatorial de " + fatorial + " é " + valorfinal);
            }
            }
        }


