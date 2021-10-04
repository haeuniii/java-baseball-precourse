package baseball.utils;

import java.util.HashMap;
import java.util.Map;

public enum StartCode {
    YES("1"),
    NO("2");

    private final String message;

    StartCode(String _message) {
        this.message = _message;
    }

    private static Map<String, StartCode> codeMap = null;

    public static StartCode getCode(String _tag) {
        if (codeMap == null) {
            codeMap = new HashMap<>();

            for (StartCode code : values()) {
                codeMap.put(code.message, code);
            }
        }

        return codeMap.get(_tag);
    }
}
