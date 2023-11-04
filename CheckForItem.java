import java.util.ArrayList;

public class CheckForItem {

    public static boolean checkForItem(String[] lst) {
        for (int i = 0; i < lst.length; i++) {
            System.out.println(lst[i]);
            if (lst[i] == "vegan rice") {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // searching an array, though can just use indexOf();
        String[] food = { "chicken rice", "duck rice", "vegan rice" };
        System.out.println(checkForItem(food));

        // playing with numbers
        for (int i = 0; i < 100; i++) {
            // Add your code below
            if (i % 5 != 0) {
                continue;
            }
            System.out.println(i);
        }

        // use forEach to print and test copy
        for (String foodItem : food) {
            System.out.println(foodItem);
        }

        // finding most expensive

        ArrayList<Double> expenses = new ArrayList<Double>();
        expenses.add(771.77);
        expenses.add(555.55);
        expenses.add(666.66);
        expenses.add(777.78);

        double mostExpensive = 0;

        for (double expense : expenses) {
            if (expense > mostExpensive) {
                mostExpensive = expense;
            }
        }

        System.out.println(mostExpensive);
    }
}
