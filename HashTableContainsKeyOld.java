// Deprecated
import java.util.*;

class HashTableContainsKeyOld {
    public static void main(String[] arg) {
        // Create a hash table
        Hashtable<String, Integer> marks = new Hashtable<String, Integer>();

        // Enter name/marks pair
        marks.put("Cappucino", new Integer(345));
        marks.put("Moccacino", new Integer(245));
        marks.put("Coffee", new Integer(490));
        marks.put("Chocolatte", new Integer(365));
        marks.put("Coffeelatte", new Integer(435));
        System.out.println("Is Coffee in the table?");
        // Check whether a value exists or not
        if (marks.containsKey("Coffee"))
            System.out.println("Key found in table");
        if (marks.containsKey(345))
            System.out.println("Key found in table");
    }
}
