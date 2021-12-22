import java.util.*;

public class TreeMapImpl4 {
    static void TMConstructor() {
        // Creating a Map
        Map<Integer, String> hash_map = new HashMap<Integer, String>();
        // Mapping string values to int keys
        hash_map.put(10, "Structure");
        hash_map.put(15, "4");
        hash_map.put(20, "Data");
        hash_map.put(25, "IF");
        hash_map.put(30, "A");
        // Creating the TreeMap using the Map
        TreeMap<Integer, String> tree_map = new TreeMap<Integer, String>(hash_map);
        // Displaying the TreeMap
        System.out.println("TreeMap: " + tree_map);
    }

    public static void main(String[] args) {
        System.out.println("TreeMap using " + "TreeMap(Map)" + " constructor:");
        TMConstructor();
    }
}