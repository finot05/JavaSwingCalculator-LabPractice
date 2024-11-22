package swinglab;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcListener implements ActionListener {
    private Calc calc;

    public CalcListener(Calc calc) {
        this.calc = calc;
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equalsIgnoreCase("calculate"))
            calc.calculatePressed();
        else if (e.getActionCommand().equalsIgnoreCase("quit"))
            calc.quitPressed();
    }
}
