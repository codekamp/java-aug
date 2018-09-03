package codekamp;

public class EngineeringStudent extends Student {

    public EngineeringStudent() {
        this("fdfd");
        System.out.println("Hello");
    }

    public EngineeringStudent(String a) {
        super(20);
    }

    @Override
    public void introduce() {
        System.out.println("EngineeringStudent classs. Name: " + this.name);
        super.printAge();
    }

    @Override
    public void printAge() {
        System.out.println("EngineeringStudent class. My age is " + this.age);
    }
}