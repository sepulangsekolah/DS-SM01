import java.util.*;

class HashTableContainsVal {
    public static void main(String[] arg) {
        // Creating a hash table
        Hashtable<String, Integer> marks = new Hashtable<String, Integer>();
        // Enter name/marks pair
        marks.put("Cappucino",345);
        marks.put("Moccacino",245);
        marks.put("Coffee",490);
        marks.put("Chocolatte",365);
        marks.put("Coffeelatte",435);
        // check whether a value exists or not
        System.out.println("Contains value 365?");
        if (marks.containsValue(365))
            System.out.println("Value found in table");
        if (marks.containsValue("Coffee"))
            System.out.println("Value found in table");
    }
}