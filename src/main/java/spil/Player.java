package spil;

public class Player {

    private int points;

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

    public void addPoints(int points){
        this.points += points;
    }
}
