package Wintergame;

import org.newdawn.slick.Graphics;

public class Homer implements Actor{
    @Override
    public void update(int delta) {

    }

    @Override
    public void render(Graphics graphics) {
        graphics.drawString("I am Homer", 50, 50);
    }
}
