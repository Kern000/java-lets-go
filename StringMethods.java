public class StringMethods {

    public static void main(String[] args) {

        String str = "Hello there";
        String str1 = "meow";
        String str2 = "mew";

        System.out.println("length of str here: " + str.length());

        System.out.println("sliced string here: " + str.substring(4, 10));
        System.out.println("Converted to upper case: " + str.toUpperCase());

        System.out.println(str1.concat(str2));

        // equalsIgnoreCase()
        String password = "haveagloriousday";
        System.out.println(password.equals("hellothere"));

        String password1 = "haveagloriousday";
        System.out.println(password1.equalsIgnoreCase("HaveAGloriousDay"));

        // index of (find beginning of string pattern sequence)
        String code = ".... .. / .. .----. -- / ... --- -. -. -.-- / .- -. -.. / .. / .-.. .. -.- . / - --- / . .- - / .-. .- -- . -.";

        System.out.println(code.indexOf(". .- -"));

        System.out.println(code.charAt(0));
    }
}
