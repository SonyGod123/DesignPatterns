package Wintergame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class OvalActor {
    private double x,y;
    private double speed;

    public OvalActor(double x, double y, double speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    public void update(GameContainer gc, int delta){
        this.x += delta/speed;
    }
    public void render(Graphics graphics) {
        graphics.drawOval((float)this.x, (float)this.y, 20, 30);

    }

}
