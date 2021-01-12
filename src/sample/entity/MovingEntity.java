package sample.entity;

import sample.controller.Controller;
import sample.core.Direction;
import sample.core.Motion;
import sample.gfx.AnimationManager;
import sample.gfx.SpriteLibrary;

import java.awt.*;

public abstract class MovingEntity extends GameObject{
    private Controller controller;
    private Motion motion;
    private AnimationManager animationManager;
    private Direction direction;

    public MovingEntity(Controller controller, SpriteLibrary spriteLibrary) {
        super();
        this.controller = controller;
        this.motion = new Motion(2);
        this.direction = Direction.S;
        animationManager = new AnimationManager(spriteLibrary.getUnit("matt"));
    }

    @Override
    public void update(){
        motion.update(controller);
        position.apply(motion);
        manageDirection();
        decideAnimation();
        animationManager.update(direction);
    }

    private void decideAnimation() {
        if (motion.isMoving()){
            animationManager.playAnimation("walk");
        }else{
            animationManager.playAnimation("stand");
        }
    }

    private void manageDirection() {
        if (motion.isMoving()){
            this.direction = Direction.fromMotion(motion);
        }
    }

    @Override
    public Image getSprite() {
        return animationManager.getSprite();
    }
}
