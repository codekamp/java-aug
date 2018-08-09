package codekamp;

/**
 * Created by cerebro on 06/08/18.
 */
public class Dog {
    // private variables/functions can only be accessed in same class.
    // public can be accessed in any class.
    private static int averageAge = 12;

    public static void talk() {
        System.out.println(Dog.averageAge);
        System.out.println("Wuff Wuff!");
    }

    // abstraction:
}
