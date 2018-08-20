package codekamp;

import javax.swing.*;

/**
 * Created by cerebro on 20/08/18.
 */
public class Demo {
    public static void main(String[] args) {

        JFrame loginWindow = new JFrame();
        loginWindow.setSize(500, 600);

        JTextField usernameField = new JTextField();
        usernameField.setText("Enter Username");

        JPasswordField passwordField = new JPasswordField();
        passwordField.setText("Enter Password");

        JButton loginButton = new JButton();
        loginButton.setText("Login");

        JPanel mainPanel = new JPanel();
        mainPanel.add(usernameField);
        mainPanel.add(passwordField);
        mainPanel.add(loginButton);

        loginWindow.add(mainPanel);

        loginWindow.setVisible(true);

        // Cave of programming
        // 
    }
}
