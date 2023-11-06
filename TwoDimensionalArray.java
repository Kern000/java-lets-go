import java.util.Arrays;

public class TwoDimensionalArray {

    public static void main(String[] args) {

        int[][] intArray1 = new int[4][4];
        double[][] doubleArray1 = { { 1.1, 1.2, 1.3 }, { 2.1, 2.2, 2.3 } };
        String[][] stringArray1 = new String[][] { { "hello", "there" }, { "meow", "me" } };
        int[][] intArray2 = new int[3][4];

        System.out.println(intArray1);
        // will get memory address, need to iterate to print out
        System.out.println(Arrays.deepToString(intArray1));

        // accessing 2d Array data
        int storedData = intArray2[0][3];
        System.out.println(storedData);

        storedData = intArray2[0][3] = 3;
        System.out.println(storedData);

        int[][] intMatrix = {
                { 1, 1, 1, 1, 1 },
                { 2, 4, 6, 8, 0 },
                { 9, 8, 7, 6, 5 }
        };

        int[][] subMatrix = new int[2][2];

        subMatrix[0][0] = intMatrix[0][0] * 5;
        subMatrix[0][1] = intMatrix[0][1] * 5;
        subMatrix[1][0] = intMatrix[1][0] * 5;
        subMatrix[1][1] = intMatrix[1][1] * 5;

        System.out.println(Arrays.deepToString(subMatrix));

    }

}