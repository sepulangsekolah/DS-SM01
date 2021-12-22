import java.util.*;

class TMGetKeyVal {
    public static void main(String args[]) {
        TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
        // Inserting the Elements
        tm.put(3, "Data");
        tm.put(2, "For");
        tm.put(1, "Structure");
        System.out.println("Key Value");
        for (Map.Entry mapElement : tm.entrySet()) {
            int key = (int) mapElement.getKey();
            // Finding the value
            String value = (String) mapElement.getValue();
            System.out.println(key + " : " + value);
        }
    }
}