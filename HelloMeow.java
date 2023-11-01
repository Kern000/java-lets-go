/** This class is a public class that prints command line arguments */

public class HelloMeow {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("Hello meow, command line arg exists");
            for (String arg : args) {
                System.out.println(arg);
            }
        } else {
            System.out.println("Hello meow, there is no command line arg");
        }
    }
}

/*
 * public indicates that the main method can be accessed from outside the class.
 * static means the method is associated with the class itself, not with
 * specific instances of the class.
 * void is the return type, indicating that the main method does not return any
 * value.
 * String[] args is the parameter of the main method. It allows you to pass
 * command-line arguments to your program
 * System.out is an object that provides access to the standard output (usually
 * the console or terminal).
 * println is a method of the System.out object, which is used to print a line
 * of text to the standard output.
 */

/* System.in , system.out, system.err basically input, output, error stream */

/*
 * String[] args -> placeholder for args - highlight array of string as
 * arguments
 */
