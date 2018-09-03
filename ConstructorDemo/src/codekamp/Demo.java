package codekamp;

public class Demo {

    public static void main(String[] args) {
//        Student s = new Student();
//        Student s1 = new Student(); // a.b(); X.y(); new Z();
//
//        System.out.println(s.name);
//        System.out.println(s.age);
//
//        s.name = "Sumit";
//        System.out.println(s.name);
//
//        Student s2 = new Student("Amit");


        Student s3 = new Student(20);
        System.out.println(s3.age);

        Student s4 = new Student(22, "Sumit");
        Student s5 = new Student();

        EngineeringStudent es = new EngineeringStudent();
        es.age = 99;
        es.name = "Anna";

        es.introduce();
    }
}