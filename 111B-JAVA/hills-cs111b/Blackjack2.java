import java.util.*;
//import java.util.Scanner;

/**
* This program is a blackjack game against a virtual dealer.
*/
public class Blackjack2
{    
    public static void main(String[] args)
    {
        int playerNextCard,    //Player current dealed card
            playerTotal,       //Sum of player's card
            dealerNextCard,    //Dealer current dealed card
            dealerTotal,       //Sum of dealer's card
            i;                 //Loop counter
        char anotherCard,      //Flag to check if player wants another card
             playAgain = 'y',  //Flag to check if player wants to play a new game   
             continueDealer = ' ';   //Variable to check if user is ready to see next dealer card 
    
        Scanner input = new Scanner(System.in);  
        Random card;
        
        /**
        * 
        */
        while (playAgain == 'y')   
        { 
            //reset variabales
            playerTotal = 0;    
            dealerTotal = 10;   
            anotherCard = 'y';  
 
            System.out.println("The dealer starts with a " + dealerTotal);            
            System.out.print("Your first cards: "); 

            //Generate and print two random cards (numbers from 1 to 10)
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
                if (playerTotal <= 21) 
                {

                    if (playerTotal != 21)
                    {
                    System.out.print("\nhit? (y/n)");
                    anotherCard = input.next().charAt(0);                  
                    }
                    /**
                    * If player wants a new card 'y'
                    * generate and print a new card 
                    * and add the card to the player Total
                    */
                    if (anotherCard == 'y' && playerTotal != 21)
                    {
                        card = new Random();
                        playerNextCard = (card.nextInt(10)+1);
                        playerTotal = playerTotal + playerNextCard;
                        System.out.print("card: "+playerNextCard);                
                    }
                    else                            
                    {  

                        /**
                        * If players says no to a new card with a total under or equal 21
                        * The dealer should start playing
                        */
                        System.out.println("\nDealers has a "+dealerTotal);
                        while (dealerTotal <= 17)
                        {                                                                    
                            if (continueDealer != 'c')
                            {                                                                                      
                                System.out.println("(c to continue)"); 
                                continueDealer = input.next().charAt(0);
                            }
                            else
                            {                                    
                                card = new Random();
                                dealerNextCard = (card.nextInt(10)+1);
                                dealerTotal = dealerTotal + dealerNextCard;
                                System.out.println("Dealer gets a "+ dealerNextCard);
                                System.out.println("Dealer's Total: " + dealerTotal);
                            }
                            if ((dealerTotal > playerTotal) && (dealerTotal <= 21))
                            {                                       
                               System.out.println("Dealer Win!!");
                               anotherCard = 'n'; 
                               break;
                            }
                            if (dealerTotal > 21)
                            {                                                                  
                               System.out.println("Push! You win!!");     
                               anotherCard = 'n';                               
                               break;
                            }
                        }
       
                    }
                }    
                else
                {
                    System.out.print("\nBust!! You lose!\n");
                    anotherCard = 'n';                                    
                }            
                           
            }
            System.out.println("**********");
            System.out.println("Play again? (y/n)");
            playAgain = input.next().charAt(0);
            System.out.println("**********");
        }            
    }
}
