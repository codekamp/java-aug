package codekamp;

/**
 * Created by cerebro on 06/08/18.
 */
public class Ship {

    private static int bombCount = 10;

    public static void fire(int x, int y) {
        if(bombCount == 0) {
            return;
        }

        // animation code
        System.out.println("Boom!");

        Ship.bombCount--;
    }

    public static int getBombCount() {
        return Ship.bombCount;
    }


}
