package spil;

import java.util.Random;

public class Die {
    private int die;

    public void setDie(int die) {
        this.die = die;
    }

    public int getDie() {
        return die;
    }

    public void rollDie(){
        Random rand = new Random();
        this.die = rand.nextInt(6)+1;
    }

}
