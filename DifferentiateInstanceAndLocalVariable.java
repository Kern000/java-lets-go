public class DifferentiateInstanceAndLocalVariable {

    public String owner;
    public int dollarBalance;
    public int euroBalance;

    private int getDollarBalance() {
        return dollarBalance;
    }

    public DifferentiateInstanceAndLocalVariable(String owner, int dollarBalance, int euroBalance) {
        this.owner = owner;
        this.dollarBalance = dollarBalance;
        this.euroBalance = euroBalance;
    }

    public void getAccountInformation() {
        System.out.println("This account has " + getDollarBalance());
    }
}
