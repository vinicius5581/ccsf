import java.util.Random;
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

            System.out.println("Simulating " + (strategy1 + strategy2) + " plays:");
            System.out.println("From the " + strategy1 + " times the player stayed with the original pick he/she won " + winStaying + " each gives a margin of " + ((100 * winStaying) / strategy1) + "%");
            System.out.println("From the " + strategy2 + " times the player switched the doors he/she won " + winSwitching + " each gives a margin of " + ((100 * winSwitching) / strategy2) + "%");

            System.out.print("\nDo you wan't to simulate 1000 plays again? (Y/N): ");
            String answer = myKeyboard.nextLine();
            isPlaying = answer.equalsIgnoreCase("y");
        }
    }
}