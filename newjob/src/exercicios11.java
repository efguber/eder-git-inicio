import java.util.Scanner;
public class exercicios11 {
    public exercicios11() {
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tentativas = 3;
        while (tentativas > 0) {
            System.out.println("Digite seu PIN: ");
            int pin = in.nextInt();
            if (pin == 91352) {
                System.out.println("Acesso liberado!");
                break;
            }
            tentativas--;
            if (tentativas == 0) {
                System.out.println("Acesso bloqueado!");
            } else {
                System.out.println("PIN incorreto, tente novamente");
            }

        }
    }
}



