/**
 * Created by vinicius on 7/10/16.
 */

import java.awt.*;  // abstract window and tool kit
import java.awt.event.*;  // event handler
import javax.swing.*;  // Core of GUI


public class GuiTemplate extends JFrame{

    /**
     * Declare references to GUI components (labels, buttons, text fields, etc.),
     * objects (Strings, etc.), and primitive variables (int, double, etc).
     */

    private Container contentPane;

    public GuiTemplate (){  /* ??? CONSTRUCTOR NAME */
        super("??? title bar text here");

        // set the width and height of the window (in pixels)
        setSize(???,???);

        // Get the content pande add a panel to it
        // set the background color of the panel (Color.??? constants)
        contentPane = getContentPane();
        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(???);
        contentPane.add(mainPanel);

        /**
         * ??? For each GUI component:
         * a) Construct the component
         * b) Customize it, if necessary
         * c) Add it to the main panel
         * d) add a listener, if necessary
         */
    }


    public static void main(String args[]){
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                //Create an object of your class
                GuiTemplate frame = new GuiTemplate();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}
