import java.util.Scanner;

public class exercicios15 {
    public static void main(String[] args) {
        exe09();
    }

    public static void exe01() {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite algo:");
        String algo = in.nextLine();
        System.out.println("Length: " + algo.length());
        System.out.println("Maiusculas: " + algo.toUpperCase());
        System.out.println("Minusculas: " + algo.toLowerCase());
    }

    public static void exe02() {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite alguma coisa: ");
        String algumaCoisa = in.nextLine();
        System.out.println("Digite alguma coisa de novo: ");
        String algumaOutraCoisa = in.nextLine();
        if (algumaCoisa.equals(algumaOutraCoisa)) {
            System.out.println("São exatamente iguais");
        } else if (algumaCoisa.equalsIgnoreCase(algumaOutraCoisa)) {
            System.out.println("São iguais independente de formatação");
        } else {
            System.out.println("São diferentes");
        }
    }

    public static boolean exe03() {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite uma palavra:");
        String palavra1 = in.nextLine();
        System.out.println("Digite outra palavra: ");
        String palavra2 = in.nextLine();
        if (palavra1.contains(palavra2)) {
            System.out.println(palavra2 + " faz parte de " + palavra1);
        } else if (palavra2.contains(palavra1)) {
            System.out.println(palavra1 + " faz parte de " + palavra2);
        } else {
            System.out.println("Nenhuma String faz parte da outra");
        }
        return false;
    }

    public static void exe04() {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite algo:");
        String palavra1 = in.nextLine();
        System.out.println("Digite outra palavra: ");
        String palavra2 = in.nextLine();

        if (palavra1.startsWith(palavra2)) {
            System.out.println(palavra2 + " é prefixo de " + palavra1);
        } else if (palavra2.startsWith(palavra1)) {
            System.out.println(palavra1 + " é prefixo de " + palavra2);
        } else {
            System.out.println("As Strings não são prefixo uma da outra.");
        }
    }

    public static void exe05() {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite algo:");
        String palavra1 = in.nextLine();
        System.out.println("Digite outra palavra: ");
        String palavra2 = in.nextLine();

        if (palavra1.endsWith(palavra2)) {
            System.out.println(palavra2 + " é sufixo de " + palavra1);
        } else if (palavra2.endsWith(palavra1)) {
            System.out.println(palavra1 + " é sufixo de " + palavra2);
        } else {
            System.out.println("As Strings não são sufixo uma da outra.");

        }
    }

    public static void exe06() {
        String cyphered = "lala#lwve#-rwgra22lalang!#<3";
        String decyphered = cyphered.replace("w", "o");
        decyphered = decyphered.replace("#", " ");
        decyphered = decyphered.replace("2", "m");
        decyphered = decyphered.replace("lala", "i");
        decyphered = decyphered.replace("-", "p");
        System.err.println(decyphered);
    }

    public static void exe07() {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite a quantidade de números desejada: ");
        int nums = in.nextInt();
        int[] numeros = new int[nums];
        for (int i = 0; i < nums; i++) {
            System.out.print("Informe números de acordo com a quantidade: ");
            numeros[i] = in.nextInt();
        }
        int somaPar = 0, somaImpar = 0;
        for (int valor : numeros) {
            if (valor % 2 == 0) {
                somaPar += valor;
            } else {
                somaImpar += valor;
            }
        }
        System.out.println("Soma dos valores pares: " + somaPar);
        System.out.println("Soma dos valores impares: " + somaImpar);
    }

    public static void exe08() {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite a quantidade de palavras desejada: ");
        int nums = in.nextInt();
        String[] palavras = new String[nums];
        for (int i = 0; i < nums; i++) {
            System.out.print("Informe uma palavra: ");
            palavras[i] = in.next();
        }
        System.out.println("Informe um numero > 0: ");
        int numeroCorte = in.nextInt();
        for (int i = 0; i < nums; i++) {
            if (palavras[i].length() < numeroCorte) {
                palavras[i] = null;
            }
        }
        for (String palavra : palavras) {
            if (palavra != null) {
                System.out.println(palavra);
            }
        }
    }

    public static void exe09() {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite a quantidade de numeros da primeira lista: ");
        int nums = in.nextInt();
        int[] numeros1 = new int[nums];
        for (int i = 0; i < nums; i++) {
            System.out.print("Informe um numero: ");
            numeros1[i] = in.nextInt();
        }
        System.out.print("Digite a quantidade de numeros da segunda lista: ");
        int nums2 = in.nextInt();
        int[] numeros2 = new int[nums2];
        for (int i = 0; i < nums2; i++) {
            System.out.print("Informe um numero: ");
            numeros2[i] = in.nextInt();
        }
        for (int valor1 : numeros1) {
            boolean achou = false;
            for (int valor2 : numeros2) {
                if(valor1 == valor2) {
                    achou = true;
                    break;
                }
            }
            if(!achou) {
                System.out.println(valor1);
            }
        }
    }
}


