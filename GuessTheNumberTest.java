import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuessTheNumberTest {
    @Test
    void newGameRequestedTest1() {
        var s = new GuessTheNumber();
        assertTrue(s.newGameRequested("y"));
        assertTrue(s.newGameRequested("Y"));
    }
    @Test
    void newGameRequestedTest2(){
        var s = new GuessTheNumber();
        assertFalse(s.newGameRequested("n"));
        assertFalse(s.newGameRequested("N"));
    }

}