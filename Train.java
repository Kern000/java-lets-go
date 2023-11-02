public class Train {

    String color;
    boolean isElectric;
    int mileagePerGigaWatt;

    public Train(String trainColor, boolean trainType, int trainMileage) {
        color = trainColor;
        isElectric = trainType;
        mileagePerGigaWatt = trainMileage;
    }

    public static void main(String[] args) {
        Train train001 = new Train("gray", true, 40);
        System.out.println("train color is " + train001.color + ", " + "train type is electric? " + train001.isElectric
                + ", " + "train mileage is " + train001.mileagePerGigaWatt);
    }

}
