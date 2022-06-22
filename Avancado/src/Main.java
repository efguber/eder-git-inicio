import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ex3();
    }

    public static void ex1() {
        //Pedir para o usuario informar n numeros inteiros ate ele digitar 0.
        //Quando ele digitar 0, mostrar a lista dos numeros digitados por ele.
        ArrayList inteiros = new ArrayList(); //criando a lista de inteiros.
        while (true) { //enquanto for verdade.
            System.out.print("Informe um valor inteiro: "); //entrada de dados do usuario.
            int escolha = in.nextInt(); //imprimir os valores.
            inteiros.add(escolha); //adicionando um item a minha lista.
            if (escolha == 0) { //se o usuario informar 0 o codigo para com o break.
                break;
            }
        }
        System.out.println("Valores informados: "); //descrição simples.
        System.out.println(inteiros); //para mostrar e lista digitada
        //   for (int i = 0; i < inteiros.size(); i++) { //para printar a lista de numeros escolhidos.
        //     if (i > 0 && i < inteiros.size() - 1) { //para definir os parametros de limite. Menor que 0 e na posição correta (-1).
        //       System.out.print(", ");// para adicionar virgulas e espaço entre os numeros informados.
        //  }
        //   System.out.print(inteiros.get(i)); //para mostrar a lista de numeros escolhidos.
    }

    //    ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
    //   arr.add(new ArrayList<>());
    //  arr.add(new ArrayList<>());
    // arr.add(new ArrayList<>());
    // arr.get(0).get(1);

    public static void ex2() {
        //Pedir para o usuario informar valores inteirosaté que seja informado 0
        //Quando for informado 0, mostrar os valores que o usuario digitou.
        //mostrar a soma dos numeros pares e dos numeros impares informados.
        //Mostrar a media de todos os valores informados.

        ArrayList<Integer> inteiros = new ArrayList<>();
        while (true) {
            System.out.print("Informe um valor inteiro: ");
            int escolha = in.nextInt();
            inteiros.add(escolha);
            if (escolha == 0) {
                break;
            }
        }
        System.out.println("Valores informados: " + inteiros);

        int somaPar = 0, somaImpar = 0;
        double somaTotal = 0.0;
        for (int valor : inteiros) {
            if (valor % 2 == 0) {
                somaPar += valor;
            } else {
                somaImpar += valor;
            }
            somaTotal += valor;
        }
        System.out.println("Soma dos valores pares: " + somaPar);
        System.out.println("Soma dos valores impares: " + somaImpar);
        System.out.println("Media dos valores informados: " + (somaTotal / inteiros.size()));
    }

    //Ler o imput do ususario (String) até que seja informado SAIR
    //Pedir pro usuario um valor inteiro > 0.
    //Remover da lista as poalavras que tenha a quantidade de cacteres menor que o numero informado.
    public static void ex3() {

        ArrayList<String> palavras = new ArrayList<>();
        while (true) {
            System.out.print("Informe palavras aleatorias ou SAIR para sair: ");
            String input = in.nextLine();
            if (input.equalsIgnoreCase("sair")) {
                break;
            }
            palavras.add(input);
        }
        System.out.print("Informe um valor inteiro: ");
        int valor = in.nextInt();
        for (int i = 0; i < palavras.size(); i++) {
            if (palavras.get(i).length() < valor) {
                palavras.remove(i);
                i--;
            }
        }
        System.out.print("Palavras informados: " + palavras);
    }

}











