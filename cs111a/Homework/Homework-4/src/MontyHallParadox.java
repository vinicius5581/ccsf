import java.util.Random;

/**
 * Created by vinicius on 4/23/16.
 *
 * P4.24 (page 192)[10pts.]
 *

 The Monty Hall Paradox. Marilyn vos Savant described the following problem
 (loosely based on a game show hosted by Monty Hall) in a popular magazine:
 “Suppose you’re on a game show, and you’re given the choice of three doors:

 Behind one door is a car; behind the others, goats.

 You pick a door, say No. 1, and the host, who knows what’s behind the doors, opens another door, say No. 3, which has a goat.
 He then says to you, “Do you want to pick door No. 2?” Is it to your advantage to switch your choice?”

 Ms. vos Savant proved that it is to your advantage, but many of her readers, including some mathematics professors,
 disagreed, arguing that the probability would not change because another door was opened.

 Your task is to simulate this game show.

 In each iteration, randomly pick a door number between 1 and 3 for placing the car.

 Randomly have the player pick a door.

 Randomly have the game show host pick a door having a goat (but not the door thatProgramming Exercises  193 the player picked).

 Increment a counter for strategy 1 if the player wins by switching to the host’s choice, and increment a counter for strategy 2
 if the player wins by sticking with the original choice. Run 1,000 iterations and print both counters.
 */
import java.util.Scanner;

public class MontyHallParadox {

    public static void main(String[] args) {
        Scanner myKeyboard = new Scanner(System.in);
        Random randomNumber = new Random();
        Boolean isPlaying = true;

        while(isPlaying == true){

            int totalWins = 0;
            int winSwitching = 0;
            int winStaying = 0;

            int strategy1 = 0;
            int strategy2 = 0;
            int firstGoat = 0;


            for(int i = 0; i < 1000; i++){

                // Choosing a door for the car
                int doorWithCar = randomNumber.nextInt(3) + 1;

                // Player Pick a door
                int playerPick = randomNumber.nextInt(3) + 1;

                // Host reveals a goat
                int hostReveals = 0;
                if (doorWithCar == 1){
                    if (playerPick == 1){
                        hostReveals = randomNumber.nextInt(2);
                        if (hostReveals == 1){
                            firstGoat = 2;
                        } else {
                            firstGoat = 3;
                        }
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
                        hostReveals = randomNumber.nextInt(2);
                        if (hostReveals == 1){
                            firstGoat = 1;
                        } else {
                            firstGoat = 3;
                        }
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
                        hostReveals = randomNumber.nextInt(2);
                        if (hostReveals == 1){
                            firstGoat = 1;
                        } else {
                            firstGoat = 2;
                        }
                    }
                }

                // Player Stay or Switch
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
                        winSwitching++;
                        totalWins ++;
                    }
                } else {
                    strategy1 ++;
                    if (playerPick == doorWithCar){
                        winStaying ++;
                        totalWins ++;
                    }
                }
            }

            // Print results

            System.out.println("Total Plays: " + (strategy1 + strategy2));
            System.out.println("\n -------------- \n");

            System.out.println("Total Wins: " + totalWins);
            System.out.println("Total Losts: " + ( (strategy1 + strategy2) - totalWins ));

            System.out.println("\n -------------- \n");

            System.out.println("Stayed with original pick " + strategy1 + " times and won " + winStaying + " each gives a margin of " + ((100 * winStaying) / strategy1) + "%");
            System.out.println("Switch the door " + strategy2 + " times and won " + winSwitching + " each gives a margin of " + ((100 * winSwitching) / strategy2) + "%");

            System.out.println("\n -------------- \n");


            // Give user choice to simulate again

            System.out.println("Do you wan't to simulate 1000 plays again? (Y/N): ");
            String answer = myKeyboard.nextLine();
            isPlaying = answer.equalsIgnoreCase("y");
        }
    }
}