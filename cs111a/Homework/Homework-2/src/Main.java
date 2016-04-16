import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myKeyboard = new Scanner(System.in);



        // P2.11 (p. 72)[5 pts.]
        float gasPricePerGallon;
        int gallonsInTank;
        float milesPerGallon;
        float costFor100Miles;
        float distanceWithCurrentTank;

        System.out.print("What's the number of gallons of gas in the tank: ");
        gallonsInTank = myKeyboard.nextInt();
        System.out.print("What is the fuel efficiency in miles per gallon: ");
        milesPerGallon = myKeyboard.nextFloat();
        System.out.print("What's the price of gas per gallon: ");
        gasPricePerGallon = myKeyboard.nextFloat();

        costFor100Miles = (100 / milesPerGallon) * gasPricePerGallon;
        distanceWithCurrentTank = gallonsInTank * milesPerGallon;

        System.out.println("The cost per 100 miles is: U$" + costFor100Miles);
        System.out.println("The car can go " + distanceWithCurrentTank + " miles with the gas in the tank ");


        System.out.println("\n\n-------------------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------------------\n\n");

        // P2.19 (p. 74)[5 pts.]
        String months = "January  February March    April    May      June     July     August   SeptemberOctober  November December   ";
        System.out.print("Pick a month using a number from 1 to 12: ");
        int monthNumber = myKeyboard.nextInt();
        int limit = monthNumber * 9;
        int start = limit - 9;

        String monthLiteral = months.substring(start, limit);
        System.out.println(monthLiteral);

        System.out.println("\n\n-------------------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------------------\n\n");

        // P2.23 (p. 75)[5 pts.]
        System.out.println("Please enter a phone number on the format 0000000000: ");
        String phoneString = myKeyboard.next();

        String areaCode = phoneString.substring(0, 3);
        String first3 = phoneString.substring(3, 6);
        String last4 = phoneString.substring(6, 10);

        System.out.println("("+areaCode+")"+first3+"-"+last4);

        System.out.println("\n\n-------------------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------------------\n\n");

        // P2.25 (p. 75)[5 pts.]
        final Integer aDollar = 100;
        final Integer aQuarter = 25;
        final Integer aDime = 10;
        final Integer aNickel = 5;
        final Integer aPennie = 1;
        Integer amountDue;
        Integer amountReceived;
        Integer fullChange;
        Integer dollarChange;
        Integer quarterChange;
        Integer dimeChange;
        Integer nickelChange;
        Integer pennieChange;

        System.out.print("The amount due is: ");
        amountDue = myKeyboard.nextInt();
        System.out.print("The amount received is: ");
        amountReceived = myKeyboard.nextInt();

        fullChange = amountReceived - amountDue;

        dollarChange = fullChange / aDollar;
        System.out.println("Dollar Change: " +  dollarChange);
        fullChange = fullChange % aDollar;

        quarterChange = fullChange / aQuarter;
        System.out.println("Quarter Change: " +  quarterChange);
        fullChange = fullChange % aQuarter;

        dimeChange = fullChange / aDime;
        System.out.println("Dime Change: " +  dimeChange);
        fullChange = fullChange % aDime;

        nickelChange = fullChange / aNickel;
        System.out.println("Nickel Change: " +  nickelChange);
        fullChange = fullChange % aNickel;

        pennieChange = fullChange / aPennie;
        System.out.println("Pennie Change: " + pennieChange);



    }
}