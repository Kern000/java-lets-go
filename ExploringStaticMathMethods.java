public class ExploringStaticMathMethods {
    public static void main(String[] args) {
        int smallestNumber = Math.min(5, 10);
        System.out.println(smallestNumber);

        System.out.println(Math.abs(-5));
        System.out.println(Math.abs(-5.0));
        System.out.println(Math.pow(2, 3));
        System.out.println(Math.sqrt(16));
        System.out.println(Math.random() * 6 + 1);

        // this prints between 10 to 20;
        System.out.println(Math.random() * 10 + 10);
    }
}
