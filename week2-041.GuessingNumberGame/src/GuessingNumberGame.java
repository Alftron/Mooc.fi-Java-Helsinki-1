
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int numberGuessed = 0;
        int numGuesses = 0;
        while (numberGuessed != numberDrawn)
        {
            System.out.print("Guess a number: ");
            numberGuessed = Integer.parseInt(reader.nextLine());
            numGuesses++;
            if (numberGuessed < numberDrawn)
            {
                // Less than
                System.out.println("The number is greater, guesses made: " + numGuesses);
            }
            else if (numberGuessed == numberDrawn)
            {
                // Equals
                System.out.println("Congratulations, your guess is correct!");
            }
            else
            {
                // Must be higher
                System.out.println("The number is lesser, guesses made: " + numGuesses);
            }
        }        
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber()
    {
        return new Random().nextInt(101);
    }
}
