package osantana;
import java.awt.event.*;
import javax.swing.*;

class TemperatureConverterController implements ActionListener{


    private JButton up;
    private JButton down;
    private JTextField textField;
    private int count = 0;

    public TemperatureConverterController(JButton u, JButton d, JTextField t){
        up = u;
        down = d;
        textField = t;
    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == up){
            count++;
            textField.setText("Count: " + count);
        }
        else if (e.getSource() == down){
            count--;
            textField.setText("Count: " + count);
        }
    }
}
