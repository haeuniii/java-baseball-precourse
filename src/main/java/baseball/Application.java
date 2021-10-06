package baseball;

import baseball.controller.GameProcessor;

public class Application {
    public static void main(String[] args) {
        GameProcessor processor = new GameProcessor();

        boolean isContinue = true;
        int targetNumber = processor.getRandomNumber();

         while (isContinue) {
            isContinue = processor.gameStart(targetNumber);
            targetNumber = isContinue == true ? processor.getRandomNumber() : targetNumber;
        }
    }
}
