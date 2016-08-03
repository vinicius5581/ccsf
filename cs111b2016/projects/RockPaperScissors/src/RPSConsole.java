import java.text.NumberFormat;
import java.util.Scanner;

public class RPSConsole {
    private final static String ROCK = "ROCK";
    private final static String PAPER = "PAPER";
    private final static String SCISSORS = "SCISSORS";

    private final static String PROMPT_MESSAGES =
            "\n\nTo play, enter: \n" +
                    " 'r' to play ROCK \n" +
                    " 'p' to play PAPER \n" +
                    " 's' to play SCISSORS \n" +
                    " or any other character to quit.";
    private static RPS rps;

    private static String getMoveString(int move) {
        String strMove = "";
        if( move == rps.ROCK ) strMove = ROCK;
        else if ( move == rps.PAPER ) strMove = PAPER;
        else strMove = SCISSORS;
        return strMove;
    }

    private static char getUserChoice(RPS rps, Scanner scanner) {
        System.out.println(PROMPT_MESSAGES);
        String userInput = scanner.nextLine();
        char userChoice = userInput.charAt(0);

        if( !(userChoice == 'r' ||userChoice == 'p' ||
                userChoice == 's' )) {
            System.out.println("Thanks for playing!");
            System.exit(0);
        }
        return userChoice;
    }


    private static int getIntegerUserMove( char userChoice ) {
        int userMove = 0;
        switch( userChoice){
            case 'r': userMove = rps.ROCK;
                break;
            case 'p': userMove = rps.PAPER;
                break;
            case 's': userMove = rps.SCISSORS;
                break;
        }
        return userMove;
    }


    private static void displayStatsAndStatus (int intComputerMove, int intUserMove) {
        System.out.println("You played " + getMoveString( intUserMove ));
        System.out.println("Computer played " + getMoveString( intComputerMove));
        System.out.println( rps.getOutcomeMessage());
        System.out.print("\nWins: " + rps.getUWins());
        System.out.print("  Losses: " + rps.getCWins());
        System.out.print("  Ties: " + rps.getTies());
        if( rps.isWillingToBet() ) {
            System.out.print(" Balance: " + formatBalance(rps.getBalance()));
        }
    }

    private static int getIntegerComputerMove() {
        return rps.ComputerPlay();
    }

    private static String formatBalance( double balance ) {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        return formatter.format(balance);
    }

    private static double getBetAmount(Scanner scanner ){
        System.out.println("Enter the bet amount (or hit 'enter to play just for fun)");
        String betInput;
        boolean validBetAmount = false;
        double betAmount = 0.0;

        while( ! validBetAmount ) {
            betInput = scanner.nextLine();
            if ( ! betInput.isEmpty() ) {
                if ( betInput.charAt(0) == '$' ) {
                    betInput = betInput.substring( 1, betInput.length());
                }
            }
            if ( betInput.isEmpty() ) {
                betInput = "0.0";
                //Skip validation when the user enters nothing
                validBetAmount = true;
            }

            try{
                betAmount = Double.parseDouble( betInput );
                if ( betAmount < 0 ) {
                    throw new NegativeNumberException("error");
                }
                validBetAmount = true;
            } catch( NumberFormatException nfe ) {
                System.err.println("Enter the valid bet amount!");
            } catch( NegativeNumberException nne ) {
                System.err.println("The amount cannot be negative");
            }
        }
        return betAmount;
    }


    private static void playGame( Scanner scanner ) {
        while( true ) {
            char userChoice = getUserChoice( rps, scanner );
            int intUserMove = getIntegerUserMove( userChoice );
            int intComputerMove = getIntegerComputerMove( );
            rps.findWinner( intComputerMove , intUserMove);
            displayStatsAndStatus( intComputerMove, intUserMove);
        }
    }

    public static void main(String[] args){
        System.out.println("Welcome to Rock, Paper, Scissors!");
        Scanner scanner = new Scanner(System.in);
        double betAmount = getBetAmount( scanner );
        rps = new RPS( betAmount );
        playGame( scanner );
    }

    public static class NegativeNumberException extends Exception {
        public NegativeNumberException(String message) {
            super(message);
        }
    }
}