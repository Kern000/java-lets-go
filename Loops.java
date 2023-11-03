import java.util.Random;

public class Loops {

    public static void main(String[] args) {

        Random randomGenerator = new Random();

        int dieRoll = randomGenerator.nextInt(6) + 1;
        // so is between 1 and 6;

        while (dieRoll != 5) {
            dieRoll = randomGenerator.nextInt(6) + 1;
            System.out.println("dieroll instance here: " + dieRoll);
        }

        int wishes = 0;
        while (wishes < 5) {
            System.out.println("Have a wish on me, genie");
            wishes++;
        }
    }
}