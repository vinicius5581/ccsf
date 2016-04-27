import java.util.Scanner;

public class CreditCardNumberCheck {



    public static int doubleSumDigits(int digit){
        int number = digit * 2;
        return (number / 10) + (number % 10);
    }

    public static int calcPow(int x, int y){
        int value = x;
        for(int i = 1; i < y; i++){
            value = value * x;
        }
        if (y == 0){
            return 1;
        } else {
            return value;
        }
    }

    public static void main(String[] args) {
        Scanner myKeyboard = new Scanner(System.in);
        Scanner myKeyboard2 = new Scanner(System.in);
        Boolean isPlaying = true;
        while(isPlaying == true){
            System.out.println("Please enter your credit card number (8 digits without spaces): ");
            int creditCardNumber = myKeyboard.nextInt();
            int length = String.valueOf(creditCardNumber).length();
            int firstSet = 0;
            int secondSet = 0;
            int pow1 = 0;
            int pow2 = 0;
            int checkDigit = ( creditCardNumber % calcPow(10, 1)) / calcPow(10, 0);


            if (length == 8) {
                for(int i = 0; i < length; i+=2){
                    pow1 = i + 1;
                    pow2 = i;
                    firstSet += (creditCardNumber % calcPow(10, pow1)) / calcPow(10, pow2);

                    pow1 = i + 2;
                    pow2 = i + 1;
                    secondSet += doubleSumDigits((creditCardNumber % calcPow(10, pow1)) / calcPow(10, pow2));
                }

                int sumFirstSecond = firstSet + secondSet;
                int sumFirstSecondlastDigit = sumFirstSecond % 10;

                if(sumFirstSecondlastDigit != 0){
                    System.out.print("This is not a valid card!! ");
                    for(int i = 1; i <= 10; i++) {
                        int sumFirstSecondSimulation = sumFirstSecond - checkDigit + i;
                        if(sumFirstSecondSimulation % 10 == 0){
                            System.out.println("To make it a valid credit card number, the check digit must be " + i );
                            break;
                        }
                    }
                }else{
                    System.out.println("This is a valid card");
                }
            } else {
                System.out.println("The credit card number must have 8 digits without spaces");
            }
            System.out.println("Do you wan't to play again? (Y/N): ");
            String answer = myKeyboard2.nextLine();
            isPlaying = answer.equalsIgnoreCase("y");
        }
    }
}





