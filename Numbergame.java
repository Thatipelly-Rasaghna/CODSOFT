import java.util.*;
public class Numbergame {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        Random r = new Random();
        int minRange = 1;
        int maxRange = 100;
        int attemptsLimit = 8;
        int score = 0;
        boolean playAgain = true;

        System.out.println("Welcome to the Number Game of Guessing!");

        while (playAgain) {
            int generatedNumber = r.nextInt(maxRange - minRange + 1) + minRange;
            int attempts = 0;
            boolean guessedCorrectly = false;

            System.out.println("I have generated a number between " + minRange + " and " + maxRange + ".");
            System.out.println("You have " + attemptsLimit + " attempts to guess the number.");

            while (attempts < attemptsLimit && !guessedCorrectly) {
                System.out.print("Enter your guess: ");
                int userGuess = m.nextInt();
                attempts++;

                if (userGuess == generatedNumber) {
                    System.out.println("Congratulations! Your guess is correct.");
                    guessedCorrectly = true;
                    score++;
                } else if (userGuess < generatedNumber) {
                    System.out.println("Too low!  Try once more.");
                } else {
                    System.out.println("Too high! Try once more.");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Sorry, you ran out of attempts. The number was: " + generatedNumber);
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainResponse = m.next();

            if (!playAgainResponse.equalsIgnoreCase("yes")) {
                playAgain = false;
            }

            System.out.println();
        }

        System.out.println("Game over! Your final score is: " + score);
        m.close();
    }
}
