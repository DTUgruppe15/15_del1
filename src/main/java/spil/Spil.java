package spil;

import java.util.Random;

public class Spil {

    private int die1;
    private int die2;


    public void setDie1(int die1) {
        this.die1 = die1;
    }

    public int getDie1() {
        return die1;
    }

    public void setDie2(int die2) {
        this.die2 = die2;
    }

    public int getDie2() {
        return die2;
    }

    public int getSum(){
        return die1 + die2;
    }

    public boolean getIsSame(){
        if(die1 == die2){
            return true;
        }else{
            return false;
        }
    }

    public void rollDice(){
        Random random = new Random();

        this.die1 = random.nextInt(6)+1;
        this.die2 = random.nextInt(6)+1;
    }




}
