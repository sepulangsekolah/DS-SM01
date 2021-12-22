import java.util.*;

class HMPut {
    public static void main(String args[]) {
        // No need to mention the
        // Generic type twice
        HashMap<Integer, String> hm1 = new HashMap<>();
        // Initialization of a HashMap
        // using Generics
        HashMap<Integer, String> hm2 = new HashMap<Integer, String>();
        // Add Elements using put method
        hm1.put(1, "Satu");
        hm1.put(2, "Dua");
        hm1.put(3, "Tiga");
        hm2.put(4, "Empat");
        hm2.put(5, "Lima");
        hm2.put(6, "Enam");
        System.out.println("Mapping of HashMap hm1 are : \n"
                + hm1);
        System.out.println("Mapping of HashMap hm2 are : \n"
                + hm2);
    }
}