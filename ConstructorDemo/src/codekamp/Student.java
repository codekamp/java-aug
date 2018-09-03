package codekamp;

// constructors:
// 1. non static methods
// 2. Same name as class name
// 3. No return type. not even void.

// 4. Called when creating a new object of the class.
// ... so constructor is always called on that newly created object.
// ... so 'this' inside constructor points to that newly created object.

// 5. Any code that you want to run whenever a object
// ...of XYZ class is created, you can put it in XYZ's constructor

// 6. Just like all other methods, constructors can also be overloaded.

// 7. Any garib class that doesn't have any constructor has
// ...parameterless (default) constructor added to it automatically.

// 8. Constructors are not inherited.

// 9. this() means calling constructor of same class and it can be
// ... only first statement of constructor.

// 10. super() means calling constructor of immediate parent class and
// ... it can be only first statement of constructor.

// 11. Every constructor in it's first statement should call immediate
// ...parent's constructor either directly or indirectly



// 'super' is almost identical to 'this'.
// super's datatype is immediate parent class of current class.
// 'super' is the only variable for which datatype of object doesn't matter
// ...even at run time.

import javax.sound.midi.Soundbank;

public class Student {
    public String name;
    public int age;


//    public Student() {
//        System.out.println("Student class kaa constructor");
//    }
//
//    public Student(String name) {
//        System.out.println("Student class kaa String vala constructor");
//    }

    public Student(int age) {
        this.age = age;
        System.out.println("Student class kaa int vala constructor");
    }

    public Student(int age, String name) {
        this(20);
        this.age = age;
        this.name = name;

        System.out.println("Student class kaa int and string vala constructor");
    }

    public int averageLifeLeft() {
        return 60/this.age;
    }

    public void introduce() {
        System.out.println("Name: " + this.name);
        this.printAge();
    }

    public void printAge() {
        System.out.println("My age is: " + this.age);
    }
}