public class ATM {

  // Static variables;
  public static int totalMoney = 0;
  public static int numOfATM = 0;

  // Instance variables
  public int money;

  public ATM(int inputMoney) {
    this.money = inputMoney;
  }

  public void withdrawMoney(int amountToWithdraw) {
    if (amountToWithdraw <= this.money) {
      this.money -= amountToWithdraw;
    }
  }

  // only can access static variables not instance variables
  public static void reportTotalMoney() {
    System.out.println(totalMoney);
  }

  public static void main(String[] args) {
    ATM firstATM = new ATM(1000);
    ATM secondATM = new ATM(500);
    ATM.numOfATM += 2;
    ATM.totalMoney += firstATM.money;
    ATM.totalMoney += secondATM.money;

    System.out.println(firstATM.money);
    System.out.println(secondATM.money);
    System.out.println(ATM.totalMoney);
    System.out.println(ATM.numOfATM);

    reportTotalMoney();
  }

}