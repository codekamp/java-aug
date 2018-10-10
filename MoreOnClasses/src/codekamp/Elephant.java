package codekamp;

public class Elephant {

    // static code blocks of a class are called first time a class is used

    // static code blocks run max once per session

    static {
        System.out.println("Hello world!");
    }

    static {
        System.out.println("This is Elephant class' code block");
    }

    public static void xyz() {
        System.out.println("Elephant Xyz");
    }

}