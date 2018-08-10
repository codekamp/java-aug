package codekamp;

/**
 * Created by cerebro on 10/08/18.
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Dog.talk();

        Cat.talk();

//        System.out.println(Dog.averageAge); // can't use it here as averageAge is private
        System.out.println(Cat.averageAge);

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.name = "Sumit";
        s1.marks = 59.6f;
        Student.averageMarks = 80.0f;

        System.out.println(Student.averageMarks);

        s2.name = "Amit";
        s2.marks = 99.9f;
        Student.averageMarks = 50.0f;


        System.out.println(s1.name); // Student.name will give error
        System.out.println(s2.name);
        System.out.println(s1.marks);
        System.out.println(s2.marks);
        System.out.println(Student.averageMarks); // s1.averageMarks will give warning
        System.out.println(Student.averageMarks);


//        String str1 = "hello";
//        int int1 = 10;
//        float float1 = 10.519f;
//        double double1 = 10.5;
//
//        int[] intArray1 = new int[10];
//
//        intArray1[0] = 32;
//        intArray1[1] = 56;
//
//        int[] intArray2 = {10, 20, 30};
    }
}
