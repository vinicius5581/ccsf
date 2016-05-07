import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myKeyboard = new Scanner(System.in);
        // Length
        String name = "Harry";
	    int n = name.length();
        System.out.println(n);

        //Concatenate
        String fName = "Harry";
        String lName = "Morgan";
        String fullName = fName + " " + lName;
        System.out.println(fullName);

        //Concatenate String with Integers result in Strings
        String jobTitle = "Agent";
        int employeeId = 7;
        String bond = jobTitle + employeeId;
        System.out.println(bond);


        //Formating
        double price = 10.20;
        System.out.printf("Price: %10.2f\n", price);

        //String test = myKeyboard.next();
//        int test1 =  myKeyboard.nextInt();;
//        int test2 =  myKeyboard.nextInt();;
//
//        System.out.println(test1);
//        System.out.println(test1*10000);
//        System.out.println(test2);
        System.out.println(myKeyboard.nextInt() * 10000 + myKeyboard.nextInt());

    }
}
