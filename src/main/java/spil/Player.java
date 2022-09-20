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

    //This checks if the two dice are both six
    public boolean getIsTwoSix(){
        if(die1.getDie() == 6 && die2.getDie() == 6){
            return true;
        }else{
            return false;
        }
    }

    public void addPoints(int points){
        this.points += points;
    }
}
