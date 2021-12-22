import java.util.*;

class TMRem {
    public static void main(String args[]) {
        // Initialization of a TreeMap using Generics
        TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
        // Inserting the Elements
        tm.put(3, "Data");
        tm.put(2, "For");
        tm.put(1, "Structure");
        tm.put(4, "IF-A");
        System.out.println(tm);
        tm.remove(4);
        System.out.println(tm);
    }
}