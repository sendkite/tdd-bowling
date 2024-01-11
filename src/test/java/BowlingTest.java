import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingTest {

    private Game game;

    @BeforeEach
    void setUp() {
        game = new Game();
    }

    private void rollMany(int n, int pins) {
        for (int i = 0; i < n; i++) {
            game.roll(pins);
        }
    }

    @Test
    void gutterGame() {
        rollMany(20, 0);
        assertEquals(0, game.score());
    }

    @Test
    void allOnes() {
        rollMany(20, 1);
        assertEquals(20, game.score());
    }
}
