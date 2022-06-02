import java.util.Scanner;

public class exercicios5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Quantas palavras deseja informar?");
        int qtdePal = in.nextInt();  
        String[] palavras = new String[qtdePal];
        for (int i = 0; i < qtdePal; i++) {
            System.out.println("Informe a palavra: ");
            palavras[i] = in.next();
        }
         for (int i = 0; i < palavras.length; i++) {
             String palavraFinal = "";
             if (i == 0){
                 System.out.println(palavras[i]);
                               } else {
                 palavraFinal += ","+palavras[i];
                                
             }
             System.out.println(palavraFinal);
        

        //1. Pedir ao usuario quantas palavras ele deseja informar;
        //2. Pedir ao usuario cada palavra;
        //3. Informar em uma unica linha as palavras que o usuario informou;
        // separadas por virgula;
}
        }


        }






