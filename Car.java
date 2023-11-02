public class Car {

    // class fields here;
    String color;
    int mileage;
    int fullTank;
    boolean isGasoline;

    // constructor overloading - constructor 1
    public Car(String carColor) {
        System.out.print("Car constructor here ");
        // instance fields here;
        color = carColor;
    }

    // constructor 2
    public Car(boolean gasolineCar, int mileagePerGallon, int tankCapacity) {
        isGasoline = gasolineCar;
        fullTank = tankCapacity;
        mileage = mileagePerGallon;
    }

    public static void main(String[] args) {

        // main method here

        Car sedan = new Car("red");
        System.out.println(sedan); // this provides memory address
    }
}
