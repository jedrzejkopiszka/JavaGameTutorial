package sample.core;

import sample.controller.Controller;

public class Motion {
    private Vector2D vector;
    private double speed;

    public Motion(double speed) {
        this.speed = speed;
        this.vector = new Vector2D(0,0);
    }

    public void update(Controller controller){
        int deltaX = 0;
        int deltaY = 0;

        if (controller.isRequestingUp()){
            deltaY--;
        }
        if (controller.isRequestingDown()){
            deltaY++;
        }
        if (controller.isRequestingRight()){
            deltaX++;
        }
        if (controller.isRequestingLeft()){
            deltaX--;
        }

        vector = new Vector2D(deltaX, deltaY);
        vector.normalize();
        vector.multiply(speed);
        System.out.println(vector.length());
    }

    public Vector2D getVector() {
        return vector;
    }
}