package baseball.utils;

import java.util.HashMap;
import java.util.Map;

public enum NumberRange {
    START(111),
    END(999);

    private final int range;

    NumberRange(int _range) {
        this.range = _range;
    }

    public int getRange() {
        return range;
    }
}
