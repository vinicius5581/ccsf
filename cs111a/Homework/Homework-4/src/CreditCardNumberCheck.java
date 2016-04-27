/**
 * Created by vinicius on 4/24/16.
 *
 *

 Credit Card Number Check. The last digit of a credit card number is the check digit,
 which protects against transcription errors such as an error in a single digit or
 switching two digits.

 The following method is used to verify actual credit card numbers but, for simplicity,
 we will describe it for numbers with 8 digits instead of 16:

 • Starting from the rightmost digit, form the sum of every other digit. For example,
   if the credit card number is 4358 9795, then you form the sum


 4 3 5 8 9 7 9 5
 1 2 3 4 5 6 7 8


 first set: 5 + 7 + 8 + 3 = 23.
 first set: 8   6   3   1


 4 3 5 8 9 7 9 5
 0 1 2 3 4 5 6 7

 indexes 1 + 3 + 5 + 7
 values  3 + 8 + 7 + 5 = 23


 • Double each of the digits that were not included in the preceding step.

 indexes 0 + 2 + 4 + 6
 values  4 + 5 + 9 + 9
 doubles 8 + 10 + 18 + 18



 Add all digits of the resulting numbers. For example, with the number given above,

 doubling the digits, starting with the next-to-last one, yields 18 18 10 8.

 Adding all digits in these values yields 1 + 8 + 1 + 8 + 1 + 0 + 8 = 27.

 adding 8 + 1 + 0 + 1 + 8 + 1 + 8 = 27

 • Add the sums of the two preceding steps. If the last digit of the result is 0, the

 number is valid. In our case, 23 + 27 = 50, so the number is valid.

 Write a program that implements this algorithm. The user should supply an 8-digit

 number, and you should print out whether the number is valid or not. If it is not

 valid, you should print the value of the check digit that would make it valid.
 */

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





