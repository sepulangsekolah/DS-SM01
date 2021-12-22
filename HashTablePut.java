import java.util.Hashtable;

class HashTablePut {
    public static void main(String[] arg) {
        // creating a hash table
        Hashtable<Integer, String> h = new Hashtable<Integer, String>();
        // key/value pair
        h.put(3, "Data");
        h.put(2, "Structure");
        h.put(1, "IF-A");
        System.out.println("Entries in table: " + h);
    }
}