import java.util.Scanner;

public class BankAccountDriver {

    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        char userInput;

        BankAccount userAccount = new BankAccount();


        boolean session = true;
        while(session){
            System.out.println("\n" +
                    "Enter 'd' to make a deposit. \n" +
                    "Enter 'w' to make a withdrawal. \n" +
                    "Enter 'b' to check the balance. \n" +
                    "Enter 'a' to view account details. \n" +
                    "Enter 'i' to add interest. \n" +
                    "Enter 'n' to change the interest rate. \n" +
                    "Enter 'q' to quit.");

            userInput = keyboardInput.next().charAt(0);

            switch (userInput){
                case 'd' : userAccount.makeDeposit();
                    break;
                case 'w': userAccount.makeWithdraw();
                    break;
                case 'b': System.out.println(userAccount.printProperty("balance"));
                    break;
                case 'i' : userAccount.addInterest();
                    break;
                case 'n' : userAccount.inputAccountInterest();
                    break;
                case 'a' : System.out.println(userAccount);
                    break;
                case 'q' : session = false;
                    break;
                default : System.out.println("Invalid entry");
                    break;
            }
        }
    }

}