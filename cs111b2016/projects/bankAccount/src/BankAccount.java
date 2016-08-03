import java.util.*;

public class BankAccount {

    private String accountName;
    private String accountId;
    private double accountBalance;
    private double accountInterest;
    private Scanner keyboardInput = new Scanner(System.in);

    // Constructor
    public BankAccount(){
        inputAccountName();
        inputAccountId();
        inputAccountBalance();
        inputAccountInterest();
    }

    /**
     *  Setters & Getters
     */

    // Account Name
    public String getAccountName() {
        return this.accountName;
    }

    public void setAccountName(String acctName) {
        this.accountName = acctName;
    }

    // Account Id
    public String getAccountId() {
        return this.accountId;
    }

    public void setAccountId(String acctId) {
        this.accountId = acctId;
    }

    // Account Balance
    public double getAccountBalance() {
        return this.accountBalance;
    }

    public void setAccountBalance(double acctBal) {
        this.accountBalance = acctBal;
    }

    // Account Interest
    public double getAccountInterest(){
        return this.accountInterest;
    }

    public void setAccountInterest(double acctInterest){
        this.accountInterest = acctInterest;
    }

    /**
     *  Account Input methods
     */

    public void inputAccountName(){
        boolean ctl = true;
        while (ctl == true) {
            System.out.print("Enter the account name: ");
            setAccountName(keyboardInput.nextLine());
            if(getAccountName().length() != 0){
                ctl = false;
            } else {
                System.out.println("Ops!!! Account name can't be empty");
            }
        }
    }

    public void inputAccountId(){
        boolean ctl = true;
        while (ctl == true) {
            System.out.print("Enter the account id: ");
            setAccountId(keyboardInput.nextLine());
            if(!getAccountId().isEmpty()){
                ctl = false;
            } else {
                System.out.println("Ops!!! Account id can't be empty");
            }
        }
    }

    public void inputAccountBalance(){
        boolean ctl = true;
        while (ctl == true) {
            System.out.print("Enter the account balance: ");
            try {
                setAccountBalance(Double.parseDouble(keyboardInput.next()));
                ctl = false;
            } catch (NumberFormatException ignore) {
                System.out.println("Ops!!! Balance must be a number");
            }
        }
    }

    public void inputAccountInterest(){
        boolean ctl = true;
        while (ctl == true) {
            System.out.print("Enter the account interest: ");
            try {
                setAccountInterest(Double.parseDouble(keyboardInput.next()));
                if(getAccountInterest() > 0){
                    ctl = false;
                } else {
                    System.out.println("Ops!!! Interest must be greater then 0");
                }
            } catch (NumberFormatException ignore) {
                System.out.println("Ops!!! Interest must be a number");
            }
        }
    }

    /**
     *  Account Actions
     */

    public void makeDeposit(){

        double amount;
        boolean ctl = true;

        while (ctl == true) {
            System.out.print("Enter the deposit amount:");
            try {
                amount = Double.parseDouble(keyboardInput.next());
                if(amount > 0){
                    setAccountBalance(getAccountBalance() + amount);
                    ctl = false;
                } else {
                    System.out.println("Ops!!! Deposit amount must be greater then 0");
                }
            } catch (NumberFormatException ignore) {
                System.out.println("Ops!!! Deposit amount must be a number");
            }
        }
    }

    public void makeWithdraw(){
        double amount;
        boolean ctl = true;

        while (ctl == true) {
            System.out.print("Enter the withdraw amount:");
            try {
                amount = Double.parseDouble(keyboardInput.next());
                if(amount > 0){
                    setAccountBalance(getAccountBalance() - amount);
                    ctl = false;
                } else {
                    System.out.println("Ops!!! Withdraw amount must be greater then 0");
                }
            } catch (NumberFormatException ignore) {
                System.out.println("Ops!!! Withdraw amount must be a number");
            }
        }
    }

    public void addInterest(){
        String msg;

        msg = "The account balance was U$" + this.getAccountBalance();
        setAccountBalance(this.getAccountBalance() + this.getAccountBalance() * this.getAccountInterest() / 100);
        msg += " and after the interest of " + this.getAccountInterest() + "% been added it is now U$" + this.getAccountBalance();
        System.out.println(msg);
    }

    /**
     *  toString();
     */

    public String toString() {
        String acct;
        acct = "Account Name: " + getAccountName();
        acct += "\nAccount Id: " + getAccountId();
        acct += "\nAccount Balance: U$" + String.format("%.2f", getAccountBalance());
        acct += "\nAccount Interest: " + String.format("%.2f", getAccountInterest()) + "%";
        acct += "\n";
        return acct;
    }

     public String printProperty(String property){
        String acct;
        if (property == "name"){
            acct = "The account name is: " + getAccountName();
        } else if (property == "id"){
            acct = "The account id is: " + getAccountId();
        } else if (property == "balance"){
            acct = "The account balance is: U$" + String.format("%.2f", getAccountBalance());
        } else if (property == "interest"){
            acct = "The account interest is: " + String.format("%.2f", getAccountBalance()) + "%";
        } else {
            acct = "Type not supoorted";
        }
        return acct;
    }

}