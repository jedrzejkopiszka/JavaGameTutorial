package sample.game;
import sample.game.state.GameState;
import sample.game.state.State;
import sample.input.Input;
import sample.display.Display;
import java.awt.*;


public class Game {

    public static int SPRITE_SIZE = 64;

    private Display display;
    private Input input;
    private State state;


    public Game(int width, int height) {
        input = new Input();
        display = new Display(width, height, input);
        state = new GameState(input);
    }

    public void update(){
        state.update();
        //rectangle.setLocation((int) rectangle.getX() +1 , (int) rectangle.getY());
    }

    public void render(){
        display.render(state);
    }
}
