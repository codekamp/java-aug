package codekamp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by cerebro on 24/08/18.
 */
public class Demo implements ActionListener {

    private static JLabel l;
    private static JButton changeColorButton;
    private static JButton newWindowButton;

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(400, 400);

        JPanel p = new JPanel();

        Demo.l = new JLabel();
        Demo.l.setText("Hello World!");

        Demo.changeColorButton = new JButton();
        Demo.changeColorButton.setText("Change Color");

        Demo d = new Demo();
        Demo.changeColorButton.addActionListener(d);

        Demo.newWindowButton = new JButton();
        Demo.newWindowButton.setText("new window");
        Demo.newWindowButton.addActionListener(d);

        p.add(Demo.l);
        p.add(Demo.changeColorButton);
        p.add(Demo.newWindowButton);

        f.add(p);
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == Demo.changeColorButton) {
            Demo.l.setForeground(Color.red);
        } else {
            System.out.println("New window button clicked");
        }
    }
}
