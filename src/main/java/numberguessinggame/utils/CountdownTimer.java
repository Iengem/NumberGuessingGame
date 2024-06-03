package numberguessinggame.utils;

public class CountdownTimer implements Timer {
    private long startTime;
    private final long duration;

    public CountdownTimer(long duration) {
        this.duration = duration;
    }

    @Override
    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    @Override
    public boolean isTimeUp() {
        return (System.currentTimeMillis() - startTime) > duration;
    }
}
