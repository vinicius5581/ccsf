import java.util.*;

/**
 Write a method called switchThem with the following method header.
 The method accepts two integer arrays as parameters.
 If the arrays are the same size, the method switches the contents of the arrays.
 If the arrays are different sizes, an error message is printed.

 public void switchThem(int[] first, int[] second)


 Hint: to test this method, invoke it from main.
 Print the contents of the two arrays from main before and after invoking the method.
 (You will need to add the "static" keyword to the method header to invoke it from main: public static void switchThem).
 */
public class Main {
    public static void main(String[] args) {
//        int[] lotteryTicket = {1,2,3,4,5};
//        int[] winningNumbers = {6,7,8,9,10};
//
//        System.out.println("1: " + Arrays.toString(lotteryTicket));
//        System.out.println("2: " + Arrays.toString(winningNumbers));
//
//        switchThem(winningNumbers, lotteryTicket);
//
//        System.out.println("1: " + Arrays.toString(lotteryTicket));
//        System.out.println("2: " + Arrays.toString(winningNumbers));

    }


    public void JframeMethods(){


        // Jframe // Heavy weight container - more influenced by OS
        //    content pane

        // Create frame -> Add things -> Make it visible

        // JPanel // Light weight container - less influenced by OS

        // JLabel //  Component


        // Jframe
           // content pane
              // JPanel

        //Jframe methods

        setTitle(String);
        setSize(int, int);
        getContentPane();

        // Jpanel methods
        setBackground(Color);
        add(component);

        // Jlabel methods
        setText(String);
        setForeground(Color);
        setIcon(ImageIcon);

        // Color
        Color.Red;
        Color.Blue;
        Color mycolor = new Color(5, 194,37);
    }

    public void switchThem(int[] first, int[] second){
        int temp;
        if(first.length == second.length){

            for(int i = 0; i < first.length; i ++){
                temp = first[0];
                first[0] = second[0];
                second[0] = temp;

            }

        } else {
            System.out.println("Error: The arrays should have the same size for this to work :p");
        }
    }

}
