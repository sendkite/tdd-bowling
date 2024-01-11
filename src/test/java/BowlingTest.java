import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingTest {

    private Game g;

    @BeforeEach
    void setUp() {
        g = new Game();
    }

    private void rollMany(int n, int pins) {
        for (int i = 0; i < n; i++) {
            g.roll(pins);
        }
    }

    @Test
    void gutterg() {
        rollMany(20, 0);
        assertEquals(0, g.score());
    }

    @Test
    void allOnes() {
        rollMany(20, 1);
        assertEquals(20, g.score());
    }

    @Disabled
    @Test
    void oneSpare() {
        g.roll(5);
        g.roll(5); // spare
        g.roll(3);
        rollMany(17, 0);
        assertEquals(16, g.score());
    }
}
