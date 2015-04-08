import java.util.*;

/**
 * 
 * @author Vinicius Santana
 * This program will try to guess the number that you input
 * based on hints given by the user.
 * 
 */
public class NumberGuesser {
	public static void main(String[] args) {		
		do {
			playOneGame();
		} while (shouldPlayAgain());
		//System.out.println(playerNumber());
		//System.out.println(getUserResponseToGuess(20));
		//System.out.println(getMidpoint(20,50));
		//System.out.println(getRandomMidpoint(20,50));
		//System.out.println(shouldPlayAgain());
		
	}
	
	/**
	 * Play one round of number guesser
	 */
	public static void playOneGame(){
		int playerNumber = playerNumber();			
		int low = 0;
		int high = 100;		
		int compGuess = 1000;	
		char userResponse = 'm'; 
		
		while (userResponse != 'c')		
		{	
			compGuess = getMidpoint(low,high);
			userResponse = getUserResponseToGuess(compGuess);	
			if (userResponse == 'h')
			{
				low = compGuess;
				compGuess = getMidpoint(low,high);
			}
			else
			{
				high = compGuess; 
				compGuess = getMidpoint(low,high);
			}
			if (compGuess == playerNumber)
			{
				System.out.println("Your number is " + compGuess);
				break;
			}
		}		
	}
		
	/**
	 * Ask the user for a random number.
	 * @return
	 */
	public static int playerNumber(){
		int playerNumber;		
		Scanner keyboard = new Scanner(System.in); 
		System.out.println("Guess a number between 1 and 100");
		playerNumber = keyboard.nextInt();
		return playerNumber;
	}
	
	
	/**
	 * This function should accept the value guessed by the computer
	 * and ask the user if its h(higher), l(lower) or c(correct).
	 * @param guess
	 * @return
	 */
	public static char getUserResponseToGuess(int guess){
		Scanner input = new Scanner(System.in);		
		char userResponse = 'x';			
		System.out.print("Is it " + guess + "? (h/l/c): ");
		while((userResponse != 'h' && userResponse != 'l' && userResponse != 'c')){				
			userResponse = input.next().charAt(0);
			if (userResponse == 'h' || userResponse == 'l' || userResponse =='c'){
				break;							
			}
			else{
				System.out.print("Ops!!! Please use h for higher, l for lower and c if " + guess + " is your number. ");
			}
		}
		return userResponse;	
	}
	
	/**
	 * This function should accept two integers 
	 * and it should return the midpoint of the two integers.
	 * @param low
	 * @param high
	 */
	public static int getMidpoint(int low, int high){
		int midPoint = (low + high)/2;
		return midPoint;
	}
	
	/**
	 * This function should accept two arguments
	 * and it should return a random number in between the low and high arguments. 
	 * @param low
	 * @param high
	 */
	public static int getRandomMidpoint(int low, int high){
		Random rand = new Random();
		int randomNum = rand.nextInt((high - low) + 1) + low;
	    return randomNum;
	}
	
	/**
	 * This function should ask the user if he/she wants to play another game
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