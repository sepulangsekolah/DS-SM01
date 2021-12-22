import java.util.*;

class TMUpdt {
    public static void main(String args[]) {
        TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
        // Inserting the Elements
        tm.put(3, "Data");
        tm.put(2, "For");
        tm.put(1, "Structure");
        System.out.println(tm);
        tm.put(2, "Base");
        System.out.println(tm);
    }
}