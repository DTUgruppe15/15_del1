package spil;

import gui_main.GUI;

public class Spil {
    public static void main(String[] args) {

        GUI gui = new GUI();

        Player player1 = new Player();
        Player player2 = new Player();

        player1.rollDice();
        System.out.println(player1.die1.getDie());
        System.out.println(player1.die2.getDie());
        System.out.println(player1.getSum());
        System.out.println(player1.getIsSame());
        int playerTurn = 1;
        boolean previousRound6 = false; //This stores a boolean about if the previous round was two sixes

        while (true) {
            boolean clickRoll = gui.getUserLeftButtonPressed("Click for roll player: " + playerTurn, "Yes", "No");
            if (playerTurn == 1) {
                player1.rollDice();
                gui.setDice(player1.die1.getDie(), player1.die2.getDie());
                playerTurn = 2;
                player1.addPoints(player1.getSum());
                if (player1.getIsTwoSix() && previousRound6) { //This checks if player 2 wins by rolling two sixes
                    System.out.println("Player 1 wins by 6 rule");
                    break;
                } else if (player1.getIsTwoSix()) {
                    previousRound6 = true;
                } else {
                    previousRound6 = false;
                }
            } else {
                player2.rollDice();
                gui.setDice(player2.die1.getDie(), player2.die2.getDie());
                playerTurn = 1;
                player2.addPoints(player2.getSum());
                if (player2.getIsTwoSix() && previousRound6) { //This checks if player 2 wins by rolling two sixes
                    System.out.println("Player 2 wins by six rule");
                    break;
                } else if (player2.getIsTwoSix()) {
                    previousRound6 = true;
                } else {
                    previousRound6 = false;
                }
            }
            if (player1.getPoints() >= 40) {
                System.out.println("Player 1 wins");
                break;
            } else if (player2.getPoints() >= 40) {
                System.out.println("Player 2 wins");
                break;
            }

            System.out.println("player 1: " + player1.getPoints());
            System.out.println("player 2: " + player2.getPoints());
        }
    }
}