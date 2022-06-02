import java.util.Scanner;

//Escreva um algoritmo que leia uma palavra e informe se ela é um palíndromo ou não.
//palíndromo: palavra lida ao contrario é a mesma coisa que lida da maneira convencional. Ex. Arara

public class exercicios14 {
    public exercicios14() {
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = in.nextLine();
        StringBuilder palindromo = new StringBuilder();

        for(int i = palavra.length() -1; i >= 0; i--){
        palindromo.append(palavra.charAt(i));
        }
        if(palindromo.toString().equals(palavra)) {
            System.out.print("É um palíndromo!" + "\n" + palindromo);
        }
        else {
            System.out.print("Não é um palíndromo!" + "\n" + palindromo);

        }

    }
}

