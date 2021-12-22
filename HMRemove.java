import java.util.*;

class HMRemove {
    public static void main(String args[]) {
        // Initialization
        Map<Integer, String> hm = new HashMap<Integer, String>();
        // Add elements using put method
        hm.put(1, "Structure");
        hm.put(2, "For");
        hm.put(3, "Data");
        hm.put(4, "IF-A");
        // Initial HashMap
        System.out.println("Mapping of HashMap are : \n" + hm);
        // Remove element with a key using remove method
        hm.remove(4);
        // Final HashMap
        System.out.println("Mapping after removal are : \n" + hm);
    }
}