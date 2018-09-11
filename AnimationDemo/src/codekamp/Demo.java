package codekamp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Demo implements KeyListener {

    public static int xVel = 0;
    public static int yVel = 0;
    public static int startAngle = 45;

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(500, 400);
        JPanel p = new JPanel();

        // make this panel focusable just like textFields
        // ... which means it can now listen to key presses.
        p.setFocusable(true);
        p.addKeyListener(new Demo());

        f.add(p);
        f.setVisible(true);

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {

        }

        p.requestFocus();

        Graphics g = p.getGraphics();

//        g.setColor(Color.red);
//        g.fillRect(10, 100, 150, 50);

        g.setColor(Color.green);
//        g.fillRect(200, 10, 50, 150);

        int x = 0;
        int y = 0;
        while(true) {
            try {
                Thread.sleep(17);
            } catch (InterruptedException e) {

            }

            g.clearRect(0, 0, 500, 400);

            x = x + Demo.xVel;
            y = y + Demo.yVel;

            g.fillArc(x, y, 100, 100, Demo.startAngle, 270);
        }

    }

    @Override
    public void keyTyped(KeyEvent e) {
        // do nothing
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_LEFT) {
            Demo.xVel = -2;
            Demo.yVel = 0;
            Demo.startAngle = 225;
        } else if(e.getKeyCode() == KeyEvent.VK_UP) {
            Demo.xVel = 0;
            Demo.yVel = -2;
            Demo.startAngle = 135;
        } else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
            Demo.xVel = 2;
            Demo.yVel = 0;
            Demo.startAngle = 45;
        } else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
            Demo.xVel = 0;
            Demo.yVel = 2;
            Demo.startAngle = -45;
        } else if(e.getKeyCode() == KeyEvent.VK_SPACE) {
            Demo.xVel = 0;
            Demo.yVel = 0;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // do nothing
    }
}