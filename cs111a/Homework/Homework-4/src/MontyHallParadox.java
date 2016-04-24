import java.util.Random;

/**
 * Created by vinicius on 4/23/16.
 *
 * P4.24 (page 192)[10pts.]
 *

 The Monty Hall Paradox. Marilyn vos Savant described the following problem
 (loosely based on a game show hosted by Monty Hall) in a popular magazine: “Sup­
 pose you’re on a game show, and you’re given the choice of three doors:

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
            //Set the doors
            boolean door1 = false;
            boolean door2 = false;
            boolean door3 = false;
            boolean door1IsSelected = false;
            boolean door2IsSelected = false;
            boolean door3IsSelected = false;
            int doorWithCar = randomNumber.nextInt(3) + 1;

            switch (doorWithCar){
                case 1: door1 = true;break;
                case 2: door2 = true;break;
                case 3: door3 = true;break;
            }

            System.out.println("doorWithCar" + doorWithCar);
            System.out.println("door1: " + door1);
            System.out.println("door2: " + door2);
            System.out.println("door3: " + door3);
            //Player pick door

            int playerPick = randomNumber.nextInt(3) + 1;

            switch (playerPick){
                case 1: door1IsSelected = true;break;
                case 2: door2IsSelected = true;break;
                case 3: door3IsSelected = true;break;
            }

            System.out.println("playerPick: door" + playerPick);

            //Host pick a door having a goat


            if (door1IsSelected == true){}

            int hostPick;

            //Strategy-1

            //Strategy-2



            for (int i = 0; i < 3; i ++){

            }


            for (int i = 0; i < 3; i++) {
                int n = randomNumber.nextInt(3) + 1;
                System.out.println(n);
            }

            System.out.println("Do you wan't to play again? (Y/N): ");
            String answer = myKeyboard.nextLine();
            isPlaying = answer.equalsIgnoreCase("y");
        }
    }

}
