import java.util.*;

class HMInitMap {// constructor(Map)
    public static void main(String args[]) {
        // No need to mention the
        // Generic type twice
        Map<Integer, String> hm1 = new HashMap<>();
        // Add Elements using put method
        hm1.put(1, "Satu");
        hm1.put(2, "Dua");
        hm1.put(3, "Tiga");
        // Initialization of a HashMap
        // using Generics
        HashMap<Integer, String> hm2 = new HashMap<Integer, String>(hm1);
        System.out.println("Mapping of HashMap hm1 are : \n"
                + hm1);
        System.out.println("Mapping of HashMap hm2 are : \n"
                + hm2);
    }
}
