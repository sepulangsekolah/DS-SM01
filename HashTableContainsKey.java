import java.util.*;

class HashTableContainsKey {
    public static void main(String[] arg) {
        // Create a hash table
        Hashtable<String, Integer> marks = new Hashtable<String, Integer>();

        // Enter name/marks pair
        marks.put("Cappucino",345);
        marks.put("Moccacino",245);
        marks.put("Coffee",490);
        marks.put("Chocolatte",365);
        marks.put("Coffeelatte",435);
        System.out.println("Is Coffee in the table?");
        // Check whether a value exists or not
        if (marks.containsKey("Coffee"))
            System.out.println("Key found in table");
        if (marks.containsKey(345))
            System.out.println("Key found in table");
    }
}
