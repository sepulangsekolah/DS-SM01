import java.util.*;

public class TreeMapImpl2 {
    static void TMConstructor() {
        // Creating an empty TreeMap
        TreeMap<Integer, String> tree_map = new TreeMap<Integer, String>();
        // Mapping string values to int keys
        tree_map.put(10, "Structure");
        tree_map.put(15, "4");
        tree_map.put(20, "Data");
        tree_map.put(25, "IF");
        tree_map.put(30, "A");
        // Displaying the TreeMap
        System.out.println("TreeMap: " + tree_map);
    }

    // Driver code
    public static void main(String[] args) {
        System.out.println("TreeMap using " + "TreeMap() constructor:");
        TMConstructor();
    }
}