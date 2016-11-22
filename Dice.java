/**
 * Created by Culebra on 11/21/2016.
 */
/* Things needed for code
     Extend the Dice class
     - Keep track number of throws (Check)
     - Keep track of history (what history?)
     - Provide appropriate methods (Did I provide the correct ones?)
     - Rewrite Dice game to keep track of history in object (History in object?)
 */

import java.util.Random;
import java.util.Scanner;

public class Dice {

    // ==================== MAIN PROGRAM =========================
    // Member variables are still needed?

    public static void main (String[] args)
    {
        // variables
        int numOfRolls = 0;
        int userGuess = 0;

        Dice access = new Dice();

        // To scan user input
        Scanner in = new Scanner(System.in);

        // Game Description
        System.out.println("You decide how many dices to roll \n");
        System.out.println("You get points depending on your roll!");
        System.out.println("One dice: 1-6");
        System.out.println("Two dices: 2-12");
        System.out.println("Three dices 3-18");
        System.out.println("and so on . . . \n");

        // User Decides number of dices to roll
        System.out.println("How many dices would you like to roll?");
        numOfRolls = in.nextInt();

        // User guesses points
        System.out.println("How many points would you like to guess?");
        System.out.println("Your guess should depend on the amount of dices rolled");
        userGuess = in.nextInt();

        System.out.println("Computer threw " + access.Throw(numOfRolls) + " points!");
        System.out.println("You guessed " + userGuess + " points!");

        if (userGuess == access.Throw(numOfRolls))
        {
            System.out.println("\nYou guessed right bro! Congratulations!! ");
        }
        else
            System.out.println("\nDamn dude, you lost.");

        // Keep track number of throws
        System.out.println("Number of throws is " + access.keepCountOfThrows(numOfRolls, numOfRolls)); // answer is 0
        // How do I make it return the number of throws?
    }

    // ============= METHODS =======================================
    // Constructor and Method needed
    // Need constructor ?


    public int Throw (int numOfRolls)
    {
        int sum = 0;
        Random random = new Random();
        int diceRolled = random.nextInt(6) + 1;

        for (int i = 0; i < numOfRolls; i++)
        {
            sum += diceRolled;
        }

        return sum;
    }

    // ===== METHOD USED TO KEEP HISTORY OF NUMBER OF THROWS =====

    public int keepCountOfThrows (int numOfRolls, int numOfThrows)
    {
        numOfThrows = 0;

        for (int i = 0; i < numOfRolls; i++)
        {
            numOfThrows++;
        }

        return numOfThrows;
    }

}
