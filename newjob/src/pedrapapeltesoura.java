import java.util.Scanner;
import java.util.Random;

    public class pedrapapeltesoura {

        public static void main(String[] args) {
            int jogador,computador;
            Scanner in = new Scanner(System.in);
            System.out.println("BEM VINDO AO JOGO DE PEDRA, PAPEL E TESOURA DO EDER!!!");
            System.out.println(" ");
            System.out.println("Regras:");
            System.out.println("Jogador contra CPU. Letras não são válidas. Cada vitoria vale um ponto.");
            System.out.println("Empate não contabiliza ponto. Quem vencer 10 partidas primeiro sera o campeão!");
            System.out.println(" ");

            System.out.println("⭔ Pedra = 0");
            System.out.println("▭ Papel = 1");
            System.out.println("✂ Tesoura = 2");
            System.out.println(" ");

            System.out.println("QUE COMEÇEM OS JOGOS!!! hahahahaha");
            System.out.println(" ");

            int PontosComputador = 0;
            int PontosJogador = 0;


            while ( PontosComputador < 10 && PontosJogador < 10) {

                System.out.print("Jogador escolha uma opção: ");
                jogador = in.nextInt();

                switch (jogador) {
                    case 0:
                        System.out.println("Jogador escolheu Pedra ⭔ ");
                        break;
                    case 1:
                        System.out.println("Jogador escolheu Papel ▭");
                        break;
                    case 2:
                        System.out.println("Jogador escolheu Tesoura ✂");
                        break;
                    default:
                        System.out.println("Resposta inválida");
                        break;
                }


                computador = (int) (Math.random()* 3);

                switch (computador) {
                    case 0:
                        System.out.println("Computador escolheu Pedra ⭔ ");
                        break;
                    case 1:
                        System.out.println("Computador escolheu Papel ▭");
                        break;
                    case 2:
                        System.out.println("Computador escolheu Tesoura ✂");
                        break;
                }


                switch (jogador){
                    case 0:
                        switch (computador) {
                            case 0:
                                System.out.println("Empate!!!");
                                System.out.println(" ");
                                break;
                            case 1:
                                System.out.println("Computador venceu!!!");
                                PontosComputador ++;
                                System.out.println(" ");
                                break;
                            case 2:
                                System.out.println("Jogador venceu!!!");
                                PontosJogador++;
                                System.out.println(" ");
                                break;
                        } break;


                    case 1:
                        switch (computador) {
                            case 0:
                                System.out.println("Jogador venceu!!!");
                                PontosJogador++;
                                System.out.println(" ");
                                break;
                            case 1:
                                System.out.println("Empate!!!");
                                System.out.println(" ");

                                break;
                            case 2:
                                System.out.println("Computador venceu!!!");
                                PontosComputador++;
                                System.out.println(" ");
                                break;
                        } break;
                    case 2:
                        switch (computador) {
                            case 0:
                                System.out.println("Computador venceu!!!");
                                PontosComputador++;
                                System.out.println(" ");
                                break;
                            case 1:
                                System.out.println("Jogador venceu!!!");
                                PontosJogador++;
                                System.out.println(" ");
                                break;
                            case 2:
                                System.out.println("Empate!!!");
                                System.out.println(" ");
                                break;



                        } break;

                    default:
                        System.err.println("Resposta inválida");
                }

            }
            if(PontosComputador == 10) {
                System.out.println("Vencedor final é o Computador!!!");

            } else if (PontosJogador == 10) {
                System.out.println("Vencedor final é o Jogador!!!");

            }
            System.out.println(" ");
            System.out.println("Total de pontos Computador: " +PontosComputador);
            System.out.println("Total de pontos Jogador: " +PontosJogador);

        }
    }

