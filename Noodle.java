class Noodle {

    protected double lengthInCentimeters;
    protected double widthInCentimeters;
    protected String shape;
    protected String ingredients;
    protected String texture = "brittle";

    Noodle(double lenInCent, double wthInCent, String shp, String ingr) {

        this.lengthInCentimeters = lenInCent;
        this.widthInCentimeters = wthInCent;
        this.shape = shp;
        this.ingredients = ingr;

    }

    public String getCookPrep() {

        return "Boil noodle for 7 minutes and add sauce.";

    }

    // polymorphism: All the overriden methods is being called in the array of
    // objects
    public static void main(String[] args) {

        // objects that reference class and will initiatlize child object instances
        Noodle spaghetti, ramen, pho;

        spaghetti = new Spaghetti();
        ramen = new Ramen();
        pho = new Pho();

        // array of reference object
        Noodle[] allTheNoodles = { spaghetti, ramen, pho };
        for (Noodle noodleType : allTheNoodles) {
            // calls all their override methods in child class;
            System.out.println(noodleType.getCookPrep());
        }
    }

}