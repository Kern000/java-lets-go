
// if not specified, class is default private
class ParentClass {

    // instance variables w/o static
    double lengthCentimeters;
    String shape;
    String texture = "smooth";

    // optional instance method
    public void cook() {
        this.texture = "cooked";
    }

    // entry point of prog
    public static void main(String[] args) {
        ChildClass spaghettiPomodoro = new ChildClass();
        System.out.println(spaghettiPomodoro.texture);
    }
}