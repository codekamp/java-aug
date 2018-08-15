package codekamp;

/**
 * Created by cerebro on 10/08/18.
 */
public class Dog {

    // Static means group ki property
    // non static means individual ki property

    //abstraction
    private static int averageAge = 12;
    private static String userName = "Amit";

    public static void talk() {
        System.out.println(Dog.averageAge);
        System.out.println("Wuff Wuff!");
    }

    public void pqr(String a) {
        // Dataype of 'this' is Dog
    }
}
