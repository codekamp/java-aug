package codekamp;

import codekamp.screens.Screen;
import codekamp.screens.WelcomeScreen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;


public class GamePanel extends JPanel implements KeyListener, MouseListener, Runnable {

    public static Screen currentScreen;

    public GamePanel() {
        super();

        Dimension d = new Dimension(Game.WIDTH, Game.HEIGHT);
        this.setPreferredSize(d);
        this.setFocusable(true);
        this.addKeyListener(this);
        this.addMouseListener(this);
    }

    @Override
    public void addNotify() {
        super.addNotify();

        this.requestFocus();
        Resources.load();

        currentScreen = new WelcomeScreen();

        Thread t = new Thread(this);
        t.setName("loop");
        t.start();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Do nothing
    }

    @Override
    public void keyPressed(KeyEvent e) {
        currentScreen.onKeyPress(e.getKeyCode());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Do nothing
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // Do nothing
    }

    @Override
    public void mousePressed(MouseEvent e) {
        currentScreen.onMousePress(e.getX(), e.getY());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // Do nothing
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // Do nothing
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // Do nothing
    }

    @Override
    public void run() {

        Image bigImage = new BufferedImage(Game.WIDTH, Game.HEIGHT, BufferedImage.TYPE_INT_RGB);

        while (true) {
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {

            }

            Graphics panelGraphics = this.getGraphics();
            Graphics imageGraphics = bigImage.getGraphics();

            // WelcomeScreen ka update, Screen ka update
 // StageOneScreen ka update, Screen ka update, 5 blocks kaa update, player ka update
            currentScreen.update();

            currentScreen.draw(imageGraphics);

            imageGraphics.dispose();

            panelGraphics.drawImage(bigImage, 0, 0, null);
            panelGraphics.dispose();
        }
    }
}