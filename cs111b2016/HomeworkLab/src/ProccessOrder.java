import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ProccessOrder extends JFrame {

    private JCheckBox item1Checkbox;
    private JCheckBox item2Checkbox;
    private JCheckBox item3Checkbox;
    private JRadioButton regularShippingSpeedRadioButton;
    private JRadioButton fastShippingSpeedRadioButton;
    private JTextField summaryTextField;
    private JButton clickButton;
    private Container contentPane;

    private void groupButton() {
        ButtonGroup bg1 = new ButtonGroup();
        bg1.add(regularShippingSpeedRadioButton);
        bg1.add(fastShippingSpeedRadioButton);
    }

//    ButtonGroup group = new ButtonGroup();
//    group.add(regularShippingSpeedRadioButton);
//    group.add(fastShippingSpeedRadioButton);


    public ProccessOrder() {
        /*
		 * ??? For EACH GUI component: a) construct the component,
		 * b) customize it, if necessary, c) add it to the main panel,
		 * and d) add a listener, if necessary
		 *
		 */
        super("My Thing");
        setSize(500, 500);

        contentPane = getContentPane();
        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(Color.red);

        contentPane.add(mainPanel);


        item1Checkbox = new JCheckBox("Item 1");
        item2Checkbox = new JCheckBox("Item 2");
        item3Checkbox = new JCheckBox("Item 3");
        regularShippingSpeedRadioButton = new JRadioButton("Regular Shipping");
        fastShippingSpeedRadioButton = new JRadioButton("Fast Shipping");
        summaryTextField = new JTextField("Cart is empty");
        clickButton = new JButton("Process Order");


        mainPanel.add(item1Checkbox);
        mainPanel.add(item2Checkbox);
        mainPanel.add(item3Checkbox);
        mainPanel.add(regularShippingSpeedRadioButton);
        mainPanel.add(fastShippingSpeedRadioButton);
        groupButton();
        mainPanel.add(summaryTextField);
        mainPanel.add(clickButton);


        clickButton.addActionListener(new OrderHandler());

    }
    
    /**
     *
	 * Listener Classes This is a shell that can be copied as many times as
	 * needed. You will need to change the class name for each class.
	 * 
	 */
    private class OrderHandler implements ActionListener {
        public void actionPerformed(ActionEvent event) {

            String result = "";
            String items = "";
            String shipping ="";


            // Tempted to put the GUI components on an array and run a loop here.
            if (item1Checkbox.isSelected()){
                items += "item 1 ";
            }
            if (item2Checkbox.isSelected()){
                items += "item 2 ";
            }
            if (item3Checkbox.isSelected()){
                items += "item 3";
            }

            if (regularShippingSpeedRadioButton.isSelected()){
                shipping += "regular";
            }
            if (fastShippingSpeedRadioButton.isSelected()){
                shipping += "fast";
            }



            if(item1Checkbox.isSelected() || item2Checkbox.isSelected() || item3Checkbox.isSelected()){
                // Cart is not empty
                if(regularShippingSpeedRadioButton.isSelected() || fastShippingSpeedRadioButton.isSelected()){
                    // All good
                    result = "You purchased these items at " + shipping + " shipping: " + items;
                } else {
                    result = "Please select a shipping option";
                }
            } else {
                result = "Please add item(s) to your cart";
            }

            summaryTextField.setText(result);
        }
    }


//    class ActionHandler implements ActionListener {
//        @Override
//        public void actionPerformed(ActionEvent event) {
//            JCheckBox checkbox = (JCheckBox) event.getSource();
//            if (checkbox == checkboxOne) {
//                System.out.println("Checkbox #1 is clicked");
//            } else if (checkbox == checkboxTwo) {
//                System.out.println("Checkbox #2 is clicked");
//            } else if (checkbox == checkboxThree) {
//                System.out.println("Checkbox #3 is clicked");
//            }
//        }
//    }



    public static void main(String args[]) {

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                // create an object of your class
                ProccessOrder frame = new ProccessOrder();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });

    }
}