public class CheckingAccount {

    private String name;
    private double balance;
    private String accountId;

    public CheckingAccount(String inputName, double inputBalance, String inputId) {
        name = inputName;
        balance = inputBalance;
        accountId = inputId;
    }

    // Create Accessor method here; abstraction on class's variable name
    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return accountId;
    }

    // setter or mutator method
    public double setBalance(double newBalance) {
        balance = newBalance;
        return balance;
    }
}