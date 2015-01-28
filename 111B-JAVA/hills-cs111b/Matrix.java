import java.util.Scanner;

public class Matrix
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int value = input.nextInt();
       

        for(int i=0; i<value; i++)
        {
       
            for(int m=0; m<i; m++)
            {
             
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
