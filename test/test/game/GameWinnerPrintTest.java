package test.game;

import static org.junit.jupiter.api.Assertions.*;

public class GameWinnerPrintTest implements GameWinnerPrinter {
    
    public Player trueWinner;
    
    public GameWinnerPrintTest(Player trueWinner){
        this.trueWinner = trueWinner;
    }

    @Override
    public void printWinner(Player winner) {
        assertTrue(winner == this.trueWinner);
    }


    
}
