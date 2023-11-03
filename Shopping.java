import java.util.ArrayList;

public class Shopping {

    // ArrayList can store object references as elements;
    // can also add or remove elements;
    public static void main(String[] args) {
        ArrayList<String> groceryItems = new ArrayList<>();

        ArrayList<Integer> groceryItemQuantity = new ArrayList<>();
        ArrayList<Double> groceryPrice;

        groceryPrice = new ArrayList<>();

        // <> contains generics - can't use primitive data types;

        // appending
        groceryPrice.add(10.00); // basically an append
        groceryPrice.add(15.00);
        groceryPrice.add(25.00);

        groceryItemQuantity.add(5);
        groceryItemQuantity.add(10);
        groceryItemQuantity.add(15);

        // inserting
        groceryItems.add(0, "Coffee");
        groceryItems.add(0, "tea");
        groceryItems.add(1, "dog food");

        System.out.println("Grocery Items here: " + groceryItems);
        System.out.println("Grocery Item Quantity here: " + groceryItemQuantity.toString());
        System.out.println("Grocery Item Price here: " + groceryPrice.toString());
        System.out.println("There are total " + groceryItems.size() + " items here.");

        System.out.println("The 2nd grocery item is " + groceryItems.get(1) + '.');

        groceryItems.set(2, "High quality tea");
        System.out.println("New grocery list: " + groceryItems.toString());

        groceryItems.add("wrong entry");
        int targetIndex = groceryItems.indexOf("wrong entry");
        groceryItems.remove(targetIndex);
        System.out.println("This is after removing wrong entry: " + groceryItems.toString());

    }
}