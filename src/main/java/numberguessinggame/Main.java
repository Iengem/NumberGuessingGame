package numberguessinggame;

import numberguessinggame.game.GuessingGame;
import numberguessinggame.utils.CountdownTimer;
import numberguessinggame.utils.Timer;

public class Main {
    public static void main(String[] args) {
        Timer timer = new CountdownTimer(30000); // 30 seconds timer
        GuessingGame game = new GuessingGame(3, timer);
        game.start();
    }
}
