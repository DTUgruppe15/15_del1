package spil;

import gui_main.GUI;

public class Spil {
    public static void main(String[] args) {

        GUI gui = new GUI();

        Player player1 = new Player();
        Player player2 = new Player();

        int playerTurn = 1;

        while (true) {
            boolean clickRoll = gui.getUserLeftButtonPressed("Click for roll player: " + playerTurn, "Yes", "Yes");
            if (playerTurn == 1) {
                player1.rollDice();
                gui.setDice(player1.die1.getDie(), player1.die2.getDie());
                player1.addPoints(player1.getSum());
                if (player1.getIsTwoOne()) { //This checks if player 1 rolled two ones, and then resets player 1's points to 0, if player 1 did
                    player1.setPoints(0);
                    System.out.println("Player 1's points get reset to 0!");
                }
                playerTurn = 2;
            } else {
                player2.rollDice();
                gui.setDice(player2.die1.getDie(), player2.die2.getDie());
                player2.addPoints(player2.getSum());
                if (player2.getIsTwoOne()) { //This checks if player 2 rolled two ones, and then resets player 2's points to 0, if player 1 did
                    player2.setPoints(0);
                    System.out.println("Player 2's points get reset to 0!");
                }
                playerTurn = 1;
            }
            if (player1.getPoints() >= 40) {
                System.out.println("Player 1 wins");
                gui.showMessage("Player 1 wins");
                break;
            } else if (player2.getPoints() >= 40) {
                System.out.println("Player 2 wins");
                gui.showMessage("Player 2 wins");
                break;
            }

            System.out.println("player 1: " + player1.getPoints());
            System.out.println("player 2: " + player2.getPoints());
        }
    }
}