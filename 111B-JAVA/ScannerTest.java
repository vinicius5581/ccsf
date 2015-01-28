import java.util.Scanner;

class ScannerTest
{
    public static void main(String[] args)
    {
        int myInteger;
        byte myByte;
        double myDouble;
        float myFloat;
        String myString;
        long myLong;
        short myShort;        
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter an integer value: ");
        myInteger = keyboard.nextInt();
        System.out.println(myInteger);

        System.out.print("Enter a byte value: ");
        myByte = keyboard.nextByte();
        System.out.println(myByte);

        System.out.print("Enter a double value: ");
        myDouble = keyboard.nextDouble();
        System.out.println(myDouble);
    }
}
