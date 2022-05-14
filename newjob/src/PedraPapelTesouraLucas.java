import com.sun.source.tree.WhileLoopTree;

import java.util.Random;
import java.util.Scanner;

public class PedraPapelTesouraLucas {
    public PedraPapelTesouraLucas() {
}
    public static void main(String[] args) {
        Random r = new.Randon();
        Scanner in = new Scanner(System.in);
        int pontuacaoJ1 = 0;
        int pontuacaoJ2 = 0;
        while (pontuacaoJ1 < 10 && pontuacaoJ2 < 10) {
            int escolhaUsuario = -1;
            while(escolhaUsuario != 0 || escolhaUsuario != 1 || escolhaUsuario !=2) {
                System.out.println("Escolha (0) Pedra, (1) Papel ou (2) Tesoura: ");
                escolhaUsuario = in.nextInt();
            }

            int escolhaUsuario = in.nextInt();
        }
        for(int i = 0;i < 10;i++) {
            int escolha = r.nextInt(3);
            switch ((escolha) {
            case 0:
                System.out.println("Pedra");break;
            case 1:
                System.out.println("Papel");break;
            case 2:
                System.out.println("Tesoura");break;
            }
        }
    }
}