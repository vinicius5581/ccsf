// Homework-3
// P3.28 (page 130)[10pts.]
import java.util.Scanner;

public class IsYearLeap {

   public static void main(String[] args) {
       Scanner myKeyboard = new Scanner(System.in);
       System.out.println("P3.28 (page 130)[10pts.]");
       int year;
       System.out.print("Please enter the year that you want to check if it is a leap year: ");
       year = myKeyboard.nextInt();
       if (year % 4 == 0 && (!(year % 100 == 0) || year % 400 == 0)) {
           System.out.println("The year " + year + " IS a leap year");
       } else {
           System.out.println("The year " + year + " ISN'T a leap year");
       }
   }
}
