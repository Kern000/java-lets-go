import java.util.ArrayList;

public class IterationOverArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> secretCode = new ArrayList<>();

        secretCode.add(1);
        secretCode.add(2);
        secretCode.add(3);
        secretCode.add(4);

        // js .map
        for (int i = 0; i < secretCode.size(); i++) {
            int num = secretCode.get(i);
            secretCode.set(i, num + 1);
        }

        System.out.println(secretCode);
        // iterating an ArrayList and transforming it - like .map of javascript

        ArrayList<Double> expenses = new ArrayList<Double>();
        expenses.add(44.46);
        expenses.add(50.84);
        expenses.add(13.66);
        expenses.add(813.371);
        double total = 0;

        // Iterate over expenses
        for (int i = 0; i < expenses.size(); i++) {
            double numToAdd = expenses.get(i);
            total += numToAdd;
        }
        System.out.println(total);

        // Js filter
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                continue;
            }
            System.out.println(numbers[i]);
        }

    }
}