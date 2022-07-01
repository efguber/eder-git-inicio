package cartas;

import java.util.ArrayList;

public class Jogo {
    private ArrayList<Carta> handPlayer = new ArrayList<>();
    private ArrayList<Carta> handCPU = new ArrayList<>();

    private Baralho deck() {
        //TODO
        return null;
    }
    private int playerWins;

    public void fisrtRound(){
        //TODO
    }

   public void handlePlayerOption(PlayerOption option) {
       //TODO
   }

    public void playerWin(){
        //TODO
    }
    private void oneMOre(){
        //TODO
    }
    private void stop(){
        //TODO
    }
    private void doubleCard(){
        //TODO
    }



//GETTER E SETTER ABAIXO

    public ArrayList<Carta> getHandPlayer() {
        return handPlayer;
    }

    public void setHandPlayer(ArrayList<Carta> handPlayer) {
        this.handPlayer = handPlayer;
    }

    public ArrayList<Carta> getHandCPU() {
        return handCPU;
    }

    public void setHandCPU(ArrayList<Carta> handCPU) {
        this.handCPU = handCPU;
    }

    public int getPlayerWins() {
        return playerWins;
    }

    public void setPlayerWins(int playerWins) {
        this.playerWins = playerWins;
    }


}
