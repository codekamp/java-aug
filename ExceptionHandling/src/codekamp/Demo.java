package codekamp;

public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student(2);

        Student s2 = new Student(10);

        int result = 0;
        try {
            result = s2.getMarks();
            System.out.println("marks hain " + result);
        } catch (Exception e) {
            System.out.println("show error to user that roll number not found");
        }
    }
}