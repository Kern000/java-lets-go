import java.util.ArrayList;

public class RemoveItemsFromArrayList {

    public static ArrayList<String> removeItem(ArrayList<String> container) {

        for (int i = 0; i < container.size(); i++) {
            if (container.get(i) == "meow") {
                container.remove(i);
                i--;
            }
        }
        return container;
    }

    public static void main(String[] args) {
        ArrayList<String> Container = new ArrayList<String>();
        Container.add("coffee");
        Container.add("meow");
        Container.add("tea");
        Container.add("grass");
        Container.add("chick");
        Container = removeItem(Container);
        System.out.println(Container);

    }

}