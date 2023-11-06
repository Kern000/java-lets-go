// abstract class that cannot be instantiated on its own
// in dependency inversion of SOLID, use abstraction instead
// but in this exercise, it is just trying a try catch

public abstract class TryCatch {

    public static int calculateRatio() {

        int width = 0;
        int length = 40;

        try {

            System.out.println("Calc Route hit");
            int ratio = length / width;
            return ratio;
            // } catch (NullPointerException e) {
            // // catches for null field and arguments
            // System.err.println("NullPointerException: " + e.getMessage());
            // NullPointnerException for RuntimeExceptions
            // also it is automatically thrown

        } catch (ArithmeticException e) {

            System.err.println("ArithmetricException :" + e.getMessage());
            return -1;
        }

    }

    public static void main(String[] args) {
        System.out.println(calculateRatio());
    }
}
