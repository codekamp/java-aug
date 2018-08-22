package codekamp;

import java.util.Random;

/**
 * Created by cerebro on 15/08/18.
 */
public class Demo {

    // Approach #1
//    public static Dog screenDog;
//    public static Cat screenCat;
//    public static int rNum;

    // Approach #2
    public static Animal screenAnimal;

    public static void main(String[] args) {
        System.out.println("Hello world!");


        Dog d1 = new Dog();
        Cat c1 = new Cat();

// d1.moveLeft() means we are trying to call public, non static method
// ... of Dog class named moveLeft.
// ... so method will be first searched in Dog class and if not found there
// ... then in parent class (Animal).
        d1.moveLeft();

        Animal a1 = new Animal();

        a1.moveLeft();

        d1.hashCode();

        d1.moveLeft();

// In a variable of class XYZ you can store objects of XYZ and it's subclasses
// But we can't store objects of XYZ's parent in it.

// Method/Variable search starts from class/datatype of variable at compile time.

// But at runtime method/variable search starts from class/datatype of Object.


// We can always determine class/datatype of variable at compile time.
// But we can't always determine class/datatype of object at compile time.

        Random r = new Random();

        int rNum = r.nextInt(2); // 0 or 1

        if (rNum == 0) {
            Demo.screenAnimal = new Dog();
            System.out.println("Dog created");
        } else {
            Demo.screenAnimal = new Cat();
            System.out.println("Cat created");
        }


        // In real project, these will be called on user actions.
        Demo.onLeftSwipe();
        Demo.onDoubleTap();

    }


    public static void onLeftSwipe() {
        // Approach #1
//        if(Demo.rNum == 0) {
//            Demo.screenDog.moveLeft();
//        } else {
//            Demo.screenCat.moveLeft();
//        }


        // Approach #2
        Demo.screenAnimal.moveLeft();
    }

    public static void onDoubleTap() {
        // Approach #1
//        if(Demo.rNum == 0) {
//            Demo.screenDog.doFavouriteThing();
//        } else {
//            Demo.screenCat.doFavouriteThing();
//        }


        // Approach #2
        // variable's datatype is Animal
        // Objects datatype is either Dog or Cat. Pakka pata chalega run time pe.
        Demo.screenAnimal.doFavouriteThing();
    }



    public void addActionListner(Object a) {

    }
}


// outside class - only package statement and imports

// inside class but outside methods - Only method definition
// ... and variable definition & initialization. No function call, if else,
// ... System.out.println etc allowed


// Method Overridding - Adding a method in class with same signature as
// ... of an inherited method.

// We can create multiple methods of same name as long as they have
// ...different parameter type.

// Method Overloading - If a class has multiple methods of same name, it's
// ... it's called method overloading.

// Every class in Java inherit from Object, directly or indirectly.
// Sab kaa malik ek hai