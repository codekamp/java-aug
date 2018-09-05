package codekamp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorFrame extends JFrame implements ActionListener {
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

        this.changeColorButton.addActionListener(this);

        // this is new object of color frame
        this.newWindowButton = new JButton();
        this.newWindowButton.setText("new window");
        this.newWindowButton.addActionListener(this);

        p.add(this.label);
        p.add(this.changeColorButton);
        p.add(this.newWindowButton);

        this.add(p);
        this.setVisible(true);
    }


    // 'this' is the ColorFrame object on which action performed was called
    // ... which means it the ColorFrame object jiska button click hua hai


    // e.getSource() is the button that was clicked
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.changeColorButton) {
            if(this.label.getForeground() == Color.red) {
                this.label.setForeground(Color.black);
            } else {
                this.label.setForeground(Color.red);
            }
        } else if(e.getSource() == this.newWindowButton) {
            new ColorFrame();
        }
    }
}