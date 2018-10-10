package codekamp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorFrame extends JFrame {
    private JButton changeColorButton;
    private JButton newWindowButton;
    private JLabel label;

    public ColorFrame() {
        super();

        this.setSize(400, 400);

        JPanel p = new JPanel();

        this.label = new JLabel();
        this.label.setText("Hello World!");

        this.changeColorButton = new JButton();
        this.changeColorButton.setText("Change Color");

        this.changeColorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ColorFrame.this.changeColor();
            }
        });

        // this is new object of color frame
        this.newWindowButton = new JButton();
        this.newWindowButton.setText("new window");
        this.newWindowButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ColorFrame();
            }
        });

        p.add(this.label);
        p.add(this.changeColorButton);
        p.add(this.newWindowButton);

        this.add(p);
        this.setVisible(true);
    }

    private void changeColor() {
        if (this.label.getForeground() == Color.red) {
            this.label.setForeground(Color.black);
        } else {
            this.label.setForeground(Color.red);
        }
    }
}