import java.util.*;

class HMChangeElm {
    public static void main(String args[]) {
        // Initialization of a HashMap
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        // Change Value using put method
        hm.put(1, "Structure");
        hm.put(2, "Data");
        hm.put(3, "Data");
        System.out.println("Initial Map " + hm);
        hm.put(2, "For");
        hm.put(3, "Data");
        System.out.println("Updated Map " + hm);
    }
}