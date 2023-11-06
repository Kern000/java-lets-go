public class ChildClass extends ParentClass {

    ChildClass(double arg1, double arg2, String arg3, String arg4) {
        super(arg1, arg2, arg3, arg4);

    }

    // attempt to method override
    @Override
    protected boolean isTasty() {
        return false;
    }

    // thus the child is able to use both its own override method and the parent
    // class's own method with same name

    public void whetherNoodleIsTasty() {
        super.isTasty();
    }

    // Polymorphism, defining child object as a parent class object
    public void createRamen() {
        ParentClass superRamen = new ChildClass(10.0, 0.15, "round", "wheat flour");
        System.out.println(superRamen.shape);
    }

}
