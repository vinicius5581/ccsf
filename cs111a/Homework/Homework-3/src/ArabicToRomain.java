// Homework-3
// P3.26 (page 130)[10 pts.]

import java.util.Scanner;

public class ArabicToRomain {

    public static void main(String[] args) {
        Scanner myKeyboard = new Scanner(System.in);
        System.out.println("P3.26 (page 130)[10 pts.]");

        int number;
        int mod;
        int qty;

        System.out.print("Please enter a positive integer up to 3,999 to be converted into the romain system: ");
        number = myKeyboard.nextInt();

        if (number > 0 && number < 3999) {
            if (number / 1000 > 0) {
                qty = number / 1000;
                for (int i = 0; i < qty; i++) {
                    System.out.print("M");
                }
                number = number % 1000;
            }
            if (number / 500 > 0) {
                mod = (number % 500) / 100;
                switch (mod) {
                    case 0:
                        System.out.print("D");
                        break;
                    case 1:
                        System.out.print("DC");
                        break;
                    case 2:
                        System.out.print("DCC");
                        break;
                    case 3:
                        System.out.print("DCCC");
                        break;
                    case 4:
                        System.out.print("CM");
                        break;

                }
                number = number % 500 - mod * 100;
            }
            if (number / 100 > 0) {
                if (number / 100 != 4) {
                    qty = number / 100;
                    for (int i = 0; i < qty; i++) {
                        System.out.print("C");
                    }
                } else {
                    System.out.print("CD");
                }
                number = number % 100;
            }

            if (number / 50 > 0) {
                mod = (number % 50) / 10;
                switch (mod) {
                    case 0:
                        System.out.print("L");
                        break;
                    case 1:
                        System.out.print("LX");
                        break;
                    case 2:
                        System.out.print("LXX");
                        break;
                    case 3:
                        System.out.print("LXXX");
                        break;
                    case 4:
                        System.out.print("XC");
                        break;
                }
                number = number % 50 - mod * 10;
            }


            if (number / 10 > 0) {
                if (number / 10 == 4) {
                    System.out.print("XL");
                } else {
                    qty = number / 10;
                    for (int i = 0; i < qty; i++) {
                        System.out.print("X");
                    }
                }
                number = number % 10;
            }
            switch (number) {
                case 1:
                    System.out.print("I");
                    break;
                case 2:
                    System.out.print("II");
                    break;
                case 3:
                    System.out.print("III");
                    break;
                case 4:
                    System.out.print("IV");
                    break;
                case 5:
                    System.out.print("V");
                    break;
                case 6:
                    System.out.print("VI");
                    break;
                case 7:
                    System.out.print("VII");
                    break;
                case 8:
                    System.out.print("VIII");
                    break;
                case 9:
                    System.out.print("IX");
                    break;
            }
        } else {
            System.out.println("Only numbers between 1 and 3,999 are represented");
        }

    }
}
