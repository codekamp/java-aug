package codekamp;

public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student(2);

        Student s2 = new Student(10);

        Student s3 = new Student(5);



        int result = 0;
        try {
            result = s2.getMarks();
            System.out.println("marks hain " + result);

        } catch (RollnumberNotFoundException e1) {
            // backup plan for failure reason #1

            System.out.println("Please check the number you have typed");

            System.out.println("IVRS");

        } catch (CopyNotCheckedException e) {

        } finally {
            System.out.println("run this in all cases");
        }

        System.out.println("hello");
    }
}