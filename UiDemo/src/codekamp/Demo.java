package codekamp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by cerebro on 20/08/18.
 */
public class Demo implements ActionListener {

    private String name;
    private int age;

    private static JTextField usernameField;
    private static JTextField passwordField;

    public static void main(String[] args) {

        JFrame loginWindow = new JFrame();
        loginWindow.setSize(500, 600);

        JLabel usernameLabel = new JLabel();
        usernameLabel.setText("username:");

        usernameLabel.setForeground(Color.red);

        Demo.usernameField = new JTextField();
        Demo.usernameField.setText("Enter Username");

        Demo.passwordField = new JPasswordField();
        Demo.passwordField.setText("Enter Password");

        JButton loginButton = new JButton();
        loginButton.setText("Login");


//        loginButton.setClickMethod('login');
//        Above approach won't work because in Java you can't control...
//        ...which function the button will call on click.
//        JButton always calls non static method actionPerformed() on click.
//        But we can control the object on which actionPerformed will be called.

        Demo d = new Demo();
//        Demo d2 = new Demo();
        loginButton.addActionListener(d);

//        d.name = "Amit";
//        d.age = 10;
//
//        d2.name = "Sumit";
//        d2.age = 20;
//        System.out.println(d);

//        System.out.println(d2);

        JPanel mainPanel = new JPanel();
        mainPanel.add(usernameLabel);
        mainPanel.add(Demo.usernameField);
        mainPanel.add(Demo.passwordField);
        mainPanel.add(loginButton);

        loginWindow.add(mainPanel);

        loginWindow.setVisible(true);
    }

    private static void login() {
        String username = Demo.usernameField.getText();
        String password = Demo.passwordField.getText();

        System.out.println("Username is: " + username);
        System.out.println("Password is: " + password);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Demo.login();
    }

    @Override
    public String toString() {
        return "Demo named: " + this.name + ", age: " + this.age;
    }
}
