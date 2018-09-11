package codekamp;

public class Student {

    private int rollNumber;
    private String name;

    public Student(int rollNumber) {
        this.rollNumber = rollNumber;
    }


    // 1. A function can have one and only one return type but can have
    // ...zero or more throw type.

    // 2. Return type can be anything. Throw type should be a Exception or
    // ... any of it's subclasses.


    public int getMarks() throws RollnumberNotFoundException {
        int[] marks = {10, 20, 30, 40};

        if(this.rollNumber >= marks.length) {
            // rollnumber not found
            RollnumberNotFoundException r = new RollnumberNotFoundException();
            throw r;
        } else {
            return marks[this.rollNumber];
        }
    }
}