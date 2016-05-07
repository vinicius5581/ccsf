/**
 * Created by vinicius on 2/20/16.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double resultofsqr = Math.sqrt(9);
        System.out.println(resultofsqr);

        System.out.print("Enter a number:");
        int myNumber = keyboard.nextInt();

        System.out.print("You entered: ");
        System.out.println(myNumber);

        String car = "toyota";
        int n = car.length();
        System.out.print("Length of the string contained in the variable car("+ car +"): ");
        System.out.println(n);

        //Failed attempt to convert a string into an integer
        //System.out.println((int)car);


        System.out.print("Please enter your first and last name: ");
        //Next gets one word at the time
        String name1 = keyboard.next();
        String name2 = keyboard.next();
        System.out.println("name1:" + name1 + " name2:" + name2);



        System.out.println("Please enter your address: ");
        String address = keyboard.nextLine();
        System.out.println("Address is: " + address);



//        String mmmm = "1234";
//        int n = (int) mmmm;

        String x = "12324";
//        int n = (int) x;
//        System.out.println(x);
//        int newx = parseInt(x);
//        System.out.println(newx);

        String greeting = "Hello Harry";

        char start = greeting.charAt(0);
        System.out.println("Start: "+ start);

        //char second = greeting[2];
        //System.out.println("second: "+ second);

        String sub = greeting.substring(0,2);
        System.out.println("Sub: "+ sub);


        System.out.println("Enter in a digit 0-9");
        String input = keyboard.nextLine();
        char yx = input.charAt(0);
        System.out.println("You entered: " + yx);


        String str = "Sally";
        System.out.println(str);
        System.out.println(str.substring(0,5));
        System.out.println(str.substring(0, str.length()));
        System.out.println(str.substring(0));
        System.out.println(str.substring(str.length() -1));


    }
}
