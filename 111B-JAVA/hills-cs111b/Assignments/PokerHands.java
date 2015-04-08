/*Osmar Santana - Vinny*/
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;


public class PokerHands {
	/**
	 * This program reads 5 inputs from the user
	 * and test them as cards to see what type
	 * of poker hand you got.
	 * @param args
	 */
	public static void main(String[] args){
		do {
			playOneGame();
		} while (shouldPlayAgain());		
	}
	public static void playOneGame(){
		//int[] hand = handGenerator();
		int[] hand = handInput();
		if (containsFullHouse(hand)){
			System.out.println("Full house");
		}
		else if(containsThreeOfaKind(hand)){
			System.out.println("Three of a Kind");
		}
		else if(containsTwoPair(hand)){
			System.out.println("Two Pairs");
		}
		else if(containsPair(hand)){
			System.out.println("Pair");
		}
		else if(containsStraight(hand)){
			System.out.println("Straight");
		}else if(containsFourOfaKind(hand)){
			System.out.println("Four of a Kind");
		}else{
			System.out.println("High Card");
		}
	};	
	
	/**
	 * This method generates an array
	 * with 5 keys containing
	 * values from 2 to 9
	 * @return
	 */
	public static int[] handGenerator(){
		Random card;
	    int[] hand = new int[5];
	    System.out.print("hand: ");
	    for(int i=0; i < 5; i++){
	    	card = new Random();
            hand[i] = (card.nextInt(8)+2);	    	
	    	System.out.print(hand[i]+" ");
	    }
	    System.out.print("\n");
	    return hand;		
	}	
	
	/**
	 * This method asks the user to input
	 * 5 values from 2 to 9. 
	 * @return
	 */
	public static int[] handInput(){
		Scanner input = new Scanner(System.in);
	    int[] hand = new int[5];
	    System.out.println("Enter five numeric cards, no face cards. Use 2-9.");
	    for(int i=0;i<5;i++){	    	
	    	System.out.print("Card "+(i+1)+": ");
	    	hand[i] = input.nextInt();
	    }	
		return hand;
	}
	
	/**
	 * This method gets a hand (array of 5)
	 * and return an array listing how 
	 * many time a card Rank appeared
	 * @param hand
	 * @return
	 */
	
	public static int[] handCardsCounter(int[] hand){		
		int rank;
		int[] cardRankCount = {0,0,0,0,0,0,0,0,0,0};
		boolean[] cardChecked = {false,false,false,false,false};
		for (int m = 0; m < hand.length; m++){
			rank = hand[m];
			if (cardRankCount[rank] == 0){
				cardRankCount[rank] = 1;
			}
			for (int n = m+1;  n < hand.length; n++){		
				if (hand[m] == hand[n] && cardChecked[m] != true){	
						cardRankCount[rank] +=1;
						cardChecked[m] = true; 
				}
			}
		}	
		return cardRankCount;
	}

	/**
	 * This method prints out an array
	 * It was made to test the handCardCounter
	 * @param arrayToPrint
	 */

	public static void printArray(int[] arrayToPrint){
		for (int m = 0; m < arrayToPrint.length; m++){
			if (arrayToPrint[m]!=0){
				System.out.println("Card rank: "+m+" Repetitions: "+arrayToPrint[m]);
			}
		}
	}
	
	/**
	 * This method checks if a hand has 
	 * at least one pair
	 * @param hand
	 * @return
	 */
	
	public static boolean  containsPair(int[] hand){
		int[] ranksCount = handCardsCounter(hand);
		for (int i = 0; i < ranksCount.length; i++){
			if (ranksCount[i] == 2){
				return true;
			}
		}
		return false;
	}
	
	/**
	 * This method checks if a hand
	 * has two pairs
	 * @param hand
	 * @return
	 */
	public static boolean  containsTwoPair(int[] hand){
		int[] ranksCount = handCardsCounter(hand);
		int pairCounter = 0;
		for (int i = 0; i < ranksCount.length; i++){
			if (ranksCount[i] == 2){
				pairCounter += 1;
			}
		}
		if (pairCounter == 2){
			return true;
		}
		else{
			return false;
		}
	}
	
	/**
	 * This method checks if a hand has
	 * three cards of the same rank.
	 * @param hand
	 * @return
	 */
	public static boolean  containsThreeOfaKind(int[] hand){
		int[] ranksCount = handCardsCounter(hand);
		int pairCounter = 0;
		for (int i = 0; i < ranksCount.length; i++){
			if (ranksCount[i] == 3){			
				return true;				
			}
		}
		return false;
	}
	
	/**
	 * This methods checks if a hand
	 * has a straight (5 sequencial cards).
	 * @param hand
	 * @return
	 */
	public static boolean  containsStraight(int[] hand){ //2,3,4,5,6
		Arrays.sort(hand);
		for(int i=0;i < (hand.length - 1);i++){
			if ((hand[i+1] - hand[i]) != 1){
				return false;
			}
		}
		return true;
	}
	
	/**
	 * This method checks if a hand has a full house
	 * (A pair + Three of a kind)
	 * @param hand
	 * @return
	 */
	public static boolean  containsFullHouse(int[] hand){
		if (containsPair(hand) && containsThreeOfaKind(hand)){			
			return true;				
		}
		return false;
	}
	
	/**
	 * This method checks if a hand has
	 * 4 cards of the same rank
	 * @param hand
	 * @return
	 */
	public static boolean  containsFourOfaKind(int[] hand){
		int[] ranksCount = handCardsCounter(hand);
		for (int i = 0; i < ranksCount.length; i++){
			if (ranksCount[i] == 4){
				return true;				
			}
		}
		return false;
	}
	
	/**
	 * This method asks the user if he/she wants
	 * to play again and expect y for yes 
	 * and n for no.
	 * @return
	 */
	public static boolean shouldPlayAgain(){
		Scanner input = new Scanner(System.in); 
		char playAgain = 'x';
		int count = 0;
		boolean result = false;
		
        while (playAgain != 'y' && playAgain != 'n')
        {        	
        	if (count < 1)
        	{
        		System.out.print("Play again? (y/n) ");
        		count += 1;
        	}
        	else
        	{
        		System.out.println("Please type 'y' to play another game or 'n' to exit!");
        	}
            playAgain = input.next().charAt(0);
        }
        if(playAgain == 'y')
        {
        	result = true;
        }
        else if (playAgain == 'f')
        {
        	result = false;
        }
        return result;
    }	

}



