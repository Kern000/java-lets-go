public class fixingDeclarationError {
    public static void main(String[] args) {
        int year = 2001;
        String title = "Shrek";
        char genre = 'C';
        double runtime = 1.58;
        boolean isPG = true;
        int $munee = 5000;
        char _weirdSingleCharVariable = '!';

        System.out.println(
                "Year = " + year + "\ntitle = " + title + "\ngenre = " + genre + "\nruntime = " + runtime + "\nisPG = "
                        + isPG + "\nmunee = " + $munee + "\nsingle char variable = " + _weirdSingleCharVariable);
    }
}