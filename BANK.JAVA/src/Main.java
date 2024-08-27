//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Bank bank= new Bank("RVM", 230048);// this is for creating the instance of the Bank class
        bank.deposit(200D);
        bank.withdrawal(2000D);
        bank.display();
    }
}

