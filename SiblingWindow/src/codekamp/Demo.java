package  codekamp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Demo implements ActionListener {

    private static JLabel l1;
    private static JLabel l2;

    private static JButton b1;
    private static JButton b2;

    public static void main(String[] args) {
        Demo d = new Demo();

        JFrame f1 = new JFrame();
        f1.setSize(500, 300);
        JPanel p1 = new JPanel();

        Demo.l1 = new JLabel();
        Demo.l1.setText("Hello world!");

        Demo.b1 = new JButton();
        Demo.b1.setText("Change Color");
        Demo.b1.addActionListener(d);

        p1.add(Demo.l1);
        p1.add(Demo.b1);

        f1.add(p1);
        f1.setVisible(true);

        JFrame f2 = new JFrame();
        f2.setSize(500, 300);
        JPanel p2 = new JPanel();

        Demo.l2 = new JLabel();
        Demo.l2.setText("Hello world!");

        Demo.b2 = new JButton();
        Demo.b2.setText("Change Color");
        Demo.b2.addActionListener(d);

        p2.add(Demo.l2);
        p2.add(Demo.b2);

        f2.add(p2);
        f2.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == Demo.b1) {
            Demo.l2.setForeground(Color.red);
        } else {
            Demo.l1.setForeground(Color.red);
        }
    }
}