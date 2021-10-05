package baseball.view;

import baseball.utils.Message;

public class GameView {
    public static void printGameStart() {
        System.out.print(Message.START.getMessage());
    }

    public static void printGameRestart() {
        System.out.print(Message.RESTART.getMessage());
    }

    public static void printStrike(int strikeCount, int ballCount) {
        if (strikeCount > 0)    System.out.print(strikeCount + Message.STRIKE.getMessage());
        if (strikeCount > 0 && ballCount == 0)     System.out.println("");
    }

    public static void printBall(int strikeCount, int ballCount) {
        if (strikeCount > 0)    System.out.print(" ");
        if (ballCount > 0)      System.out.println(ballCount + Message.BALL.getMessage());
    }

    public static void printSuccess(boolean isRight) {
        if (isRight) {
            System.out.println(Message.SUCCESS.getMessage());
            printGameRestart();
        }
    }

    public static void printNothing(boolean isNothing) {
        if (isNothing)  System.out.println(Message.NOTHING.getMessage());
    }
}
