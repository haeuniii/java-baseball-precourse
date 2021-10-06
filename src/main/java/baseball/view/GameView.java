package baseball.view;

import baseball.model.Game;
import baseball.utils.Message;
import baseball.utils.NumberRange;
import baseball.utils.StartCode;
import nextstep.utils.Console;

public class GameView {
    public static void printGameStart() {
        System.out.print(Message.START.getMessage());
    }

    public static void printGameRestart() {
        System.out.print(Message.RESTART.getMessage());
    }

    public static void printResult(Game game) {
        printStrike(game.getStrikeCount(), game.getBallCount());
        printBall(game.getStrikeCount(), game.getBallCount());
        printNothing(game.isNothing());
        printSuccess(game.isRight());
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

    private static void printError(boolean isError) {
        if (isError)  System.out.println(Message.ERROR.getMessage());
    }

    public static String readLine() {
        return Console.readLine();
    }

    public static boolean isValidNumber(String input) {
        if (Integer.valueOf(input) >= NumberRange.START.getRange()
                && Integer.valueOf(input) <= NumberRange.END.getRange())     return true;

        printError(true);
        return false;
    }

    public static boolean isValidContinueNumber(String input) {
        if (StartCode.YES.getCode().equals(input) || StartCode.NO.getCode().equals(input)) return true;

        printError(true);
        return false;
    }
}
