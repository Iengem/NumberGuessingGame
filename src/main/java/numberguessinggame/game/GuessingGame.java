package numberguessinggame.game;

import numberguessinggame.utils.Timer;
import java.util.Random;
import java.util.Scanner;

// Represents the Number Guessing Game

public class GuessingGame {
    private final int targetNumber; // The number to be guessed
    private final int maxAttempts; // Maximum number of attempts allowed
    private final Timer timer; // Timer to limit the guessing duration
    private int attemptsLeft; // Number of attempts left

    // Constructor to initialize the game with a specified number of attempts and a timer.
    public GuessingGame(int maxAttempts, Timer timer) {
        this.targetNumber = new Random().nextInt(9999) + 1; // Generate a random number between 1 and 9999
        this.maxAttempts = maxAttempts;
        this.timer = timer;
        this.attemptsLeft = maxAttempts;
    }

    /**
     * Starts the game.
     */
    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess the number between 1 and 9999. You have " + maxAttempts + " attempts and 30 seconds.");
        timer.start(); // Start the timer

        // Loop until the player runs out of attempts or guesses the correct number
        while (attemptsLeft > 0) {
            if (timer.isTimeUp()) { // Check if time is up
                System.out.println("Time's up! You lose a chance.");
                attemptsLeft--; // Decrement attempts left
                timer.start(); // Restart the timer for the next guess
                continue;
            }

            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();

            if (guess == targetNumber) { // Check if the guess is correct
                System.out.println("Congratulations! You've guessed the number.");
                break; // Exit the loop as the player has won
            } else if (guess > targetNumber) { // Provide feedback if the guess is too high
                System.out.println("Too High");
            } else { // Provide feedback if the guess is too low
                System.out.println("Too Low");
            }

            attemptsLeft--; // Decrement attempts left

            if (attemptsLeft == 0) { // Check if there are no attempts left
                System.out.println("No attempts left. You lose. The number was: " + targetNumber);
            } else {
                System.out.println("Attempts left: " + attemptsLeft); // Provide feedback on remaining attempts
            }
        }

        scanner.close(); // Close the scanner to avoid resource leaks
    }
}
