import java.util.HashMap;
import java.util.Map;

public class DictionaryExample {
    public static void main(String[] args) {
        // Create a dictionary using a HashMap
        Map<String, String> dictionary = new HashMap<>();

        // HashMap is a class in Map interface of Java
        // Others interfaces: List, set, queue (FIFO), deque (both ends add and remove),
        // Iterator (java.util.Iterator), Iterable (java.lang.Iterable)
        // java.util.Collection allows Collection (like arrayList, HashMap) to be
        // manipulated as a single unit - including add and remove

        // note the java 7 onwards diamond operator. creating new instance of HashMap.

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
