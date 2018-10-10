package codekamp;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginScreen implements ActionListener {

    public JPanel mainPanel;
    private JTextField usernameField;
    private JTextField passwordField;
    private JButton loginButton;

    public LoginScreen() {
        super();
        this.loginButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Username is: " + this.usernameField.getText());
        System.out.println("Password is: " + this.passwordField.getText());
    }
}