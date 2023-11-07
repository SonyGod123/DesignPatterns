package Wintergame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class RectActor {
    private double x,y;
    private double speed;

    public RectActor(double x, double y, double speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    public void update(GameContainer gc, int delta){
        this.x += delta/this.speed;
    }
    public void render(Graphics graphics) {
        graphics.drawRect((float)this.x,(float)this.y,10,10 );
    }

}
