package codekamp;

import javax.swing.*;

public class Demo {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        LoginScreen l = new LoginScreen();

        frame.add(l.mainPanel);
        frame.pack();
        frame.setVisible(true);

//        https://bitbucket.org/xerial/sqlite-jdbc/downloads/
//        https://sqlitebrowser.org/
    }
}