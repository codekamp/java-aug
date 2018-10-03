package codekamp.screens;

import codekamp.Game;
import codekamp.GamePanel;
import codekamp.RandomGenerator;
import codekamp.Resources;
import codekamp.elements.Block;
import codekamp.elements.Element;
import codekamp.elements.Player;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class StageOneScreen extends Screen {

    private static final int GRASS_HEIGHT = 45;
    private static final int GRASS_Y = Game.HEIGHT - GRASS_HEIGHT;
    private static final int PLAYER_GROUND_Y = GRASS_Y - Player.HEIGHT;
    private static final int BLOCK_START = 900;
    private static final int BLOCK_GAP = 200;

    private ArrayList<Block> blocks = new ArrayList<>();
    private Player player;

    public StageOneScreen() {
        blocks.add(new Block(BLOCK_START, getRandomBlockY(), -5));
        blocks.add(new Block(BLOCK_START + BLOCK_GAP, getRandomBlockY(), -5));
        blocks.add(new Block(BLOCK_START + 2 * BLOCK_GAP, getRandomBlockY(), -5));
        blocks.add(new Block(BLOCK_START + 3 * BLOCK_GAP, getRandomBlockY(), -5));
        blocks.add(new Block(BLOCK_START + 4 * BLOCK_GAP, getRandomBlockY(), -5));

        player = new Player(400, PLAYER_GROUND_Y);


        this.elements.add(player);
        this.elements.addAll(blocks);
    }

    private static int getRandomBlockY() {
        int position = RandomGenerator.next(2);

        if(position == 0) {
            return 300;
        } else {
            return 355;
        }
    }

    @Override
    public void update() {
        super.update();

        if(player.x < -player.width) {
            GamePanel.currentScreen = new GameOverScreen();
            return;
        }

        if(player.y >= PLAYER_GROUND_Y && player.yVel > 0) {
            player.y = PLAYER_GROUND_Y;
            player.land();
        }
        
        for (Block b: blocks) {
            if(b.x < -b.width) {
                b.x = 980;
                b.y = getRandomBlockY();
                b.visible = true;
            } else if(b.isCollidingWith(player)) {
                Resources.getHitAudio().play();
                b.visible = false;
                player.x -= 100;
            }
        }
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.cyan);
        g.fillRect(0, 0, Game.WIDTH, Game.HEIGHT);
        g.drawImage(Resources.getGrassImage(), 0, GRASS_Y, null);

        super.draw(g);
    }

    @Override
    public void onKeyPress(int keyCode) {
        if(keyCode == KeyEvent.VK_SPACE && player.y == PLAYER_GROUND_Y) {
            player.jump();
        }
    }
}
