package baseball;

import baseball.controller.GameProcessor;

public class Application {
    public static void main(String[] args) {
        new GameProcessor().gameStart();
    }
}
