package baseball.controller;

import baseball.model.Game;
import baseball.utils.NumberRange;
import baseball.view.GameView;
import nextstep.utils.Console;
import nextstep.utils.Randoms;

public class GameProcessor {
    public void gameStart() {
        boolean isContinue = true;
        int targetNumber = getRandomNumber();

        while (isContinue) {
            GameView.printGameStart();
            Game game = new Game(Console.readLine(), targetNumber);

            GameView.printStrike(game.getStrikeCount());
            GameView.printBall(game.getBallCount());
            GameView.printNothing(!game.isRight() && game.isNothing());
            GameView.printSuccess(game.isRight());

            isContinue = game.isRight() ? game.isGameContinue(Console.readLine()) : true;
            targetNumber = isContinue == true && game.isRight() ? getRandomNumber() : targetNumber;
        }
    }

    private int getRandomNumber() {
        return Randoms.pickNumberInRange(NumberRange.START.getRange(), NumberRange.END.getRange());
    }
}
