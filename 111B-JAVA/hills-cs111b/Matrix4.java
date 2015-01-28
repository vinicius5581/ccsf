import java.util.Scanner;

public class Matrix4
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int value = input.nextInt();
        

        for(int i=0; i<value; i++)
        {
       
            for(int s=0; s<(value-(i+1));s++)
            {
                System.out.print("  ");
            }                
            for(int m=0; m<(i-(m+1)); m++)
            {
               System.out.print("* ");
            }
            System.out.println();
        }
    }
}
