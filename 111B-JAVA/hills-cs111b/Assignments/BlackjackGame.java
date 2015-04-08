import java.util.*;
//import java.util.Scanner;

/**
* This program is a blackjack game against a virtual dealer.
*/
public class BlackjackGame
{    
    public static void main(String[] args)
    {
        int playerNextCard,          //Player current dealed card
            playerTotal,             //Sum of player's card
            dealerNextCard,          //Dealer current dealed card
            dealerTotal,             //Sum of dealer's card            
            stars = 20,                   //Number of stars on line rules
            i;                       //Loop counter       
        char anotherCard,            //Flag to check if player wants another card
             playAgain = 'y',        //Flag to check if player wants to play a new game   
             continueDealer = ' ';   //Variable to check if user is ready to see next dealer card 
    
        Scanner input = new Scanner(System.in);  
        Random card;
        
        

        while (playAgain == 'y')   
        { 
            /**
            *  Start New Game
            *  reset variabales
            */
            playerTotal = 0;    
            dealerTotal = 10;   
            anotherCard = 'y';  
 
            System.out.println("The dealer starts with a " + dealerTotal);            
            System.out.print("Your first cards: "); 
             /**
             * Deal 2 random cards 
             * to the player
             */            
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
                System.out.print("\nPlayer's total: " + playerTotal);                
                if (playerTotal <= 21) 
                {
                    if (playerTotal != 21)
                    {
                        System.out.print("\nhit? (y/n)");
                        anotherCard = input.next().charAt(0);                  
                    }
                    /**
                    * If player wants a new card 'y'
                    * and if the player Total isn't 21
                    * Deal a new card 
                    * and add the card to the player Total
                    */
                    if (anotherCard == 'y' && playerTotal != 21)
                    {
                        card = new Random();
                        playerNextCard = (card.nextInt(10)+1);
                        playerTotal = playerTotal + playerNextCard;
                        System.out.print("card: "+playerNextCard);                
                    }
                    else if (anotherCard == 'n')                                            
                    {  
                        /**
                        * If the player says no to a new card  'n'
                        * and Player total is under or equal 21
                        * The dealer should start playing
                        */
                        System.out.println("\nDealers has a "+dealerTotal);
                        while (dealerTotal <= 17)
                        {                                                                                                                                                    
                                System.out.println("(c to continue)"); 
                                continueDealer = input.next().charAt(0);

                            if (continueDealer == 'c')                                                        
                            {                                    
                                card = new Random();
                                dealerNextCard = (card.nextInt(10)+1);
                                dealerTotal = dealerTotal + dealerNextCard;
                                System.out.println("Dealer gets a "+ dealerNextCard);
                                System.out.println("Dealer's Total: " + dealerTotal);
                            }
                            else 
                            {
                                 System.out.println("Please type 'c' on your keyboard to continue");
                            }   
                            /**
                            * Dealer Wins when 
                            * dealer's Total is higher than playerTotal
                            * and dealer's Total is under or equal to 21
                            */ 
                            if ((dealerTotal > playerTotal) && (dealerTotal <= 21))
                            {                                       
                               System.out.println("Dealer Win!!");
                               anotherCard = 'n'; 
                               break;
                            }
                            /**
                            * Player Wins when 
                            * dealer's Total is higher than 21                            
                            */ 
                            if (dealerTotal > 21)
                            {                                                                  
                               System.out.println("Push! You win!!");     
                               anotherCard = 'n';                               
                               break;
                            }
                        }
                        /**
                        * If dealer if over 17 
                        * but bellow Player's Total
                        */ 
                        if (dealerTotal<playerTotal)
                        {
                            System.out.println("Push! You win!!");
                            break;
                        }
                        //Draw
                        /**
                        * If dealer's Total is higher than 17 
                        * and dealer's Total is equal to player's Total
                        */ 
                        if (dealerTotal > 17 && dealerTotal == playerTotal)
                        {
                            System.out.println("It's a Draw!");
                            break;
                        }       
                    }
                    else
                    {
                        System.out.print("Please type 'y' or 'n' on your keyboard");
                    }
                }  
                /**
                * If player's total exced 21 
                * players loose
                */   
                else
                {
                    System.out.print("\nBust!! You lose!\n");
                    anotherCard = 'n';                                    
                }                                 
            }
            System.out.println("\n*******[][][][]*******\n");
            System.out.print("Play again? (y/n) ");
            playAgain = input.next().charAt(0);
            System.out.println("\n**********************\n");
        }            
    }
}
