import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner stringUserPrompter = new Scanner(System.in);
        System.out.print("Enter your choice here: ");
        String userInput = stringUserPrompter.nextLine();
        System.out.println("Answer entered: " + userInput);
        stringUserPrompter.close();
    }

}
