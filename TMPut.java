import java.util.*;

class TMPut {
    public static void main(String args[]) {
        // Default Initialization of a
        // TreeMap
        TreeMap<Integer, String> tm1 = new TreeMap<>();
        // Initialization of a TreeMap
        // using Generics
        TreeMap<Integer, String> tm2 = new TreeMap<Integer, String>();
        // Inserting the Elements
        tm1.put(3, "Structure");
        tm1.put(2, "For");
        tm1.put(1, "Data");
        tm2.put(3, "Structure");
        tm2.put(2, "For");
        tm2.put(1, "Data");
        System.out.println(tm1);
        System.out.println(tm2);
        System.out.println("Equals?:" + tm2.equals(tm1));
    }
}