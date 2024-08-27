public class Bank {
    private String accountType;
    private Double accountBalance;
    // Below is the constructor for accountType and accountBalance fields
    public Bank(String accountType, double accountBalance) {
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }

    //This method is for depositing money in th account
    public Double deposit(Double deposit){
        accountBalance+=deposit;
        return accountBalance;
    }
    //This method is for withdrawing money from the account
    public Double withdrawal(Double withdrawal){
        String message;

        if(accountBalance<withdrawal){
            message="You have insufficient funds to perfom this transaction";
        }
        else{
            accountBalance-=withdrawal;

        }
        return accountBalance;
    }
    // this method is for displaying the message
    public void display(){
        System.out.println("The account type is " + accountType + " and the balance is " + accountBalance);
    }
}
