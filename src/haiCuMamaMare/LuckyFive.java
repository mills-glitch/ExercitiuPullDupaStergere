package haiCuMamaMare;
import java.util.Random;
public class LuckyFive {
    // Importing the Random library




        public static void main(String[] args) {

            // Creating a random number generator
            Random randomGenerator = new Random();

            // Generate a number between 1 and 6
            int dieRoll = randomGenerator.nextInt(6) + 1;

            // Repeat while roll isn't 5
            while (dieRoll >1 && dieRoll < 6){
                    dieRoll = 4;
                System.out.println(dieRoll);
            }

        }


}
