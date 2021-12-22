import java.util.HashMap;

public class HMGet {
    public static void main(String[] args) {
        // Create an empty hash map
        HashMap<String, Integer> map = new HashMap<>();

        // Add elements to the map
        map.put("Dani", 70);
        map.put("Angga", 90);
        map.put("Anggi", 80);

        // Print size and content
        System.out.println("Size of map is: "
                + map.size());
        System.out.println(map);

        // Check if a key is present and if
        // present, print value
        if (map.containsKey("Angga")) {
            Integer a = map.get("Angga");
            System.out.println("Value for key"
                    + " \"Angga\" is: "
                    + a);
        }
    }
}