package sample.entity;

import sample.controller.Controller;
import sample.gfx.SpriteLibrary;


public class Player extends MovingEntity{

    public Player(Controller controller, SpriteLibrary spriteLibrary){
        super(controller, spriteLibrary);
    }

    @Override
    public void update() {
        super.update();
    }


}
