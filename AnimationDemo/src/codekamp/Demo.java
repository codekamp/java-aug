package codekamp;

import javax.swing.*;
import java.awt.*;

public class Demo {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(500, 400);
        JPanel p = new JPanel();
        f.add(p);
        f.setVisible(true);

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {

        }

        Graphics g = p.getGraphics();

//        g.setColor(Color.red);
//        g.fillRect(10, 100, 150, 50);

        g.setColor(Color.green);
//        g.fillRect(200, 10, 50, 150);

        int x = 0;
        while(x < 300) {
            try {
                Thread.sleep(17);
            } catch (InterruptedException e) {

            }
            g.clearRect(x, 0, 100, 100);
            g.fillArc(++x, 0, 100, 100, 45, 270);
        }

    }
}