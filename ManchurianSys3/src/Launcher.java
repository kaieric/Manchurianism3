import game.Game;
import game.GameLoop;

public class Launcher {
    public static void main (String[] args) {
        //Display display = new Display(1000, 1000);   
        new Thread(new GameLoop(new Game(1000, 1000))).start();
    }
}
