import java.util.*;
//import java.util.Scanner;

/**
* This program mimics a blackjack game
*/
public class Blackjack
{
    public static void main(String[] args)
    {
       int i;
       int nextCard;
       int  cardSum;
       int playerTotal;
       char anotherCard = 'y';
       char playAgain = 'y';
       int[]card;
       Scanner input = new Scanner(System.in);
       card = new int[10];

       //Condition to start over the game      
       while (playAgain != 'n')
       {
           cardSum=0;
           System.out.print("First cards: ");
           for(i=0; i<2; i++)
           {
               Random random = new Random();
               nextCard = (random.nextInt(10)+1);
               cardSum = cardSum + nextCard;
               System.out.print(nextCard);
               if (i==0)
               {
                   System.out.print(", ");
               }
           }
           System.out.println();
           System.out.println("Total: " + cardSum);
           while (anotherCard != 'n')
           {
               if (cardSum > 21)
               {
                   System.out.print("You lose!!");
               }
               else
               {
                   System.out.println("Do you want another card? (y/n)");
                   anotherCard = input.next().charAt(0);
               }
           }
           //System.out.println("First cards: " + card[0] + " " + card[1]);      
           //System.out.println("Total: " + (cardSum));
           /*
           while (anotherCard != 'n')
           {   
               i = 1;
               i++;
               //card[i] = (random.nextInt(10)+1);
               System.out.println(card[i]);
               System.out.println();
               System.out.print("Another Card? (y/n)");
               anotherCard = input.next().charAt(0);
           }
           */
           System.out.println();
           System.out.print("Play Again? (y/n)");
           playAgain = input.next().charAt(0);
       }
       //System.out.println("Cards: " +  card[0] + " " + card[1]
       //                   +"\nTotal: " + card[0]+card[1+card[1]]);
       //ask if user wants another card
    }
}
               
