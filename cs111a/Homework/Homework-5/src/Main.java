/**
 * ••BusinessP5.25
 Postalbarcodes.Forfastersortingofletters,theUnitedStatesPostalService encourages
 companies that send large volumes of mail to use a bar code denoting the zip code (see Figure 6).

 The encoding scheme for a five-digit zip code is shown in Figure 7.
 There are full-height frame bars on each side. The five encoded digits are followed by a check digit,
 which is computed as follows: Add up all digits, and choose the check digit to make the sum a multiple of 10.
 For example, the zip code 95014 has a sum of 19, so the check digit is 1 to make the sum equal to 20.


15 20
16 20

78 80


num % 10

 */

import java.util.Scanner;

public class Main {

    static int calcPow(int x, int y){
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

        //Printing initial frame bar
        System.out.print("|");

        // Printing each Zip Code Digit
        for(int i = 0; i < 5; i++){
            pow1 = 5 - i;
            pow2 = 5 - (i + 1);
            zipcodeDigit = zipCode % (int)Math.pow(10, pow1) / (int)Math.pow(10, pow2);
            //zipcodeDigit = zipCode % calcPow(10, pow1)  / calcPow(10, pow2);
            zipCodeDigitsSum = zipCodeDigitsSum + zipcodeDigit;
            printDigit(zipcodeDigit);
        }

        // Printing CheckDigit
        printDigit(calcCheckDigit(zipCodeDigitsSum));

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


    public static void scratch(){
        Scanner myKeyboard = new Scanner(System.in);
        System.out.print("Enter a Zipcode: ");
        int zipcode = myKeyboard.nextInt();



        //        String result = printDigit(2);

//        int result = calcCheckDigit(26);
//        System.out.println(result);
//        //scratch();
//        printBarCode(95014);
//
//        System.out.println("\n\n");
//        System.out.println("||:|:::|:|:||::::::||:|::|:::|||");




//        System.out.println("||:|:::|:|:||::::::||:|::|:::|||");




//        String zip = Integer.toString(zipcode);
//        System.out.println(zip.length());


//        int firstNumber = zipcode % 100000  / 10000;
//        int secondNumber = zipcode % 10000 / 1000;
//        int thirdNumber = zipcode % 100 / 100;
//        int fourthNumber = zipcode % 100 / 10;
//        int fiftyNumber = zipcode % 10 / 1;
//
//
//        System.out.println(calcPow(10, 5));
//        System.out.println(calcPow(10, 4));
//        System.out.println(calcPow(10, 3));
//        System.out.println(calcPow(10, 2));
//        System.out.println(calcPow(10, 1));

//        int firstNumber = zipcode % calcPow(10, 5)  / calcPow(10, 4); // 5 / 4
//        int secondNumber = zipcode % calcPow(10, 4) / calcPow(10, 3);  // 4 / 3
//        int thirdNumber = zipcode % calcPow(10, 3) / calcPow(10, 2); // 3 / 2
//        int fourthNumber = zipcode % calcPow(10, 2) / calcPow(10, 1);  // 2 / 1
//        int fiftyNumber = zipcode % calcPow(10, 1) / calcPow(10, 0);  // 1 / 0
//
//        System.out.println(firstNumber);
//        System.out.println(secondNumber);
//        System.out.println(thirdNumber);
//        System.out.println(fourthNumber);
//        System.out.println(fiftyNumber);

        System.out.print("|");
        //For each number on the zipcode
        for(int i = 0; i < 5; i++){
            int pow1 = 5 - i;
            int pow2 = 5 - (i + 1);
//            System.out.println(pow1 + " " + pow2);
//            System.out.println("i: " + i);
//            Calculate number on each index
            int zipcodeDigit = zipcode % calcPow(10, pow1)  / calcPow(10, pow2);
            //System.out.print(zipcodeDigit);


            /**
             *
             */

            String digitBar = "";
            switch (zipcodeDigit){
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

            System.out.print(digitBar + " ");
        }
        System.out.print("|");



        //Break the number
        //First number =

        //Print five bars for each number
    }



    //public static int breakNumber(int number){}
    //public static void printDigit(int d){}
    //public static void printBarCode(int zipCode){}
//    public static int calcCheckDigit(int total){
//        return 1;
//    }




//        checkDigit = calcCheckDigit(checkSum)

//        printDigit(checkDigit)

//        System.out.println("|")
}
