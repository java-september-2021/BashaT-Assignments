import java.util.Random;

public class BankAccount{
    //Attributes/Fields
    private String accountNumber;
    private double checkingsBalance;
    private double savingsBalance;
    private static int numberOfAccounts;
    private static double totalMoney;
    
    //Constructors
    public BankAccount(){
        this.accountNumber = this.randAccountNumber();
        this.checkingsBalance = 0;
        this.savingsBalance = 0;
        numberOfAccounts++;
    }


    //Methods
    private String randAccountNumber(){
        String accountNumber = "";
        //return 1 random 10 digit number in a string
        //pull 1 random number and concat to acctnumber
        //pull it 9 more times
        Random r = new Random();
        for (int i=0; i < 10; i++){
            accountNumber = accountNumber.concat(String.valueOf(r.nextInt(10)));
        }
        return accountNumber;
    }

    //depost to checking or Savings
    public void depositMoney(double amount, String accountType){
        if (accountType.equals("checking")){
            //deposit to checking
            //set checkingsBalance
            this.setCheckingsBalance(this.getCheckingsBalance() + amount);
            //increase total money
        } else if (accountType.equals("saving")) {
            //deposit to saving
            //set savingBalance
            this.setSavingsBalance(this.getSavingsBalance() + amount);
            //increase total money
        } else {
            System.out.println("Invalid Account Type");
            return;
        }
        totalMoney += amount;
    }

    //withdraw money
    public void withdrawMoney(double amount, String accountType){
        if (accountType.equals("checking")){
            //withdraw from checking
            //set checkingsBalance
            if (this.getCheckingsBalance() - amount < 0){
                System.out.println("Insufficient Fund");
            } else {
                this.setCheckingsBalance(this.getCheckingsBalance() - amount);
                //decrease total money
                totalMoney -= amount;
            }
            
        } else if (accountType.equals("saving")) {
            if (this.getSavingsBalance() - amount < 0){
                System.out.println("Insufficient Fund");
            } else {
                //withdraw from saving
                //set savingBalance
                this.setSavingsBalance(this.getSavingsBalance() - amount);
                //decrease total money
                totalMoney -= amount;
            }
        } else {
            System.out.println("Invalid Account Type");
            return;
        }
        totalMoney += amount;
    }

    //Account total
    public String getAccountTotal(){
        return "Total Money in the Account: " + (this.getCheckingsBalance() + this.getSavingsBalance());
    }


    //Getters and Setters
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public double getCheckingsBalance() {
        return checkingsBalance;
    }
    private void setCheckingsBalance(double checkingsBalance) {
        this.checkingsBalance = checkingsBalance;
    }
    public double getSavingsBalance() {
        return savingsBalance;
    }
    private void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }
    public static int getNumberOfAccounts() {
        return numberOfAccounts;
    }
    public static void setNumberOfAccounts(int numberOfAccounts) {
        BankAccount.numberOfAccounts = numberOfAccounts;
    }
    public static double getTotalMoney() {
        return totalMoney;
    }
    public static void setTotalMonay(double totalMonay) {
        BankAccount.totalMoney = totalMonay;
    }

}