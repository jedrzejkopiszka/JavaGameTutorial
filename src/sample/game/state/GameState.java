package sample.game.state;

import sample.controller.PlayerController;
import sample.core.Size;
import sample.entity.Player;
import sample.input.Input;
import sample.map.GameMap;

public class GameState extends State{

    public GameState(Input input) {
        super(input);
        gameObjects.add(new Player(new PlayerController(input), spriteLibrary));
        gameMap = new GameMap(new Size(20,20), spriteLibrary);
    }
}
