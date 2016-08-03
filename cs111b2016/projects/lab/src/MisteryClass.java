import java.awt.*;  // abstract window and tool kit
import java.awt.event.*;  // event handler
import javax.swing.*;  // Core of GUI



private JTextField input;
private JLabel output;



public MysteryClass () {
        // other setup code not displayed
        input = new JTextField("Enter something here ");
        contentPane.add(input );

        output = new JLabel("waiting");
        contentPane.add(output);

        input.addActionListener(new InputFieldListener());
        }

public class InputFieldListenerimplements ActionListener {
    public void actionPerformed(ActionEvent e) {
        String inputText = input.getText();
        boolean correct = inputText.equalsIgnoreCase("something") ? true : false;
        output.setText(correct ?  "you got it" : "not quite");
        if(correct) {
            input.setEnabled(false);
        }
    }
}

if text inputed on inputText = something, correct gets value true.

If correct = true, output setText receives you got it.

if correct = true, the inputtext becomes unabled