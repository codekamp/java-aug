package codekamp;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

public class Demo implements KeyListener, MouseListener {

    private static int playerYCord = 315;
    private static int playerYVel = 0;
    private static int playerYAcc = 0;
    private static boolean pause = false;
    private static AudioClip jumpAudio;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.add(panel);

        Dimension d = new Dimension(800, 450);
        panel.setPreferredSize(d);
        panel.setFocusable(true);
        Demo demo1 = new Demo();
        panel.addKeyListener(demo1);
        panel.addMouseListener(demo1);

        frame.pack();

        frame.setVisible(true);


//        1 2 3 4 5 4 3 2         1 2 3 4 5 4 3 2


        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
        }

        panel.requestFocus();
        Graphics g = panel.getGraphics();

        Image grassImage;
        Image[] playerImages = new Image[8];
        Image jumpImage;
        Image playerImage;
        Image blockImage;

        Demo.jumpAudio = Applet.newAudioClip(Demo.class.getClassLoader().getResource("codekamp/audios/onjump.wav"));
        AudioClip hitAudio = Applet.newAudioClip(Demo.class.getClassLoader().getResource("codekamp/audios/hit.wav"));

        try {
            grassImage = ImageIO.read(Demo.class.getClassLoader().getResourceAsStream("codekamp/images/grass.png"));
            blockImage = ImageIO.read(Demo.class.getClassLoader().getResourceAsStream("codekamp/images/block.png"));
            jumpImage = ImageIO.read(Demo.class.getClassLoader().getResourceAsStream("codekamp/images/jump.png"));
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
        int playerXCord = 400;
        int block1XCord = 900;
        int block2XCord = 1100;
        int block3XCord = 1300;
        int block4XCord = 1500;
        int block5XCord = 1700;

        boolean block1Visible = true;
        boolean block2Visible = true;
        boolean block3Visible = true;
        boolean block4Visible = true;
        boolean block5Visible = true;

        while (true) {
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
            }

            if (Demo.pause) {
                g.setColor(Color.green);
                g.fillRect(50, 50, 50, 50);
                continue;
            }

            i++;

            if (i == 8) {
                i = 0;
            }

//            i = i % 8;

//            Demo.playerYCord = Demo.playerYCord + Demo.playerYVel;
            Demo.playerYCord += Demo.playerYVel;
            Demo.playerYVel += Demo.playerYAcc;

            if (Demo.playerYCord >= 315) {
                Demo.playerYCord = 315;
                Demo.playerYVel = 0;
                Demo.playerYAcc = 0;
            }
            playerImage = playerImages[i];

            if (Demo.playerYCord < 315) {
                playerImage = jumpImage;
            }

            block1XCord -= 4;

            if (block1XCord <= -20) {
                block1XCord = 980;
                block1Visible = true;
            }

            if (block1Visible && Demo.isColliding(playerXCord, Demo.playerYCord, block1XCord)) {
                playerXCord -= 100;
                block1Visible = false;
                hitAudio.play();
            }


            block2XCord -= 4;

            if (block2XCord <= -20) {
                block2XCord = 980;
                block2Visible = true;
            }

            if (block2Visible && Demo.isColliding(playerXCord, Demo.playerYCord, block2XCord)) {
                playerXCord -= 100;
                block2Visible = false;
                hitAudio.play();
            }


            block3XCord -= 4;

            if (block3XCord <= -20) {
                block3XCord = 980;
                block3Visible = true;
            }

            if (block3Visible && Demo.isColliding(playerXCord, Demo.playerYCord, block3XCord)) {
                playerXCord -= 100;
                block3Visible = false;
                hitAudio.play();
            }


            block4XCord -= 4;

            if (block4XCord <= -20) {
                block4XCord = 980;
                block4Visible = true;
            }

            if (block4Visible && Demo.isColliding(playerXCord, Demo.playerYCord, block4XCord)) {
                playerXCord -= 100;
                block4Visible = false;
                hitAudio.play();
            }


            block5XCord -= 4;

            if (block5XCord <= -20) {
                block5XCord = 980;
                block5Visible = true;
            }

            if (block5Visible && Demo.isColliding(playerXCord, Demo.playerYCord, block5XCord)) {
                playerXCord -= 100;
                block5Visible = false;
                hitAudio.play();
            }


            if (playerXCord < -72) {
                g.setColor(Color.green);
                g.fillRect(0, 0, 800, 450);
                g.setColor(Color.red);
                g.drawString("Game Over", 100, 100);
                break;
            }


            g.setColor(Color.cyan);
            g.fillRect(0, 0, 800, 450);
            g.setColor(Color.red);
            g.fillRect(50, 50, 50, 50);

            g.drawImage(grassImage, 0, 405, null);

            if (block1Visible) {
                g.drawImage(blockImage, block1XCord, 355, null);
            }

            if (block2Visible) {
                g.drawImage(blockImage, block2XCord, 355, null);
            }

            if (block3Visible) {
                g.drawImage(blockImage, block3XCord, 355, null);
            }

            if (block4Visible) {
                g.drawImage(blockImage, block4XCord, 355, null);
            }

            if (block5Visible) {
                g.drawImage(blockImage, block5XCord, 355, null);
            }

            g.drawImage(playerImage, playerXCord, Demo.playerYCord, null);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (Demo.pause) {
            return;
        }

        if (e.getKeyCode() == KeyEvent.VK_SPACE && Demo.playerYCord == 315) {
            Demo.jumpAudio.play();
            Demo.playerYVel = -18;
            Demo.playerYAcc = 1;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    private static boolean isColliding(int playerX, int playerY, int blockX) {
        boolean xOverlap = (playerX > blockX && playerX < blockX + 20)
                || (blockX > playerX && blockX < playerX + 72);

        boolean yOverlap = (playerY > 355 && playerY < 405)
                || (355 > playerY && 355 < playerY + 90);


        return xOverlap && yOverlap;
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

        if (e.getX() > 50 && e.getX() < 100 && e.getY() > 50 && e.getY() < 100) {
            Demo.pause = !Demo.pause;
        }

//        if(Demo.pause) {
//            Demo.pause = false;
//        } else {
//            Demo.pause = true;
//        }
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
}