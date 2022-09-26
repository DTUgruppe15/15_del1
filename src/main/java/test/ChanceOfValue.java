package test;
import spil.*;

public class ChanceOfValue {
    public static void main(String[] args) {
        Player player = new Player();

        int[] valueNumber = new int[11];
        double[] theoreticalProb = {2.78, 5.56, 8.33, 11.11, 13.89, 16.67, 13.89, 11.11, 8.33, 5.56, 2.78};
        int numOfRolls = 0;
        int numOfDouble = 0;
        double theoryDouble = 17;

        for (int i = 0; i < 1000; i++) {
            player.rollDice();
            numOfRolls++;
            if(player.getIsSame()){
                numOfDouble++;
            }
            switch (player.getSum()){
                case 2:
                    valueNumber[0]++;
                    break;
                case 3:
                    valueNumber[1]++;
                    break;
                case 4:
                    valueNumber[2]++;
                    break;
                case 5:
                    valueNumber[3]++;
                    break;
                case 6:
                    valueNumber[4]++;
                    break;
                case 7:
                    valueNumber[5]++;
                    break;
                case 8:
                    valueNumber[6]++;
                    break;
                case 9:
                    valueNumber[7]++;
                    break;
                case 10:
                    valueNumber[8]++;
                    break;
                case 11:
                    valueNumber[9]++;
                    break;
                case 12:
                    valueNumber[10]++;
                    break;
                default:
                    System.out.println("Error sum wrong");
                    break;
            }

        }
        for (int i = 0; i < valueNumber.length; i++) {
            System.out.printf("Chance for %d: %.2f theoretical chance: %.2f\n", i+2, ((double) valueNumber[i]/numOfRolls*100), theoreticalProb[i]);
        }

        System.out.printf("Chance for double: %.2f theory: %.2f", ((double) numOfDouble/numOfRolls*100), theoryDouble);


    }
}
