package numberGuessingGame;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private final int targetNumber;
    private final int maxAttempts;
    private final long timeLimit;
    private int attemptsLeft;
    private long startTime;

    public Game() {
        this.targetNumber = new Random().nextInt(9999) + 1;
        this.maxAttempts = 3;
        this.timeLimit = 30000; // 30 seconds
        this.attemptsLeft = maxAttempts;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess the number between 1 and 9999. You have " + maxAttempts + " attempts and 30 seconds.");
        this.startTime = System.currentTimeMillis();

        while (attemptsLeft > 0) {
            long elapsedTime = System.currentTimeMillis() - startTime;
            if (elapsedTime > timeLimit) {
                System.out.println("Time's up! You lose a chance.");
                attemptsLeft--;
                startTime = System.currentTimeMillis(); // Reset the timer
                continue;
            }

            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();

            if (guess == targetNumber) {
                System.out.println("Congratulations! You've guessed the number.");
                break;
            } else if (guess > targetNumber) {
                System.out.println("Too High");
            } else {
                System.out.println("Too Low");
            }

            attemptsLeft--;

            if (attemptsLeft == 0) {
                System.out.println("No attempts left. You lose. The number was: " + targetNumber);
            } else {
                System.out.println("Attempts left: " + attemptsLeft);
            }
        }

        scanner.close();
    }
}
