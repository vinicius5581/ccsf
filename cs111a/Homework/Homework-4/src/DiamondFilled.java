import java.util.Scanner;

public class DiamondFilled {

    public static void printChars(int count, char c){
        for(int i = 0; i < count; i++ ){
            System.out.print(c);
        }
    }

    public static void main(String[] args) {
        Scanner myKeyboard = new Scanner(System.in);
        Scanner myKeyboard2 = new Scanner(System.in);

        Boolean isPlaying = true;
        while(isPlaying == true){
            System.out.print("Please enter the diamond side length: ");

            int side  = myKeyboard.nextInt();
            int length = 2 * side - 1;
            int whitespaces = side - 1;
            int stars = 1;
            for (int line = 0; line < length; line++){

                printChars(whitespaces, ' ');
                printChars(stars, '*');

                if (line < side - 1) {
                    whitespaces = whitespaces - 1;
                    stars = stars + 2;
                } else {
                    whitespaces = whitespaces + 1;
                    stars = stars - 2;
                }
                System.out.print("\n");
            }

            System.out.print("Do you wan't to play again? (Y/N): ");
            String answer = myKeyboard2.nextLine();
            isPlaying = answer.equalsIgnoreCase("y");
        }
    }

}