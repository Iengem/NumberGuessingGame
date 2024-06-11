package numberguessinggame.utils;

// Implementation of the Timer interface using a countdown mechanism.

public class CountdownTimer implements Timer {
    private long startTime; // Start time of the countdown
    private final long duration; // Duration of the countdown in milliseconds

    /**
     * Constructor to initialize the countdown timer with a specified duration.
     * @param duration Duration of the countdown in milliseconds.
     */
    public CountdownTimer(long duration) {
        this.duration = duration;
    }

    /**
     * Starts the countdown timer by recording the current system time.
     */
    @Override
    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    /**
     * Checks if the countdown timer has reached the specified duration.
     * @return true if the time is up, false otherwise.
     */
    @Override
    public boolean isTimeUp() {
        // Calculate the elapsed time and compare it with the duration
        return (System.currentTimeMillis() - startTime) > duration;
    }
}
