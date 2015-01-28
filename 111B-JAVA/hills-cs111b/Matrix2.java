import java.util.Scanner;

public class Matrix2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int value = input.nextInt();
       

        for(int i=0; i<value; i++)
        {
       
            for(int m=0; m<(i+1); m++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
