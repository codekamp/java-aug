package codekamp;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.add(panel);

        Dimension d = new Dimension(800, 450);
        panel.setPreferredSize(d);

        frame.pack();

        frame.setVisible(true);


//        1 2 3 4 5 4 3 2         1 2 3 4 5 4 3 2


        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
        }

        Graphics g = panel.getGraphics();

        Image grassImage;
        Image[] playerImages = new Image[8];

        try {
            grassImage = ImageIO.read(Demo.class.getClassLoader().getResourceAsStream("codekamp/images/grass.png"));
            playerImages[0] = ImageIO.read(Demo.class.getClassLoader().getResourceAsStream("codekamp/images/run_anim1.png"));
            playerImages[1] = ImageIO.read(Demo.class.getClassLoader().getResourceAsStream("codekamp/images/run_anim2.png"));
            playerImages[2] = ImageIO.read(Demo.class.getClassLoader().getResourceAsStream("codekamp/images/run_anim3.png"));
            playerImages[3] = ImageIO.read(Demo.class.getClassLoader().getResourceAsStream("codekamp/images/run_anim4.png"));
            playerImages[4] = ImageIO.read(Demo.class.getClassLoader().getResourceAsStream("codekamp/images/run_anim5.png"));
            playerImages[5] = playerImages[3];
            playerImages[6] = playerImages[2];
            playerImages[7] = playerImages[1];
        } catch (IOException e) {
            System.out.println("Please reinstall the game");
            return;
        }

        int i = 0;
        while (true) {
            try {
                Thread.sleep(17);
            } catch (InterruptedException e) {
            }

            i++;

            if(i == 8) {
                i = 0;
            }

//            i = i % 8;

            g.setColor(Color.cyan);
            g.fillRect(0, 0, 800, 450);

            g.drawImage(grassImage, 0, 405, null);
            g.drawImage(playerImages[i], 400, 315, null);
        }
    }
}