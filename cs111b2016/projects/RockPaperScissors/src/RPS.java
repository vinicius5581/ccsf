import java.util.*;



public class RPS {

    public final int ROCK = 1;
    public final int PAPER = 2;
    public final int SCISSORS = 3;

    private final char USER_WIN = 'u';
    private final char COMPUTER_WIN = 'c';
    private final char TIE = 't';

    private final String WIN_MSG = "You win!";
    private final String LOSE_MSG = "You lose!";
    private final String TIE_MSG = "It's a tie.";

    private final String PAPER_WINS_ROCK = "Paper bits Rock.  ";
    private final String SCISSORS_WIN_PAPER = "Scissors bits Paper.  ";
    private final String ROCK_WINS_SCISSORS = "Rock bits Scissors.  ";
    private final String SAME_MOVES = "Draw!!";

    private int countNumberComputerWins;
    private int countNumberUserWins;
    private int countNumberTies;

    private char winner;
    private String resultMessage;
    private String outcomeMessage;
    private double betAmount;
    private double balance;
    private boolean willingToBet;

    public RPS(double betAmount) {
        this.countNumberComputerWins = 0;
        this.countNumberUserWins = 0;
        this.countNumberTies = 0;
        this.winner = ' ';
        this.resultMessage = "";
        this.betAmount = betAmount;
        this.willingToBet = (betAmount > 0.0) ? true : false;
        this.balance = 0.0;
    }

    // game result
    private void displayResultMsg(char result) {
        switch( result) {
            case 'u': this.resultMessage = WIN_MSG;
                break;
            case 'c': this.resultMessage = LOSE_MSG;
                break;
            case 't': this.resultMessage = TIE_MSG;
                break;
        }
    }


    public int ComputerPlay(){
        Random random = new Random();
        int play = random.nextInt(2) + 1;
        return play;
    }


    //update the number of wins, losses, and ties
    private void updateWinsAndTies( char winner ) {
        switch( winner ) {
            case USER_WIN: countNumberUserWins++; break;
            case COMPUTER_WIN: countNumberComputerWins++; break;
            case TIE: countNumberTies++; break;
        }
    }

    //The writeOutcomeMessage() method determines the outcome message that
    //describes how the win/loss took place( ex: Rock smashes Scissors)
    private void writeOutcomeMessage( int computerMove, int userMove ) {
        String outcomeMessage = "";
        final int ROCK_AND_PAPER = 3;
        final int SCISSORS_AND_ROCK = 4;
        final int SCISSORS_AND_PAPER = 5;

        int checkSum = computerMove + userMove;

        if ( computerMove == userMove ) {
            outcomeMessage = SAME_MOVES;
        } else {
            switch( checkSum ) {
                case ROCK_AND_PAPER: outcomeMessage = PAPER_WINS_ROCK;
                    break;
                case SCISSORS_AND_ROCK: outcomeMessage = ROCK_WINS_SCISSORS;
                    break;
                case SCISSORS_AND_PAPER: outcomeMessage = SCISSORS_WIN_PAPER;
                    break;
            }
        }

        this.outcomeMessage = outcomeMessage + "  " + resultMessage;
    }


    public char findWinner( int computerMove, int userMove) {
        char result = ' ';

        if ( computerMove == userMove ) {
            result = 't';
        } else if ( (userMove - computerMove + 3) % 3 == 1 ) {
            result = 'u';
        } else {
            result = 'c';
        }

        //keep track of score
        updateWinsAndTies( result );

        //write the message that indicates the result of the play
        displayResultMsg( result );

        //update the balance determined by the bet amount
        updateBalance( result );

        //write the outcome message to the instance data
        writeOutcomeMessage( computerMove, userMove);

        return result;
    }

    //update the user's balance given the result of each play
    private void updateBalance( char result ) {
        switch( result ) {
            case USER_WIN: balance += betAmount; break;
            case COMPUTER_WIN: balance -= betAmount; break;
            case TIE: break;
        }
    }



    public int getCWins() {
        return countNumberComputerWins;
    }

    public int getTies() {
        return countNumberTies;
    }

    public int getUWins() {
        return countNumberUserWins;
    }

    public String getResultMessage() {
        return resultMessage;
    }

    public char getWinner() {
        return winner;
    }

    public String getOutcomeMessage() {
        return outcomeMessage;
    }

    public double getBetAmount() {
        return betAmount;
    }

    //This method is for future use to reset the bet amount
    public void setBetAmount(double betAmount) {
        this.betAmount = betAmount;
    }

    public double getBalance() {
        return this.balance;
    }

    public boolean isWillingToBet() {
        return this.willingToBet;
    }
}