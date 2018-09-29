package codekamp;

import javax.swing.*;

public class Game {

    public static final int WIDTH = 800;
    public static final int HEIGHT = 450;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        GamePanel panel = new GamePanel();
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}

// libgdx
// Unity, Unreal