
// if not specified, class is default private
class ParentClass {

    // instance variables w/o static
    protected double lengthCentimeters;
    protected double widthCentimeters;
    protected String shape;
    protected String ingredients;
    protected String texture = "raw";

    // constructor in parent class
    protected ParentClass(double lengthInCM, double widthInCM, String shapeForm, String cookingIngredients) {
        this.lengthCentimeters = lengthInCM;
        this.widthCentimeters = widthInCM;
        this.shape = shapeForm;
        this.ingredients = cookingIngredients;
    }

    // optional instance method
    protected final String cook() {
        this.texture = "cooked al dente";
        return this.texture;
    }

    // if put final, the childClass cannot method override by using same name
    protected boolean isTasty() {
        return true;
    }

    // can violate SOLID's open-closed principle if say, modify parent code to add
    // new conditional statements
    protected final boolean isMadeWithHeart() {
        return true;
    }

    // testing polymorphism methods
    protected final String makeIntoMainDish(ParentClass noodle) {
        return "This is " + noodle.cook();
    }

    // entry point of prog. Currently this violates Dependency inversion, by
    // coupling the parent and child class together
    public static void main(String[] args) {
        ChildClass spaghettiPomodoro = new ChildClass(15.0, 3.15, "flat", "semolina flour");
        System.out.println(spaghettiPomodoro.shape);
        System.out.println("Is this tasty? " + spaghettiPomodoro.isTasty());
        System.out.println("Made with heart?" + spaghettiPomodoro.isMadeWithHeart());
        System.out.println(spaghettiPomodoro.makeIntoMainDish(spaghettiPomodoro));

    }
}
