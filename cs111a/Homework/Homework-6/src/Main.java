/**
 * •••P6.25
**/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myKeyboard = new Scanner(System.in);
        Boolean isPlaying = true;
        while(isPlaying == true){


            ticTacToe();

            System.out.println("Do you wan't to play again? (Y/N): ");
            String answer = myKeyboard.nextLine();
            isPlaying = answer.equalsIgnoreCase("y");
        }

    }

    public static void ticTacToe(){
        System.out.println("* * * * * * * * *");
        System.out.println("Start Tic Tac Toe");
        System.out.println("* * * * * * * * *");
        char[] boardState = { ' ', ' ', ' ', ' ', ' ', ' ',' ', ' ', ' ' };
        char mark = 'X';
        boolean win = false;
        boolean tie = false;

        System.out.println("To play, players must take turns and choose a position from 1 to 9 as per diagram bellow.");
        System.out.println("To win, a player must align 3 of his markers either horizontally, vertically or diagonally. \n");
        System.out.println("Press 0 anytime to see the positions map. \n");
        printBoardPositions(boardState);

        System.out.println("Starting the game!! Good lucky!!");
        printBoard(boardState);

        do{
            mark  = updateMark(mark);
            int nextPosition = nextPosition(boardState);
            updateBoard(nextPosition, mark, boardState);

            win = isWinner(boardState);
            tie = isTied(boardState);

            printBoard(boardState);

        } while(win == false && tie == false);
    }

    public static void printBoardPositions(char board[]){
        int pos = 0;

        for(int line = 0; line < 3; line++){
            for(int col = 0; col < 3; col++){
                if(col == 0){
                    System.out.print(" " + (pos+1));
                } else if(col == 1){
                    System.out.print(" | " + (pos+1) + " | ");
                } else if(col == 2){
                    System.out.print((pos+1) + " ");
                }
                pos ++;
            }
            if(line != 2){
                System.out.print("\n");
                System.out.print("---+---+---");
                System.out.print("\n");
            } else {
                System.out.print("\n\n");
            }
        }
    }

    public static void printBoard(char board[]){
        int pos = 0;
        for(int line = 0; line < 3; line++){
            for(int col = 0; col < 3; col++){
                if(col == 0){
                    System.out.print(" " + board[pos]);
                } else if(col == 1){
                    System.out.print(" | " + board[pos] + " | ");
                } else if(col == 2){
                    System.out.print(board[pos] + " ");
                }
                pos ++;
            }
            if(line != 2){
                System.out.print("\n");
                System.out.print("---+---+---");
                System.out.print("\n");
            } else {
                System.out.print("\n\n");
            }
        }
    }

    public static int nextPosition(char board[]){
        Scanner myKeyboard = new Scanner(System.in);

        int playsCounter = 0;
        String player = " ";

        for(int i = 0; i < board.length; i++){
            if(board[i] != ' '){
                playsCounter ++;
            }
            player = (playsCounter % 2 == 0) ? "Player 1 (O)" : "Player 2 (X)" ;
        }

        System.out.print(player + " Choose a position: ");
        int pos = myKeyboard.nextInt();

        if ( pos == 0 ){
            printBoardPositions(board);
        } else while(pos < 0 || pos > 9 || board[pos - 1] != ' '){
            System.out.print("You entered a taken or invalid position. Please try again: ");
            pos = myKeyboard.nextInt();
        }
        return pos;
    }

    public static char updateMark(char mark){
        return (mark == 'X') ? 'O': 'X';
    }

    public static void updateBoard(int pos, char mark, char board[]){
        if ( pos != 0 ){
            board[ pos - 1 ] = mark;
        }
    }

    public static boolean isWinner(char board[]){
        boolean isWin = false;
        int p1Plays = 0;
        int p2Plays = 0;
        String winner = " ";
        if(
            (board[0] == board[1] && board[1] == board[2] && board[0] != ' ') ||
            (board[3] == board[4] && board[4] == board[5] && board[3] != ' ') ||
            (board[6] == board[7] && board[7] == board[8] && board[6] != ' ') ||
            (board[0] == board[3] && board[3] == board[6] && board[0] != ' ') ||
            (board[1] == board[4] && board[4] == board[7] && board[1] != ' ') ||
            (board[2] == board[5] && board[5] == board[8] && board[2] != ' ') ||
            (board[0] == board[4] && board[4] == board[8] && board[0] != ' ') ||
            (board[2] == board[4] && board[4] == board[6] && board[2] != ' ')
           ){
            isWin = true;
            for(int i = 0; i < board.length; i++){
                if (board[i] == 'O'){
                    p1Plays++;
                }
                if (board[i] == 'X'){
                    p2Plays++;
                }
            }
            winner = (p1Plays > p2Plays) ? "Player 1" : "Player 2";
            System.out.println("* ************* *");
            System.out.println("* "+ winner +" wins *");
            System.out.println("* ************* *");

        }

        return isWin;
    }

    public static boolean isTied(char board[]){
        int taken = 0;
        boolean isTied = false;


        for(int i = 0; i < board.length; i++){
            if(board[i] != ' '){
                taken++;
            }
        }
        if (taken == 9 && isWinner(board) == false){
            isTied = true;
            System.out.println("* ****** * \n");
            System.out.println("* Tied!! * \n");
            System.out.println("* ****** * \n");
        } else {
            isTied = false;
        }
        return isTied;
    }

}
