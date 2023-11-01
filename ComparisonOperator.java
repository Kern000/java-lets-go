public class ComparisonOperator {
    public static void main(String[] args) {

        int numberOfSongsInAlbumA = 3;
        int numberOfSongsInAlbumB = 3;
        int albumLengthFirst = 30;
        int albumLengthSecond = 20;

        boolean sameNumberOfSongs = numberOfSongsInAlbumA == numberOfSongsInAlbumB;
        boolean differentLengthOfAlbum = albumLengthFirst != albumLengthSecond;

        System.out.println("same number of songs? " + sameNumberOfSongs);
        System.out.println("different album length? " + differentLengthOfAlbum);

        String lineOne = "Hello There"; // string is object in Java
        String lineTwo = "Obiwan";
        System.out.println(lineOne.equals(lineTwo));

        // playing with const unchangeable variable
        final double pi = 3.14;
        System.out.println("Final is here " + pi);
    }
}