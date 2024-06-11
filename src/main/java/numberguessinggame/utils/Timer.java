package numberguessinggame.utils;

// Timer interface to define the contract for timer implementations.
public interface Timer {
    // Starts the timer.
    void start();

    /**
     * Checks if the time is up.
     * @return true if the time is up, false otherwise.
     */
    boolean isTimeUp();
}
