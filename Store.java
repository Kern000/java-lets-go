public class Store {

    String productType;

    public Store(String product) {
        productType = product;
    }

    public void advertise() {
        System.out.println("Selling " + productType + "!");
        System.out.println("They are delicious");
    }

    public static void main(String[] args) {
        Store lemonadeStore = new Store("lemonade");
        int count = 3;
        for (int i = 0; i < count; i++) {
            lemonadeStore.advertise();
        }
    }
}