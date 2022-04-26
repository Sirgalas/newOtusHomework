package test.game;

public class MainTest {
    
    public static Player player1 = new Player("player1");
    
    public static Player player2 = new Player("player2");
    
   
    
    public static void main(String[] args) {
      playerTrue();
       
    }
    
    public static void playerTrue(){
        GameTest game = new GameTest(new DiceOneTest(),new GameWinnerPrintTest(player2));
        game.testPlayGame(player1, player2);
    }
}
