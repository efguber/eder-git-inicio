package classes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Escolha quantas linhas ");
        Onibus onis = new Onibus(in.nextInt());
        onis.mostrarAssentos();
    }
}
