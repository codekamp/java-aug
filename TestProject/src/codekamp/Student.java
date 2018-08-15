package codekamp;

/**
 * Created by cerebro on 10/08/18.
 */
public class Student {
    public String name;
    public String email;
    public int age;

    public int engMarks; // 20
    public int hindiMarks; // 50
    public int mathsMarks; // 33

    public String[] emailAddrs;


//    https://github.com/codekamp/java-aug


    // All functions and all global variables should be accessed with a dot.
    // if static, containig class' name will come before dot.
    // if non static, a variable of containing class with come before dot.

    public static float averageMarks = 99;

    private static int xyz() {
        float pqr = 100;
        System.out.println(pqr);
        System.out.println(Student.averageMarks);

        return 10;
    }

    private static void hello() {
        float pqr = 99;
        System.out.println(Student.averageMarks);
    }

    // 'this' is a magic local variable which gets added to all non static
    // ...methods automatically.
    // datatype of 'this' is containing class of method.
    // this stores the object on which the method was called.
    public boolean hasPassed() {
        // this
        return this.engMarks >= 20 && this.hindiMarks >= 50 && this.mathsMarks >= 33;
    }

    public boolean hasScoredMoreThan(Student other) {
        int firstStudentMarks = this.engMarks + this.hindiMarks + this.mathsMarks;
        int secondStudentMarks = other.engMarks + other.hindiMarks + other.mathsMarks;

        return firstStudentMarks > secondStudentMarks;
    }
}
