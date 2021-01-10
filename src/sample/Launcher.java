package sample;

import sample.game.Game;
import sample.game.GameLoop;

public class Launcher {
    public static void main(String[] args){
        //Display display = new Display(800, 600);
        new Thread(new GameLoop(new Game(800 ,600))).start();
    }
}
