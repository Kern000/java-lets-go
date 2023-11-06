class NoodleRestaurant {

    String name;

    public NoodleRestaurant(String customerName) {
        name = customerName;
    }

    public void order(Noodle noodle) {
        System.out.println(noodle.getCookPrep());
        System.out.println("Prepared order for " + name + ". The order is ready.");
    }

    public static void main(String[] args) {
        Noodle ramen, pho;
        ramen = new Ramen();
        pho = new Pho();

        NoodleRestaurant customer1 = new NoodleRestaurant("John Smith");
        NoodleRestaurant customer2 = new NoodleRestaurant("John Wick");

        customer1.order(ramen);
        customer2.order(pho);
    }
}