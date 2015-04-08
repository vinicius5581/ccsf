import java.util.*;

public class ScannerTest
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        //Int
        System.out.print("Enter a value: ");
        int x = input.nextInt();
        input.skip("\n");
        System.out.println("You entered:" + x);

        //String
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Hello " + name + "!");
      

    }
}
