import java.util.Scanner;

public class exercicios2 {
    public static void main (String[] args) {
        exe01();
    }
    public static void exe01 () {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe um valor:");
        int valor = in.nextInt();


        if (valor > 10) {
            System.out.println("Maior que 10");
        } else {
            System.out.println("Menor que 10");
        }

        }


    public static void exe02 () {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe um valor:");
        int valor = in.nextInt();

        if (valor >=0) {
            System.out.println("Valor positivo");
        }  else {
            System.out.println("Valor negativo");
        }

    }

    public static void exe03 () {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe o numero de maçâs compradas:");
        double valor = in.nextDouble();

        if (valor <12) {
            System.out.printf("Valor da compra: R$%.2f", valor*1.3);
} else {
            System.out.printf("Valor da compra: R$%.2f", valor*1.0);
        }
    }
    public static void exe04 () {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe o ano que voce nasceu: ");
        int anoNasc = in.nextInt();
        System.out.println("Informe o ano atual: ");
        int anoatual = in.nextInt();
        System.out.println();
        if ((anoatual-anoNasc) < 16) {
            System.out.println("Nao pode votar!");
        } else {
            System.out.println("Pode votar!");
        }

    }


    public static void exe05 () {
        Scanner in = new Scanner(System.in);
        System.out.println("Primeiro valor:");
        int valA = in.nextInt();
        System.out.println("Segundo valor:");
        int valB = in.nextInt();

        if (valA > valB) {
            System.out.println(valA);
        } else {
            System.out.println(valB);
        }
    }
    public static void exe06 () {
        Scanner in = new Scanner(System.in);
        System.out.println("Primeiro valor:");
        int valA = in.nextInt();
        System.out.println("Segundo valor:");
        int valB = in.nextInt();

        if (valA > valB) {
            System.out.println(valB);
            System.out.println(valA);
        } else {
            System.out.println(valA);
            System.out.println(valB);
        }
    }
    public static void exe07 () {
        Scanner in = new Scanner(System.in);
        System.out.println("Hora de inicio:");
        int horInicio = in.nextInt();
        System.out.println("Hora do término:");
        int horTermi = in.nextInt();

        if (horInicio > horTermi) {
            System.out.printf("Duracao do jogo: %d", 24 - (horInicio - horTermi));
        } else {
            System.out.printf("Duracao do jogo: %d", horTermi-horInicio);
        }

        }


}





