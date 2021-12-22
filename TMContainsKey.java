import java.util.TreeMap;

public class TMContainsKey {
    public static void main(String[] args) {
        // Create an empty hash map
        TreeMap<String, Integer> map = new TreeMap<>();
        // Add elements to the map
        map.put("Dani", 70);
        map.put("Eli", 90);
        map.put("Elan", 80);
        // Print size and content
        System.out.println("Size of map is: " + map.size());
        System.out.println(map);
        // Check if a key is present and if
        // present, print value
        if (map.containsKey("Eli")) {
            Integer a = map.get("Eli");
            System.out.println("value for key" + " \"Eli\" is: " + a);
        }
    }
}