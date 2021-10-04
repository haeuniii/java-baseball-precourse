package baseball.utils;

public enum Message {
    START("숫자를 입력하세요 : "),
    RESTART("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요 : "),
    BALL("볼"),
    STRIKE("스트라이크"),
    NOTHING("낫싱"),
    SUCCESS("3개의 숫자를 모두 맞히셨습니다! 게임 끝");

    private final String message;

    Message(String _message) {
        this.message = _message;
    }

    public String getMessage() {
        return message;
    }
}
