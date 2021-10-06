package baseball.controller;

import baseball.model.Game;
import baseball.utils.NumberRange;
import baseball.view.GameView;
import nextstep.utils.Randoms;

public class GameProcessor {
    public boolean gameStart(int targetNumber) {
        GameView.printGameStart();

        String input = GameView.readLine();
        if (!GameView.isValidNumber(input))    return false;

        Game game = new Game(input, targetNumber);
        GameView.printResult(game);

        input = GameView.readLine();
        if (!GameView.isValidContinueNumber(input))    return false;

        return game.isRight() ? game.isGameContinue(input) : true;
    }

    public int getRandomNumber() {
        return Randoms.pickNumberInRange(NumberRange.START.getRange(), NumberRange.END.getRange());
    }
}
