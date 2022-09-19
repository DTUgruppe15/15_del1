package spil;

import gui_main.GUI;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        GUI gui = new GUI();

        Spil spil = new Spil();

        spil.rollDice();
        System.out.println(spil.getDie1());
        System.out.println(spil.getDie2());
        System.out.println(spil.getSum());
        System.out.println(spil.getIsSame());

        gui.setDice(spil.getDie1(), spil.getDie2());


    }




}
