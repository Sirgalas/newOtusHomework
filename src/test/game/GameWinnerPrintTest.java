package test.game;

public class GameWinnerPrintTest implements GameWinnerPrinter {
    
    public Player trueWinner;
    
    public GameWinnerPrintTest(Player trueWinner){
        this.trueWinner = trueWinner;
    }

    @Override
    public void printWinner(Player winner) {
        
        if(winner != this.trueWinner){
            throw new RuntimeException("победитель не соответствует");
        }
    }
}
