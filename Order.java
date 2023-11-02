public class Order {

  boolean isCompleted;
  double billingAmount;
  String shippingMethod;

  public Order(boolean completed, double cost, String shipping) {
    if (billingAmount > 24.00) {
      System.out.println("High value item!");
    }
    isCompleted = completed;
    billingAmount = cost;
    shippingMethod = shipping;
  }

  public void ship() {
    if (isCompleted) {
      System.out.println("This is for an order");
      System.out.println("Shipping cost: " + calculateShipping());
    } else {
      System.out.println("Order not ready");
    }
  }

  public double calculateShipping() {
    // declare conditional statement here
    if (shippingMethod.equals("DHL Express")) {
      return 9.99;
    } else if (shippingMethod.equals("Slow mail")) {
      return 2.00;
    } else {
      return 0.50;
    }
  }

  public static void main(String[] args) {

    Order book = new Order(true, 29.99, "DHL Express");
    Order chemistrySet = new Order(false, 99.50, "Slow mail");

    book.ship();
    chemistrySet.ship();
  }
}
