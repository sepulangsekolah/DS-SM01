import java.util.*;

public class HMRemIter {
    public static void main(String args[]) {
        // Creation of HashMap
        HashMap<String, String> hm = new HashMap<>();

        // Adding values to HashMap as ("keys", "values")
        hm.put("Language", "Java");
        hm.put("Platform", "hm For DS-IF-AZ");
        hm.put("Code", "HashMap");

        // .entrySet() returns all the keys with their values present in Hashmap
        Set<Map.Entry<String, String>> mappinghm = hm.entrySet();
        System.out.println("Set of Keys and Values : \n" + mappinghm);

        // Creating an iterator
        System.out.println("Use of Iterator to remove the sets.");
        Iterator<Map.Entry<String, String>> iterator = hm.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            // Removing a set one by one using iterator
            iterator.remove(); // right way to remove entries from Map,
            // avoids ConcurrentModificationException
            System.out.println("Set of Keys and Values : \n" + mappinghm);

        }
    }
}