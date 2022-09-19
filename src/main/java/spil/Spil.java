package spil;

import gui_main.GUI;

public class Spil {
    public static void main(String[] args) {

        //GUI gui = new GUI();

        Player player1 = new Player();
        Player player2 = new Player();

        player1.rollDice();
        System.out.println(player1.die1.getDie());
        System.out.println(player1.die2.getDie());
        System.out.println(player1.getSum());
        System.out.println(player1.getIsSame());

    }
}
