// Deprecated
import java.util.*;

class HashTableContainsValOld {
    public static void main(String[] arg) {
        // creating a hash table
        Hashtable<String, Integer> marks = new Hashtable<String, Integer>();
        // enter name/marks pair
        marks.put("Cappucino", new Integer(345));
        marks.put("Moccacino", new Integer(245));
        marks.put("Coffee", new Integer(490));
        marks.put("Chocolatte", new Integer(365));
        marks.put("Coffeelatte", new Integer(435));
        // check whether a value exists or not
        System.out.println("contains value 365?");
        if (marks.containsValue(365))
            System.out.println("Value found in table");
        if (marks.containsValue("coffee"))
            System.out.println("Value found in table");
    }
}