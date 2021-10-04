package baseball.model;

public class Game {
    private int source;
    private int target;
    private int strike;

    public Game(String _source, int _target) {
        this.source = Integer.valueOf(_source);
        this.target = _target;

        setStrike();
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
}
