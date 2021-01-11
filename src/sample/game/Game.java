package sample.game;

import sample.gfx.SpriteLibrary;
import sample.input.Input;
import sample.controller.PlayerController;
import sample.display.Display;
import sample.entity.GameObject;
import sample.entity.Player;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Game {


    public static int SPRITE_SIZE = 64;
    private Display display;
    // private Rectangle rectangle;
    private List<GameObject> gameObjects;
    private Input input;
    private SpriteLibrary spriteLibrary;

    public Game(int width, int height) {
        input = new Input();
        display = new Display(width, height, input);
        //rectangle = new Rectangle(0,0, 50, 50);

        gameObjects = new ArrayList<>();
        gameObjects.add(new Player(new PlayerController(input), spriteLibrary));
        spriteLibrary = new SpriteLibrary();
    }

    public void update(){
        gameObjects.forEach(gameObject -> gameObject.update());

        //rectangle.setLocation((int) rectangle.getX() +1 , (int) rectangle.getY());
    }

    public void render(){
        display.render(this);
    }

    public Rectangle getRectangle() {
        return null; //return rectangle;
    }

    public List<GameObject> getGameObjects() {
        return gameObjects;
    }
}
