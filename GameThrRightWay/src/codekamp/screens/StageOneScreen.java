package codekamp.screens;

import codekamp.Game;
import codekamp.Resources;
import codekamp.elements.Block;
import codekamp.elements.Element;

import java.awt.*;

public class StageOneScreen extends Screen {

    public StageOneScreen() {
        this.elements.add(new Block(900, 355, -5));
        this.elements.add(new Block(1100, 355, -5));
        this.elements.add(new Block(1300, 355, -5));
        this.elements.add(new Block(1500, 355, -5));
        this.elements.add(new Block(1700, 355, -5));
    }

    @Override
    public void update() {
        super.update();

        for (Element e: this.elements) {
            if(e.x < -20) {
                e.x = 980;
            }
        }
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.cyan);
        g.fillRect(0, 0, Game.WIDTH, Game.HEIGHT);
        g.drawImage(Resources.getGrassImage(), 0, 405, null);

        super.draw(g);
    }
}
