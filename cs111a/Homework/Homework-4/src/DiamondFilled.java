/**
 * Created by Vinicius Santana on 4/21/16.
 *
 * //P4.21 (page 192)[10 pts.]
 * Write a program that reads an integer and displays, using asterisks, a filled diamond
 * of the given side length. For example, if the side length is 4, the program should display

     *
    ***
   *****
  *******
   *****
    ***
     *

 */

import java.util.Scanner;

public class DiamondFilled {

    public static void printChars(int count, char c){
        for(int i = 0; i < count; i++ ){
            System.out.print(c);
        }
    }

    public static void main(String[] args) {
        Scanner myKeyboard = new Scanner(System.in);

        System.out.print("Please enter the diamond side size: ");

        int side  = myKeyboard.nextInt();
        int length = 2 * side - 1;
        int whitespaces = side - 1;
        int stars = 1;


        for (int line = 0; line < length; line++){

            printChars(whitespaces, ' ');
            printChars(stars, '*');

            if (line < side - 1) {
                whitespaces = whitespaces - 1;
                stars = stars + 2;
            } else {
                whitespaces = whitespaces + 1;
                stars = stars - 2;
            }
            System.out.print("\n");
        }
    }

}