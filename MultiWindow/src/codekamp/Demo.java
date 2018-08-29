package codekamp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by cerebro on 24/08/18.
 */
public class Demo implements ActionListener {

    private JLabel l;
    private JButton changeColorButton;
    private JButton newWindowButton;

    private Demo[] children = new Demo[10];
    private int childrenCount = 0;

    public static void main(String[] args) {
        Demo.createWindow();
    }

    // let's say newWindowButton of second JFrame was called
    // e.getSource() will be newWindowButton of second JFrame which is
    // ... stored in newWindowButton variable of second object of Demo.
    // 'this' will be second object of Demo
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.changeColorButton) {
            if(this.l.getForeground() == Color.red) {
                this.l.setForeground(Color.black);
            } else {
                this.l.setForeground(Color.red);
            }
        } else if(e.getSource() == this.newWindowButton) {
            Demo d = Demo.createWindow();

            this.children[childrenCount] = d;
            this.childrenCount++;
        }
    }

    private static Demo createWindow() {
        JFrame f = new JFrame();
        f.setSize(400, 400);

        JPanel p = new JPanel();


        Demo d = new Demo();
        d.l = new JLabel();
        d.l.setText("Hello World!");

        d.changeColorButton = new JButton();
        d.changeColorButton.setText("Change Color");

        d.changeColorButton.addActionListener(d);

        d.newWindowButton = new JButton();
        d.newWindowButton.setText("new window");
        d.newWindowButton.addActionListener(d);

        p.add(d.l);
        p.add(d.changeColorButton);
        p.add(d.newWindowButton);

        f.add(p);
        f.setVisible(true);
        return d;
    }
}
