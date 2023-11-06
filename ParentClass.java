
// if not specified, class is default private
class ParentClass {

    // instance variables w/o static
    double lengthCentimeters;
    double widthCentimeters;
    String shape;
    String ingredients;
    String texture = "raw";

    // constructor in parent class
    protected ParentClass(double lengthInCM, double widthInCM, String shapeForm, String cookingIngredients) {
        this.lengthCentimeters = lengthInCM;
        this.widthCentimeters = widthInCM;
        this.shape = shapeForm;
        this.ingredients = cookingIngredients;
    }

    // optional instance method
    public void cook() {
        this.texture = "cooked al dente";
    }

    // entry point of prog
    public static void main(String[] args) {
        ChildClass spaghettiPomodoro = new ChildClass();
        System.out.println(spaghettiPomodoro.shape);

    }
}
