package osantana;
import javax.swing.*;
import java.awt.*;

public class TemperatureConverterMain{
    public static void main(String[] args){

//        System.out.println("Yooo");

        JFrame frame;
        JTextField textField;
        JButton f2cButton;
        JButton c2fButton;

        //Construc the Swing objects
        frame = new JFrame("Temperature Converter");
        textField = new JTextField("Temperature");
        f2cButton = new JButton("C to F");
        c2fButton = new JButton("F to C");

        //Add the components to the frame
        frame.getContentPane().add(textField);
        frame.getContentPane().add(f2cButton);
        frame.getContentPane().add(c2fButton);

        //Layout...
        frame.getContentPane().setPreferredSize(new Dimension(200, 100));
        frame.setLocation(300, 300);
        frame.setLayout(new FlowLayout());
        textField.setPreferredSize(new Dimension(200, 50));
        textField.setHorizontalAlignment(JLabel.CENTER);

        Listen for some actions


        TemperatureConverterController c = new TemperatureConverterController(upButton, downButton,textField);
        upButton.addActionListener(c);
        downButton.addActionListener(c);

        //Set visible
        frame.pack();
        frame.setVisible(true);
    }
}