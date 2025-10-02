import java.util.ArrayList;
import java.util.HashMap;

public class CollectionExample {
    public static void main(String[] args) {

        // ArrayList
        ArrayList<String> names = new ArrayList<>();
        names.add("Affan");
        names.add("Rifai");
        names.add("Asep");

        System.out.println("\nDaftar nama:");
        for (String name : names) {
            System.out.println(name);
        }

        // HashMap
        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("Affan", 90);
        scores.put("Rifai", 85);
        scores.put("Asep", 78);

        // System.out.println("\nNilai Asep: " + scores.get(names.get(2)));
        System.out.println("\nnlai (hashmap):");
        for (String key : scores.keySet()) {
            System.out.println(key + ": " + scores.get(key));
        }

    }
}
