package baseball.view;

import baseball.utils.Message;

public class GameView {
    public static void printGameStart() {
        System.out.print(Message.START.getMessage());
    }

    public static void printGameReStart() {
        System.out.print(Message.RESTART.getMessage());
    }
}
