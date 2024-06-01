package numberGuessingGame;

public class Timer {
    private long startTime;
    private final long duration;

    public Timer(long duration) {
        this.duration = duration;
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public boolean isTimeUp() {
        return (System.currentTimeMillis() - startTime) > duration;
    }
}
