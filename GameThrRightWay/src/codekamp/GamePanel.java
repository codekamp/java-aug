package codekamp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class GamePanel extends JPanel implements KeyListener, MouseListener, Runnable {
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

        Thread t = new Thread(this);
        t.setName("loop");
        t.start();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void run() {

        while (true) {
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {

            }

            Graphics g = this.getGraphics();
            g.drawImage(Resources.getGrassImage(), 0, 405, null);
            g.dispose();
        }
    }
}