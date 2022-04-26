package test.game;

import org.junit.jupiter.api.Test;


public class GameTest {
    
    private final Dice dice;
    private final GameWinnerPrinter winnerPrinter;
    
    public GameTest(Dice dice, GameWinnerPrinter winnerPrinter) {
        this.dice = dice;
        this.winnerPrinter = winnerPrinter;
    }
    
    @Test
    public void testPlayGame(Player player1,Player player2) {
        Game game = new Game(dice,winnerPrinter);
        game.playGame(player1, player2);
    }
    
}
