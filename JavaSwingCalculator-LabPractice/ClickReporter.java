package swinglab;

import javax.swing.*;
import java.awt.*;

public class ClickReporter extends JFrame {
    private JLabel counterLabel;
    private int counter = 0;

    public ClickReporter(){
        JButton myButton = new JButton("Click Here");
        counterLabel = new JLabel("click here");
        CalcListener listener = new CalcListener(new Calc());
        myButton.addActionListener(listener);

        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        cp.add(myButton);
        cp.add(counterLabel);
        setTitle("Click Reporter");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
    public void incrementCounter(){
        counter++;
        counterLabel.setText(counter + "");
        pack();
    }

    public static void main(String[] args) {
        ClickReporter cr = new ClickReporter();
    }
}
