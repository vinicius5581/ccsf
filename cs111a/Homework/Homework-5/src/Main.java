/**
 * BusinessP5.25
 *
 * Author: Osmar Vinicius Santana
 *
 * css111 a
 *
 */

import java.util.Scanner;

public class Main {

    public static void printDigit(int d){
        String digitBar = "";
        switch (d){
            case 1: digitBar = ":::||";
                break;
            case 2: digitBar = "::|:|";
                break;
            case 3: digitBar = "::||:";
                break;
            case 4: digitBar = ":|::|";
                break;
            case 5: digitBar = ":|:|:";
                break;
            case 6: digitBar = ":||::";
                break;
            case 7: digitBar = "|:::|";
                break;
            case 8: digitBar = "|::|:";
                break;
            case 9: digitBar = "|:|::";
                break;
            case 0: digitBar = "||:::";
                break;
        }
        System.out.print(digitBar);
    }

    public static int calcCheckDigit(int total){
        return 10 - (total % 10);
    }

    public static void printBarCode(int zipCode){
        int zipCodeDigitsSum = 0;
        int zipcodeDigit = 0;
        int pow1 = 0;
        int pow2 = 0;
        int checkDigit = 0;

        //Printing initial frame bar
        System.out.print("|");

        // Printing each Zip Code Digit
        for(int i = 0; i < 5; i++){
            pow1 = 5 - i;
            pow2 = 5 - (i + 1);
            zipcodeDigit = zipCode % (int)Math.pow(10, pow1) / (int)Math.pow(10, pow2);
            zipCodeDigitsSum = zipCodeDigitsSum + zipcodeDigit;
            printDigit(zipcodeDigit);
        }

        // Printing CheckDigit
        checkDigit = calcCheckDigit(zipCodeDigitsSum);
        printDigit(checkDigit);

        //Printing ending frame bar
        System.out.print("|");
    }

    public static void main(String[] args) {

        Scanner myKeyboard = new Scanner(System.in);
        System.out.print("Enter a Zipcode: ");
        int zipcode = myKeyboard.nextInt();

        if (zipcode / 10000 == 0){
            System.out.println("You entered less then 5 digits");
            System.out.println("Zipcode must have 5 digits");
        } else if (zipcode / 100000 > 0) {
            System.out.println("You entered more then 5 digits");
            System.out.println("Zipcode must have 5 digits");
        } else {
            printBarCode(zipcode);
        }
    }
}