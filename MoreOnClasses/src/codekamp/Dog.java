package codekamp;

public class Dog {
    public String name;

    public void talk() {
        System.out.println("Wuff Wuff!");
    }



    public void walk() {
        System.out.println("Dog walking " + this.name);
    }

    public class Xyz {
        public void hello() {
            this.walk();
            Dog.this.walk();
            System.out.println("Hello Xyz");
        }

        public void walk() {
            System.out.println("Xyz walking");
        }
    }
}