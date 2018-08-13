package codekamp;

/**
 * Created by cerebro on 10/08/18.
 */
public class Demo {

    private static Student s1;

    public static void main(String[] args) {
//        System.out.println("Hello world!");
//
//        Dog.talk();
//
//        Cat.talk();
//
////        System.out.println(Dog.averageAge); // can't use it here as averageAge is private
//        System.out.println(Cat.averageAge);
//
//        Demo.s1 = new Student();
//        Student s2 = new Student();
//        Student s3 = new Student();
//
//        s1.name = "Sumit";
//        s1.marks = 59.6f;
//        Student.averageMarks = 80.0f;
//
//        System.out.println(Student.averageMarks);
//
//        s2.name = "Amit";
//        s2.marks = 99.9f;
//        Student.averageMarks = 50.0f;
//
//
//        System.out.println(Demo.s1.name); // Student.name will give error
//        System.out.println(s2.name);
//        System.out.println(s1.marks);
//        System.out.println(s2.marks);
//
//        System.out.println(Student.averageMarks); // s1.averageMarks will give warning
//        System.out.println(Student.averageMarks);
//
//
//        System.out.println("hello world!");
//
//
//        String str1 = "hello";
//
//        System.out.println(str1.length());

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



        int[] arr1 = {10, 20, 30}; // Object #1
        int[] arr2 = arr1;
        int[] arr3 = {10, 20, 30}; // Object #2

        System.out.println(arr1[0]);
        System.out.println(arr2[0]);
        System.out.println(arr3[0]);

        arr1[0] = 25;

        System.out.println(arr1[0]);
        System.out.println(arr2[0]);
        System.out.println(arr3[0]);

        arr1 = arr3;


        System.out.println(arr1[0]);
        System.out.println(arr2[0]);
        System.out.println(arr3[0]);

        arr2 = arr1;

        System.gc();


        Student s1 = new Student();
        s1.name = "Suresh";
        s1.emailAddrs = new String[5];
        s1.emailAddrs[0] = "suresh@gmail.com";

        Student s2 = s1;

//        s1.emailAddrs or s2.emailAddrs

        System.out.println(s1.emailAddrs[0]);
        System.out.println(s2.emailAddrs[0]);


        s2.emailAddrs = new String[30];
        s2.emailAddrs[0] = "dinesh@gmail.com";

        System.out.println(s1.emailAddrs[0]);
        System.out.println(s2.emailAddrs[0]);

//        abstraction
//        encaptulation - everything has a place and everything at it's place

    }
}
