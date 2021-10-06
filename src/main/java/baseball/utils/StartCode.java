package baseball.utils;

import java.util.HashMap;
import java.util.Map;

public enum StartCode {
    YES("1"),
    NO("2");

    private final String code;

    StartCode(String _code) {
        this.code = _code;
    }

    public String getCode() {
        return code;
    }

    private static Map<String, StartCode> codeMap = null;

    public static StartCode getCode(String _tag) {
        if (codeMap == null) {
            codeMap = new HashMap<>();

            for (StartCode code : values()) {
                codeMap.put(code.code, code);
            }
        }

        return codeMap.get(_tag);
    }
}
