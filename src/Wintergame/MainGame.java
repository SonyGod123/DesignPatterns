package Wintergame;

import org.newdawn.slick.*;
import org.newdawn.slick.tests.AnimationTest;

import java.util.List;

public class MainGame extends BasicGame {
    private CircleActor ca1;
    private RectActor rect1;
    private OvalActor oval1;

    private List<Snowflakes> snowflakes;


    public MainGame(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gc) throws SlickException {
    // 1 mal aufgerufen
        this.ca1 = new CircleActor(100,100, 10);
        this.rect1 = new RectActor(50,50,50);
        this.oval1 = new OvalActor(20,20, 20);

    }

    @Override
    public void update(GameContainer gc, int delta) throws SlickException {
        System.out.println(delta);
    // delta = Zeit seit dem letzten Aufruf
        this.ca1.update(gc,delta);
        this.oval1.update(gc,delta);
        this.rect1.update(gc,delta);
    }

    @Override
    public void render(GameContainer gc, Graphics graphics) throws SlickException {
    // gezeichnet
        this.ca1.render(graphics);
        this.oval1.render(graphics);
        this.rect1.render(graphics);
    }
    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new MainGame("Wintergame"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }

}
