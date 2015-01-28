import java.util.*;
//import java.util.Scanner;

/**
* This program mimics a blackjack game
*/
public class Blackjack1
{
    public static void main(String[] args)
    {
        int nextCard, playerTotal, dealerTotal;
        char anotherCard = 'y', playAgain 'y';
        Scanner input = new Scanner(System.in);

        while (playAgain != 'n')
        {
            //Start dealer with 10 and player with 0
            dealerTotal=10;
            playerTotal=0;
            //Deal 2 cards (1 to 10) to the player
            System.out.println("The dealer starts with a 10");
            System.out.print("YOur first cards: ");
            for(int i=0; i<2; i++)
            {
               Random card = new Random();
               playerNextCard = (card.nextInt(10)+1);
               playerTotal = playerTotal + nextCard;
               System.out.print(nextCard);
               if (i==0)
               {
                   System.out.print(", ");
               }               
            }   
            System.out.println("Total: " + playerTotal");         

            //Show sum of cards dealed
            //Ask if you user wants another card "hit? (y/n)"
            //Verify if sum of cards dealed is over 21
            //If sum of cards dealed is over 21 display message "Bust!!"
            //If sum of cards dealed is under 21 ask player if he wants another card
            //Ask player if he wants to play again      
        }
    }
}
