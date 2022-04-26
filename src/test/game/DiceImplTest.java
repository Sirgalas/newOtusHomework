package test.game;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class DiceImplTest {
    
    public DiceImplTest() {
    }
    
    @Test
   
    public void testRoll() {
        DiceImpl instance = new DiceImpl();
        int min = 1;
        int max = 6;
        int result = instance.roll();
        assertTrue(min < result);
        assertTrue(max > result);
    }
    
}
