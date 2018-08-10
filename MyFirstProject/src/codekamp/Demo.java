// Naming convention:
// variable: Camel case with first letter small. .e.g. myAwesomeVariable
// function: Camel case with first letter small. e.g. myAwesomeFunction() {}
// class: Camel case with first letter capital. e.g. MyAwesomeClass
// file: Camel case with first letter capital. e.g. MyAwesomeFile.java
// constants: snake case with all letters capital. MY_AWESOME_CONSTANT


// #include is called import
// no need of importing files of same folder.

// path of folder after src.
package codekamp;


// Public class should have same name as file name.
public class Demo {

    public static int averageAge = 99;

    public static void main(String[] args) {
        System.out.println("Hello World!");

        // Always use global variables and functions (methods) with a dot.
        System.out.println(Demo.averageAge);
//        System.out.println(Dog.averageAge); // private variables, so can't use here
        System.out.println(Cat.averageAge);
        System.out.println(averageAge); // Don't do this. Always use dot.


        Dog.talk();
        Cat.talk();


        System.out.println(Ship.getBombCount());

        Ship.fire(10, 30);


        System.out.println(Ship.getBombCount());
    }
}