import java.util.Arrays;

public class ArrayExample {

    String[] topics = { "Opinion", "Tech", "Politics", "Health" };
    int[] views = { 0, 0, 0, 0 };
    String[] favoriteArticles;

    public ArrayExample() {
        favoriteArticles = new String[10];
    }
    // defined as class variable first then initialize one as empty Array with
    // default null values;

    public static void main(String[] args) {
        int[] numbersSequence = { 3, 6, 9, 12, 15, 20 };

        String[] stringSequence = new String[5];
        // empty Arrays need to initialie with fixed size.
        // string array default value is null;
        stringSequence[4] = "Meow";

        int[] intSequence = new int[4];
        // int array default for empty element is 0;
        intSequence[1] = 4;

        final int[] stuckSequence = { 1, 2, 3, 4 };

        // for boolean array is false,
        // for "reference" array aka reference to a class object - the default is null
        // since String is class in java, it will be null default initialized in array
        // for double is 0.0;

        String numbersSequenceConvertedToString = Arrays.toString(numbersSequence);
        System.out.println(numbersSequenceConvertedToString);

        System.out.println(Arrays.toString(stringSequence));
        System.out.println(Arrays.toString(intSequence));
        System.out.println(Arrays.toString(stuckSequence));
        System.out.println(stuckSequence.length);

        // This two lines confirm that the default values are null and 0 respectively.
    }
}