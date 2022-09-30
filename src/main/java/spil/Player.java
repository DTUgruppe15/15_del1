package spil;

public class Player {

    private int points;
    private boolean IsLastTwoSix;

    public boolean isLastTwoSix() {
        return IsLastTwoSix;
    }

    public void setLastTwoSix(boolean lastTwoSix) {
        IsLastTwoSix = lastTwoSix;
    }

    Die die1 = new Die();
    Die die2 = new Die();

    //Set function
    public void setPoints(int points) {
        this.points = points;
    }

    //Get function
    public int getPoints() {
        return points;
    }

    public void rollDice() {
        die1.rollDie();
        die2.rollDie();
    }

    public int getSum() {
        return die1.getDie() + die2.getDie();
    }

    //This checks if the two dice are the same face-value
    public boolean getIsSame() {
        return die1.getDie() == die2.getDie();
    }

    //This checks if the two dice are both ones
    public boolean getIsTwoOne() {
        return die1.getDie() == 1 && die2.getDie() == 1;
    }

    public boolean getIsTwoSix(){
        return die1.getDie() == 6 && die2.getDie() == 6;
    }

    public void addPoints(int points){
        this.points += points;
    }
}
