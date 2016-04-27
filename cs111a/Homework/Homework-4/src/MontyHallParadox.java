import java.util.Random;
import java.util.Scanner;

public class MontyHallParadox {
    public static void main(String[] args) {
        Scanner myKeyboard0 = new Scanner(System.in);
        Scanner myKeyboard01 = new Scanner(System.in);
        Boolean keepPlaying = true;

        while(keepPlaying == true) {
            System.out.println("Enter 1 to simulate 1000 plays or 2 to play Month Hall");
            int gameOption = myKeyboard0.nextInt();
            if (gameOption == 1) {
                simulate();
            } else {
                play();
            }
            System.out.print("\nDo you wan't to keep playing? (Y/N): ");
            String answer = myKeyboard01.nextLine();
            keepPlaying = answer.equalsIgnoreCase("y");
        }
    }
    public static void simulate() {
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
    public static void play() {
        Scanner myKeyboard = new Scanner(System.in);
        Scanner myKeyboard1 = new Scanner(System.in);
        Scanner myKeyboard2 = new Scanner(System.in);
        Random randomNumber = new Random();


        Boolean isPlaying = true;
//        int totalWins = 0;
//        int winSwitching = 0;
//        int winStaying = 0;

//        int strategy1 = 0;
//        int strategy2 = 0;

        while(isPlaying == true){
            int firstGoat = 0;
            // Choosing a door for the car
            int doorWithCar = randomNumber.nextInt(3) + 1;
            // Player Pick a door
            System.out.print("Do you want to pick door 1, 2 or 3? ");
            int playerPick = myKeyboard1.nextInt();
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

            System.out.println("Host pick door " + firstGoat + " with a goat");
            // Player Stay or Switch
            System.out.print("Would you like to switch doors? (Y/N) ");

            String switchAnswer = myKeyboard2.nextLine();
            Boolean doesPlayerSwitch = switchAnswer.equalsIgnoreCase("y");

            if (doesPlayerSwitch == true){
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
                    System.out.println("You won!!!");
                } else {
                    System.out.println("You lose!!!");
                }
            } else {
                if (playerPick == doorWithCar){
                    System.out.println("You won!!!");
                } else {
                    System.out.println("You lose!!!");
                }
            }

            System.out.println("Do you wan't to play again? (Y/N): ");
            String answer = myKeyboard.nextLine();
            isPlaying = answer.equalsIgnoreCase("y");
        }
    }
}