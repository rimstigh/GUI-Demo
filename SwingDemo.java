import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class SwingDemo {
  SwingDemo() {
    JFrame frame = new JFrame("Swing Demo");

    //size in pixels, 275 wide, 100 high
    frame.setSize(275, 100);

    //below is the command to close the program on window close
    //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    //label is a passive text field
    JLabel jlab = new JLabel(" Oh hey a label! ");

    JLabel jlab2 = new JLabel(" Second Label");

    frame.add(jlab);
    frame.add(jlab2, BorderLayout.SOUTH);

    frame.setVisible(true);
  }
}