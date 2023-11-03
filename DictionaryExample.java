import java.util.HashMap;
import java.util.Map;

public class DictionaryExample {
    public static void main(String[] args) {
        // Create a dictionary using a HashMap
        Map<String, String> dictionary = new HashMap<>();

        // Add key-value pairs to the dictionary
        dictionary.put("apple", "A fruit with a red or green skin and a sweet taste.");
        dictionary.put("banana", "A long, curved fruit with a yellow skin.");

        // Retrieve definitions from the dictionary
        String appleDefinition = dictionary.get("apple");
        String bananaDefinition = dictionary.get("banana");

        System.out.println("Definition of apple: " + appleDefinition);
        System.out.println("Definition of banana: " + bananaDefinition);
    }
}
