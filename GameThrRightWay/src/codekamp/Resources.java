package codekamp;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;

// TODO: Add private constructor
abstract public class Resources {
    private static Image grassImage;
    private static Image blockImage;

    public static void load() {
        try {
            grassImage = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("codekamp/images/grass.png"));
            blockImage = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("codekamp/images/block.png"));
        } catch (IOException e) {
            System.out.println("Image loading failed with error: " + e.getMessage());
        }
    }

    public static Image getGrassImage() {
        return grassImage;
    }

    public static Image getBlockImage() {
        return blockImage;
    }
}