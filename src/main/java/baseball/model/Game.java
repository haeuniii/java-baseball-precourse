package baseball.model;

import baseball.utils.StartCode;

public class Game {
    private int source;
    private int target;
    private int strike;
    private int ball;

    public Game(String _source, int _target) {
        this.source = Integer.valueOf(_source);
        this.target = _target;

        setStrike();
        setBall();
    }

    public void setStrike() {
        int count = 0;
        int target = this.target;
        int source = this.source;

        while (target > 0) {
            if (target % 10 == source % 10) count++;
            target = target / 10;
            source = source / 10;
        }

        this.strike = count;
    }

    public int getStrikeCount() {
        return strike;
    }

    public int getBallCount() {
        return ball;
    }

    public void setBall() {
        String _source = String.valueOf(this.source);
        int digit = _source.length();

        for (String s : String.valueOf(this.target).split("")) {
            if (_source.contains(s)) {
                _source = _source.replaceFirst(s, "");
            }
        }

        this.ball = digit - _source.length() - this.strike;
    }

    public boolean isNothing() {
        if (isRight())  return false;
        return strike == 0 && ball == 0;
    }

    public boolean isRight() {
        return this.strike == 3;
    }

    public static boolean isGameContinue(String res) {
        return StartCode.getCode(res) == StartCode.YES;
    }
}
