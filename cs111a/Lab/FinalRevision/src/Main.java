import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Variables declaration - Must be done before assignment
        byte myByte; // 1
        short myShort; // 12
        int myInt; // 123 most used
        long myLong; // 1234
        float myFloat; //100.0
        double myDouble; // 100.0
        String myString;  // "Anything here"
        char myChar;  // 'a'
        boolean myBoolean;  // True

        // Variable Assignment  ( = assignment operation )
        myInt = 2;

        // Variable instantiation - Declaration & Assignment
        int myInt2 = 3;

        // Variable reassignment
        myInt = 3;
        myInt2 = 5;

        // Constants

        final int MY_INT_CONSTANT;
        MY_INT_CONSTANT = 10;

        final String MY_STRING_CONSTANT = "Studing Java";

        // Expressions
        int myInt3 = 2 + 2;

        String myString2 = "something" + myInt3 + "\nelse";

        double myDouble2 = 10.23;
        int myInt4 = 2;

        double y = myDouble2 * myInt4;
        double z = myDouble2 % myInt4;
        double w = myDouble2 + myInt4;
        double v = myInt4 / myDouble2;

        System.out.println(myString2); // something4

        // Operator Precedence
        boolean myBoolean2 = 10 * 7 > myInt3 || 2 + 7 < 5 + 2 && 3 != 2;

        // 70 > myInt3 || 2 + 7 < 5 - 2 && 3 != 2;
        // 10 > myInt3 || 9 < 3 && 3 != 2
        // true || false && true
        // true || false
        // true

        System.out.println(myBoolean2);  // true


        // Cast - Convert a variable from a primitive type to another primitive type
        double balance = 100.23;
        int dollars = (int) balance;

        System.out.println(balance); //100.23
        System.out.println(dollars); //100


        // Instantiating a variable of type Scanner
        Scanner in = new Scanner(System.in);

        System.out.println("Type an integer:");
        int myInt5 = in.nextInt();
        System.out.println("Type a String:");
        String myString3 = in.next();

        System.out.println("myInt5: " + myInt5);
        System.out.println("myString3: " + myString3);

        // if / else if / else
        if(myInt2 > 7 && true){

        } else if ( 10 >= myInt3){

        } else{

        }

        // switch
        int myInt6 = 2;
        String myString5;

        switch (myInt6){
            case 1 : myString5 = "hello";
                break;
            case 2 : myString5 = "bye";
                break;
            case 3 : myString5 = "Sup";
                break;
            default : myString5 = "What";
                break;
        }

        // Loops
        int ct = 0;
        boolean condition = ct < 10;

        while ( condition ){
            // statements
            ct++;
        }

        // do / while
        do{

        } while (condition);

        // for loop
        for(int contador = 0; contador < 10; contador++){

        }
    }
}
