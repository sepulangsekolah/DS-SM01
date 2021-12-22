import java.util.*;

class HashTableIsEmpty {
    public static void main(String[] arg) {
        // Creating a hash table
        Hashtable<Integer, String> h = new Hashtable<Integer, String>();
        h.put(3, "Data");
        h.put(2, "Structure");
        h.put(1, "IF-A");
        if (h.isEmpty())
            System.out.println("Yes, hash table is empty");
        else
            System.out.println("No, hash table isn't empty");
        // clear hash table h
        h.clear();
        // checking whether hash table h is empty or not
        if (h.isEmpty())
            System.out.println("Yes, hash table is empty");
        else
            System.out.println("No, hash table isn't empty");
    }
}