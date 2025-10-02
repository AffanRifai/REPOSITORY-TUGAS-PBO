import java.util.ArrayList;
import java.util.HashMap;

public class CollectionExample {
    public static void main(String[] args) {
        // Array
        String[] fruits = {"Apple", "Banana", "Orange"};
        System.out.println("Array:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // ArrayList
        ArrayList<String> names = new ArrayList<>();
        names.add("Affan");
        names.add("Rifai");
        names.add("Budi");

        System.out.println("\nArrayList:");
        for (String name : names) {
            System.out.println(name);
        }

        // HashMap
        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("Affan", 90);
        scores.put("Rifai", 85);
        scores.put("Budi", 78);

        System.out.println("\nHashMap:");
        for (String key : scores.keySet()) {
            System.out.println(key + " : " + scores.get(key));
        }
    }
}
