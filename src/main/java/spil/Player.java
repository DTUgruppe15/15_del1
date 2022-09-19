package spil;

public class Player {

    private int points;

    Die die1 = new Die();
    Die die2 = new Die();

    public void setPoints(int points) {
        this.points = points;
    }

    public int getPoints() {
        return points;
    }

    public void rollDice(){
        die1.rollDie();
        die2.rollDie();
    }

    public int getSum(){
        return die1.getDie() + die2.getDie();
    }

    public boolean getIsSame(){
        if(die1.getDie() == die2.getDie()){
            return true;
        }else{
            return false;
        }
    }

    public void addPoints(int points){
        this.points += points;
    }
}
