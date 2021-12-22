import java.util.*;

class HashTablePutAll {
    public static void main(String[] arg) {
        // creating a hash table
        Hashtable<Integer, String> h = new Hashtable<Integer, String>();
        Hashtable<Integer, String> h1 = new Hashtable<Integer, String>();
        h.put(3, "Data");
        h.put(2, "Structure");
        h.put(1, "IF-AZ");
        // copy all element of h into h1
        h1.putAll(h);
        // checking h1
        System.out.println("Values in h1: " + h1);
    }
}