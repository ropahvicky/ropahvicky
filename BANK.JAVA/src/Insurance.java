public class Insurance extends Bank{
    public Insurance(String accountType, double accountBalance) {
        super(accountType, accountBalance);

    }
    //this method is for displaying
    public void cover(){
        System.out.println("You are covered.");
    }
}
