package codekamp;

/**
 * Created by cerebro on 15/08/18.
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        Dog d1 = new Dog();
        Cat c1 = new Cat();

        d1.moveLeft();
        c1.moveLeft();

        d1.chaseTheTail();
    }
}


// outside class - only package statement and imports

// inside class but outside methods - Only method definition
// ... and variable definition & initialization. No function call, if else,
// ... System.out.println etc allowed
