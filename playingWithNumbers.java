public class playingWithNumbers {
    public static void main(String[] args) {
        int numPicturesOfCats = 50;
        numPicturesOfCats++;
        System.out.println(numPicturesOfCats);

        numPicturesOfCats--;
        System.out.println("new number = " + numPicturesOfCats);

        int newNumOfCats = numPicturesOfCats + 2;
        System.out.println("new cats num = " + newNumOfCats);

        int unevenDivide = newNumOfCats / 3; // round down int
        System.out.println(unevenDivide);

        newNumOfCats += 8;
        System.out.println("after adding 8 = " + newNumOfCats);

        double remainder = newNumOfCats %= 8;
        System.out.println(remainder);
    }
}
