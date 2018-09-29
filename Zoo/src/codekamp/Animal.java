package codekamp;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by cerebro on 15/08/18.
 */
abstract public class Animal {
    public void moveLeft() {
        System.out.println("Moving to the left (animal class vala)");
    }

    abstract void doFavouriteThing();
}

// Abstract Class - Is a class, jiska object nahi ban sakta. But uski non
// ...abstract subclasses kaa object ban sakta hai.

// Abstract Method/Function - Method which has no body i.e. it has only
// ...signature. Abstract methods can be created only inside
// ...interface or Abstract classes.


// Interface can only have abstract methods. Non Abstract classes can only have
// ...non abstract methods.
// Abstract Classes can have both abstract and non abstract methods.


// Subclasses of an abstract class should implement any inherited unimplemented
// ...methods or they themselves should be declared abstract.



