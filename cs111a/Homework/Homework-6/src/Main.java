/**
 * •••P6.25
 * Write a program that plays tic-tac-toe.
 * The tic-tac-toe game is played on a 3x3 grid as in the photo at right.
 * The game is played by two players, who take turns.
 * The first player marks moves with a circle, the second with a cross.
 * The player who has formed a horizontal, vertical,
 * or diagonal sequence of three marks wins.
 * Your program should draw the game board,
 * ask the user for the coordinates of the next mark,
 * change the players after every successful move,
 * and pronounce the winner.


 Here are additional instructions you must follow to receive full credit:
 (1) Do not use two-dimensional arrays of any kind.
 You must use a single-dimensional array of chars.

 (2) The board positions must be:

 1 | 2 | 3
 ---+---+---
 4 | 5 | 6
 ---+---+---
 7 | 8 | 9

 (3) In addition to the main() method you should have these methods
 with the following headers:

 (a) void printBoard(char board[])

 (b) int nextPosition(char board[])

 // must validate that a correct position was entered
 // and that the board position is not already occupied

 (c) char updateMark(char mark)

 (d) void updateBoard(int pos, char mark, char board[])

 (e) boolean isWinner(char board[])

 Here's a possible algorithm:
 initialize the board
 initialize the mark
 print the board
 do {
 get valid position
 update board
 print the board
 update the mark
 determine if there is a winner
 } while (there is no winner);
 */

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
        String player = "Player 1";

        for(int i = 0; i < board.length; i++){
            if(board[i] != ' '){
                playsCounter ++;
            }
            player = (playsCounter % 2 == 0) ? "Player 1 (O)" : "Player 2 (X)" ;
        }

        System.out.print(player + " Choose a position: ");
        int pos = myKeyboard.nextInt();

        while(pos < 0 || pos > 9 || board[pos - 1] != ' '){
            System.out.print("You entered a taken or invalid position. Please try again: ");
            pos = myKeyboard.nextInt();
        }
        return pos;
    }

    public static char updateMark(char mark){
        return (mark == 'X') ? 'O': 'X';
    }

    public static void updateBoard(int pos, char mark, char board[]){
        board[ pos - 1 ] = mark;
    }

    public static boolean isWinner(char board[]){
        boolean isWin = false;

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
            System.out.println("* ******* * \n");
            System.out.println("* Winner! * \n");
            System.out.println("* ******* * \n");
        }

        return isWin;
    }

    public static boolean isTied(char board[]){
        int taken = 0;
        boolean tied = false;


        for(int i = 0; i < board.length; i++){
            if(board[i] != ' '){
                taken++;
            }
        }
        if (taken == 9 && isWinner(board) == false){
            tied = true;
            System.out.println("* ****** * \n");
            System.out.println("* Tied!! * \n");
            System.out.println("* ****** * \n");
        } else {
            tied = false;
        }



        return tied;
    }

}
