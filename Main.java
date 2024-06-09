import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        List<Item> items = new ArrayList<>();
        items.add(new Item(1, "rower"));
        items.add(new Item(2, "deskorolka"));
        items.add(new Item(3, "laptop"));
        items.add(new Item(4, "telefon"));
        items.add(new Item(5, "komputer"));

        /*zadanie 3*/
        items.add(new Item(6, "playStation"));
        items.add(new Item(7, "monitor"));
        items.add(new Item(8, "klawiarura"));
        items.add(new Item(9, "a"));
        items.add(new Item(10, "b"));
        items.add(new Item(11, "c"));
        items.add(new Item(12, "d"));
        items.add(new Item(13, "e"));
        items.add(new Item(14, "f"));
        items.add(new Item(15, "g"));


        for(int i = 0; i < items.size(); i++) {
            items.get(i).show();
        }

        Map<Integer, String> itemMap = new HashMap<>();
        for(Item item : items) {
            itemMap.put(item.getId(), item.getName());
        }

        for (Map.Entry<Integer, String> entry : itemMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }


        List<Item> firstFiveItems = items.subList(0, 5);
        Set<Item> itemSet = new HashSet<>(firstFiveItems);

        System.out.println("\nElements in HashSet:");
        for (Item item : itemSet) {
            System.out.println(item);
        }
    }

}