package codekamp;

/**
 * Created by cerebro on 10/08/18.
 */
public class Student {
    public String name;
    public String email;
    public int age;
    public float marks = 55;

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
}
