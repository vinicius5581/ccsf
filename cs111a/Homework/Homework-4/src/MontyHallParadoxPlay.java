
/**
 * Created by vinicius on 4/24/16.
 */

import java.util.Random;
import java.util.Scanner;

public class MontyHallParadoxPlay {

    public static void main(String[] args) {
        Scanner myKeyboard = new Scanner(System.in);
        Random randomNumber = new Random();
        Boolean isPlaying = true;
        int wins = 0;
        int losts = 0;
        int strategy1 = 0;
        int strategy2 = 0;
        int firstGoat = 0;


        while(isPlaying == true){
            //Set the doors
            int doorWithCar = randomNumber.nextInt(3) + 1;
            int playerPick = randomNumber.nextInt(3) + 1;

            System.out.println("Player picked door " + playerPick);

            // Host pick a goat
            if (doorWithCar == 1){
                if (playerPick == 1){
                    firstGoat = 2; // could be 2 or 3
                }
                if (playerPick == 2){
                    firstGoat = 3;
                }
                if (playerPick == 3){
                    firstGoat = 2;
                }
            }
            if (doorWithCar == 2){
                if (playerPick == 1){
                    firstGoat = 3;
                }
                if (playerPick == 2){
                    firstGoat = 1; // could be 1 or 3
                }
                if (playerPick == 3){
                    firstGoat = 1;
                }
            }
            if (doorWithCar == 3){
                if (playerPick == 1){
                    firstGoat = 2;
                }
                if (playerPick == 2){
                    firstGoat = 1;
                }
                if (playerPick == 3){
                    firstGoat = 1; // could be 1 or 2
                }
            }

            System.out.println("Host revel goat behind door " + firstGoat);
            // Does player switch?


            int doesPlayerSwitch = randomNumber.nextInt(2);

            if (doesPlayerSwitch == 1){
                strategy2 ++;
                if (playerPick == 1){
                    if(firstGoat == 2){
                        playerPick = 3;
                    } else {
                        playerPick = 2;
                    }
                }
                if (playerPick == 2){
                    if(firstGoat == 1){
                        playerPick = 3;
                    } else {
                        playerPick = 1;
                    }
                }
                if (playerPick == 3){
                    if(firstGoat == 1){
                        playerPick = 2;
                    } else {
                        playerPick = 1;
                    }
                }
                if (playerPick == doorWithCar){
                    System.out.println("Player switch to door "+playerPick +" and won");
                    wins ++;
                } else {
                    System.out.println("Player switch to door "+playerPick +" and lost");
                    losts ++;
                }
            } else {
                strategy1 ++;
                if (playerPick == doorWithCar){
                    System.out.println("Player stayed with door "+playerPick +" and won");
                    wins ++;
                } else {
                    System.out.println("Player stayed with door "+playerPick +" and lost");
                    losts ++;
                }
            }

            System.out.println("The car was behind door " + doorWithCar);

            System.out.println("Stayed: " + strategy1);
            System.out.println("Changed: " + strategy2);
            System.out.println("Wins: " + wins);
            System.out.println("Losts: " + losts);
            System.out.println("Total: " + (wins + losts));

            System.out.println("Do you wan't to play again? (Y/N): ");
            String answer = myKeyboard.nextLine();
            isPlaying = answer.equalsIgnoreCase("y");
        }
    }

}
