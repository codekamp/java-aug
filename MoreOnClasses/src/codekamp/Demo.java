package codekamp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Demo {
    public static void main(String[] args) {
        Demo demo1 = new Demo(); // #1
        Demo demo2 = new Demo(); // #2

        demo2.something();

        // we are creating object of ActionListner interface
        // but interface ke objects toh nahi ban sakte, hence error.
//        new ActionListner();

        // we are creating object of an anonymous class which implements
        // action listner interface
        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        };

        Dog d3 = new Dog();
        d3.name = "Pluto";

        Dog d4 = new Dog();
        d4.name = "Jupiter";


        Dog.Xyz x1 = d3.new Xyz();
        Dog.Xyz x2 = d3.new Xyz();
        Dog.Xyz x3 = d4.new Xyz();

        x1.hello();
    }

    public void something() {
//        this.jump();
//        System.out.println("world world");
        Dog d = new Dog(); // we are creating object of Dog class
        Dog d1 = new Dog() {  // we are creating object of subclass of Dog
            @Override
            public void talk() {
                Demo.this.jump(); // here we can use outer this as well
                this.jump(); // datatype of 'this' is anonymous subclass of Dog
                System.out.println("Hello Hello");
            }

            public void jump() {
                System.out.println("Dog anonymous Jump");
            }
        };

        d1.talk();

//        new Dog() {
//            @Override
//            public void talk() {
//                System.out.println("Hello Hello");
//            }
//
//            public void jump() {
//                System.out.println("Jump Jump");
//            }
//        }.jump();
//
//
//        new Dog().talk();
    }

    public void jump() {
        System.out.println("Demo Jump");
    }
}

// anonymous classes
// nested classes