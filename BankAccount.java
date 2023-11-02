public class BankAccount {

    double accountBalance;

    public BankAccount(double startingBalance) {
        accountBalance = startingBalance;
    }

    public void deposit(double amountBeingDeposited) {
        accountBalance = accountBalance + amountBeingDeposited;
    }

    public void withdrawal(double amountBeingWithdrawn) {
        accountBalance = accountBalance - amountBeingWithdrawn;
    }

    public static void main(String[] args) {
        BankAccount limAhMeowAccount = new BankAccount(500);
        System.out.println(limAhMeowAccount.accountBalance);

        limAhMeowAccount.deposit(1000.76);
        System.out.println(limAhMeowAccount.accountBalance);

        limAhMeowAccount.withdrawal(99.99);
        System.out.println(limAhMeowAccount.accountBalance);
    }
}
