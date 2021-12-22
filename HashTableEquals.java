import java.util.*;

class HashTableEquals {
    public static void main(String[] arg) {
        // creating a hash table
        Hashtable<Integer, String> h = new Hashtable<Integer, String>();
        Hashtable<Integer, String> h1 = new Hashtable<Integer, String>();
        h.put(3, "Data");
        h.put(2, "Structure");
        h.put(1, "IF-A");
        h1.put(3, "Data");
        h1.put(2, "Structure");
        h1.put(1, "IF-A");
        // Checking whether both hash tables are equal or not
        System.out.println("Hash table 1:" + h);
        System.out.println("Hash table 2:" + h1);
        if (h.equals(h1))
            System.out.println("Both are equal");
    }
}