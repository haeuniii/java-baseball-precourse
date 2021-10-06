package baseball.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class GameTest {
    private static Game game;

    @BeforeAll
    static void initAll() {
        game = new Game("226", 123);
    }

    @Test
    void getStrikeCount() {
        Assertions.assertEquals(1, game.getStrikeCount());
    }

    @Test
    void getBallCount() {
        Assertions.assertEquals(0, game.getBallCount());
    }

    @Test
    void isNothing() {
        Assertions.assertFalse(game.isNothing());
    }

    @Test
    void isRight() {
        Assertions.assertFalse(game.isRight());
    }

    @Test
    void isGameContinue() {
        Assertions.assertTrue(game.isGameContinue("1"));
        Assertions.assertFalse(game.isGameContinue("2"));
    }
}