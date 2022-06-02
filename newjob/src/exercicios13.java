import java.util.Scanner;
//Leia o nome completo de um usuario (nome + sobrenome) e informe a abreviacao do nome (iniciais).
//Ex. Carlos Brasil = C.B.

public class exercicios13 {
    public exercicios13() {
    }
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     System.out.print("Digite seu nome completo: ");
     String nome = in.nextLine();
     String [] nomes = nome.split(" ");
        System.out.println(nome);
        System.out.println(nomes[0].charAt(0)+". "+nomes[1].charAt(0)+".");

        }
}









