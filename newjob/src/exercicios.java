import java.util.Scanner;
public class exercicios {
    public static void main(String[] args) {
        exe06();
    }
    public static void exe01() {
        int varA = 10;
        int varB = 20;
        int varC;
        varC = varA;
        varA = varB;
        varB = varC;
        System.out.println(varA);
        System.out.println(varB);
    }
    public static void exe02() {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int valor = in.nextInt();
        System.out.println(--valor);
    }
    public static void exe03() {
        Scanner in = new Scanner(System.in);
        int base;
        int altura;
        System.out.print("Informe base: ");
        base = in.nextInt();
        System.out.print("Informe altura: ");
        altura = in.nextInt();
        int area = base * altura;
        int perimetro = (base + altura) * 2;
        System.out.println("Area é de: " + area);
        System.out.println("Perimetro é de: " + perimetro);
    }
    public static void exe04() {
        Scanner in = new Scanner(System.in);
        System.out.print("Anos: ");
        int anos = in.nextInt();
        System.out.print("Meses: ");
        int meses = in.nextInt();
        System.out.print("Dias: ");
        int dias = in.nextInt();
        System.out.printf("Voce viveu %d dias", (anos*365)+(meses*30)+dias);

    }
    public static void exe05() {
        Scanner in = new Scanner(System.in);
        System.out.print("Numero total de eleitores: ");
        int eleitores = in.nextInt();
        System.out.print("Numero de votos BRANCOS: ");
        double brancos = in.nextInt();
        System.out.print("Numero de votos NULOS: ");
        double nulos = in.nextInt();

        int validos = (int) (eleitores - brancos - nulos);
        double percentlValidos = (validos*100.0)/eleitores;
        double percentNulos = (nulos*100.0)/eleitores;
        double percentBrancos = (brancos*100.0/eleitores);

        System.out.println("Votos Validos: "+validos);
        System.out.printf("Percentual de votos validos: %2f%%", percentlValidos);
        System.out.printf("Percentual de votos Nulos: %2f%%", percentNulos);
        System.out.printf("Percentual de votos Brancos: %2f%%", percentBrancos);

    }

    public static void exe06() {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe o salario atual do funcionario: R$ ");
        double salAtual = in.nextDouble();
        System.out.print("Informe o % de reajuste: ");
        double reajuste = in.nextDouble();

        double salariofuturo = (salAtual*reajuste) / 100;
        System.out.printf("Salario reajustado: R$%.2f", salariofuturo+salAtual);

    }

}
