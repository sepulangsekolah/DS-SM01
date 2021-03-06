import java.util.*;
import java.util.concurrent.*;

public class TreeMapImpl5 {
    // Function to show
    // TreeMap(SortedMap) constructor example
    static void TMConstructor() {
        // Creating a SortedMap
        SortedMap<Integer, String> sorted_map = new ConcurrentSkipListMap<Integer, String>();
        // Mapping string values to int keys
        sorted_map.put(10, "Structure");
        sorted_map.put(15, "4");
        sorted_map.put(20, "Data");
        sorted_map.put(25, "IF");
        sorted_map.put(30, "A");
        // Creating the TreeMap using the SortedMap
        TreeMap<Integer, String> tree_map = new TreeMap<Integer, String>(sorted_map);
        // Displaying the TreeMap
        System.out.println("TreeMap: " + tree_map);
    }

    public static void main(String[] args) {
        System.out.println("TreeMap using " + "TreeMap(Map)" + " constructor:");
        TMConstructor();
    }
}