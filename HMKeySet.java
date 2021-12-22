import java.util.*;

public class HMKeySet {
    public static void main(String args[]) {
        // 1 Creation of HashMap
        HashMap<String, String> hm = new HashMap<>();

        // 2 Adding values to HashMap as ("keys", "values")
        hm.put("Language", "Java");
        hm.put("Platform", "Data Structure");
        // 4 keySet() method returns all the keys in HashMap
        Set<String> hmkeys = hm.keySet();
        System.out.println("Initial keys : \n" + hmkeys);

        // 5 values() method return all the values in HashMap
        Collection<String> hmvalues = hm.values();
        System.out.println("Initial values : \n" + hmvalues);

        // Adding new set of key-value
        hm.put("Search", "Java Article");

        // Again using .keySet() and .values() methods
        System.out.println("New Keys : \n" + hmkeys);
        System.out.println("New Values: \n" + hmvalues);
    }
}
