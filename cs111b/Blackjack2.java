import java.util.*;
//import java.util.Scanner;

/**
 This program mimics a blackjack game
*/
public class Blackjack2
{    
    public static void main(String[] args)
    {
        int playerNextCard, playerTotal, dealerNextCard, dealerTotal, i;
        char anotherCard, playAgain = 'y',continueDealer;    
        Scanner input = new Scanner(System.in);
        Random card;

        while (playAgain != 'n')        
        { 
            
            playerTotal = 0;
            dealerTotal = 10;
            anotherCard = 'y';
 
            System.out.println("The dealer starts with a " + dealerTotal);            
            System.out.print("Your first cards: "); 
            for(i=0; i<2; i++)
            {
                card = new Random();
                playerNextCard = (card.nextInt(10)+1);
                playerTotal = playerTotal + playerNextCard;
                System.out.print(playerNextCard);
                if (i==0)
                {
                    System.out.print(", ");
                }
            }
            
            while (anotherCard != 'n')
            {
                System.out.print("\nPlayer's total: "+playerTotal);
                if (playerTotal < 21) 
                {
                    System.out.print("\nhit? (y/n)");
                    anotherCard = input.next().charAt(0);  
                    //}
                        // else
                        //{
                        //    System.out.print("\nBust!! You lose!");
                        //    anotherCard = 'n';
                        //URGENT ATTENTION NEEDED!!
                        //
                        //System.out.println();
                        //System.out.print("Play again? (y/n)");
                        //playAgain = input.next().charAt(0);
                    //}
                if (anotherCard == 'y')
                {
                card = new Random();
                playerNextCard = (card.nextInt(10)+1);
                playerTotal = playerTotal + playerNextCard;
                System.out.print("card: "+playerNextCard);                
                }
                else
                {
                    while (dealerTotal < 21)
                    {
                        System.out.print("Dealers has a "+dealerTotal);
                        System.out.print("(c to continue)"); 
                        continueDealer = input.next().charAt(0);
                        //if (continueDealer == 'c')
                   
                        card = new Random();
                        dealerNextCard = (card.nextInt(10)+1);
                        dealerTotal = dealerTotal + dealerNextCard;
                        System.out.println("Dealer gets a "+ dealerNextCard);
                        System.out.println("Dealer's Total: " + dealerTotal);
                        if ((dealerTotal > playerTotal) && (dealerTotal <= 21))
                        {
                           System.out.println("Dealer Win!!");
                        }
                        else if (dealerTotal > 21);
                        {
                           System.out.print("Push!");
                        }
                    }
                }
                }
            }
            
            System.out.println();
            System.out.print("Play again? (y/n)");
            playAgain = input.next().charAt(0);
        }
        //Start dealer with a 10
        //Deal 2 cards (1 to 10) to the player
        //Show sum of cards dealed
        //Ask if you user wants another card "hit? (y/n)"
        //Verify if sum of cards dealed is over 21
        //If sum of cards dealed is over 21 display message "Bust!!"
        //If sum of cards dealed is under 21 ask player if he wants another card
        //Ask player if he wants to play again      
    }
}
