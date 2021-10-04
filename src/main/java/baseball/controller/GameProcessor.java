package baseball.controller;

import baseball.utils.NumberRange;
import nextstep.utils.Randoms;

public class GameProcessor {
    public void gameStart() {
        boolean isContinue = true;
        int targetNumber = Randoms.pickNumberInRange(NumberRange.START.getRange(), NumberRange.END.getRange());

    }
}
