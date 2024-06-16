import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Item> itemList;
        itemList = new ArrayList<>();
        itemList.add(new Item(1, "Przedmiot 1"));
        itemList.add(new Item(2, "Przedmiot 2"));
        itemList.add(new Item(3, "Przedmiot 3"));
        itemList.add(new Item(4, "Przedmiot 4"));
        itemList.add(new Item(5, "Przedmiot 5"));

        for (Item item : itemList) {
            item.show();
        }

        // umieszczenie obiektów w hashmap za pomocą for-each
        HashMap<Integer, String> itemMap = new HashMap<>();
        for (Item item : itemList) {
            itemMap.put(item.getId(), item.getName());
        }

        for (Map.Entry<Integer, String> entry : itemMap.entrySet()) {
            System.out.println("Identyfikator: " + entry.getKey() + ", Nazwa: " + entry.getValue());
        }

        //zad 2.
        ArrayList<Item> itemList2 = new ArrayList<>();
        for (int i = 6; i <= 15; i++) {
            itemList2.add(new Item(i, "Przedmiot " + i));
        }

        List<Item> subList = itemList2.subList(0, 5);
        HashSet<Item> itemSet = new HashSet<>(subList);

        System.out.println();
        System.out.println("Pięć pierwszych elementów w HashSet:");
        for (Item item : itemSet) {
            System.out.println("Identyfikator: " + item.getId() + ", Nazwa: " + item.getName());
        }
    }
}