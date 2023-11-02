public class MerchantStore {
    // instance fields
    String productType;
    double price;

    // constructor method
    public MerchantStore(String product, double initialPrice) {
        productType = product;
        price = initialPrice;
    }

    // increase price method
    public void increasePrice(double priceToAdd) {
        double newPrice = price + priceToAdd;
        price = newPrice;
    }

    public String toString() {
        return "This store sells " + productType + " at a price of " + price + ".";
    }

    // get price with tax method
    public double getPriceWithTax() {
        double tax = 0.08;
        double totalPrice = price + price * tax;
        return totalPrice;
    }

    // main method
    public static void main(String[] args) {
        MerchantStore lemonadeStand = new MerchantStore("Lemonade", 3.75);
        MerchantStore cookieShop = new MerchantStore("Cookies", 5);
        System.out.println(lemonadeStand);
        System.out.println(cookieShop);

        // note when MerchantStore lemonadeStand, we are defining the type to be
        // MerchantStore object;

    }
}