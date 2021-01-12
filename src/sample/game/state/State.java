package sample.game.state;

import sample.controller.PlayerController;
import sample.core.Size;
import sample.entity.GameObject;
import sample.entity.Player;
import sample.game.Game;
import sample.gfx.SpriteLibrary;
import sample.input.Input;
import sample.map.GameMap;

import java.util.ArrayList;
import java.util.List;

public abstract class State {

    protected GameMap gameMap;
    protected List<GameObject> gameObjects;
    protected SpriteLibrary spriteLibrary;
    protected Input input;

    public State(Input input) {
        this.input = input;
        gameObjects = new ArrayList<>();
        spriteLibrary = new SpriteLibrary();

    }

    public void update(){
        gameObjects.forEach(gameObject -> gameObject.update());
    }

    public List<GameObject> getGameObjects() {
        return gameObjects;
    }

    public GameMap getGameMap() {
        return gameMap;
    }
}
