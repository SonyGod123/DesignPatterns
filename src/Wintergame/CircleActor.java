package Wintergame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class CircleActor implements Actor{
    private double x,y;
    private double speed;

    public CircleActor(double x, double y, double speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    public void update(GameContainer gc, int delta){
        this.x += delta / this.speed;
        this.y += delta /( this.speed + 4);
    }
    public void render(Graphics graphics) {
        graphics.drawOval((float)this.x, (float)this.y, 20, 20);
    }

}
