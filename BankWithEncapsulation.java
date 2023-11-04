public class BankWithEncapsulation {

    // instance variables
    private CheckingAccount accountOne;
    private CheckingAccount accountTwo;

    public BankWithEncapsulation() {
        accountOne = new CheckingAccount("meow", 500, "1");
        accountTwo = new CheckingAccount("Woof", 100, "2");

    }

    public static void main(String[] args) {
        BankWithEncapsulation bankOfCuteAnimals = new BankWithEncapsulation();
        System.out.println(bankOfCuteAnimals);

        System.out.println(bankOfCuteAnimals.accountOne.getBalance());
        System.out.println(bankOfCuteAnimals.accountTwo.getBalance());

        bankOfCuteAnimals.accountTwo.setBalance(10.00);
        System.out.println("new balance here: " + bankOfCuteAnimals.accountTwo.getBalance());
    }
}
