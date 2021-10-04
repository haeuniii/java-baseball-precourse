package baseball.view;

import baseball.utils.Message;

public class GameView {
    public static void printGameStart() {
        System.out.print(Message.START.getMessage());
    }

    public static void printGameRestart() {
        System.out.print(Message.RESTART.getMessage());
    }

    public static void printStrike(int strikeCount) {
        if (strikeCount > 0)    System.out.println(strikeCount + Message.STRIKE.getMessage());
    }

    public static void printBall(int ballCount) {
        if (ballCount > 0)      System.out.println(ballCount + Message.BALL.getMessage());
    }

    public static void printNothing(boolean isNothing) {
        if (isNothing)  System.out.println(Message.NOTHING.getMessage());
    }
}
