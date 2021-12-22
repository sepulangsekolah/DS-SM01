import java.util.*;

class HMInitCapacity {
    public static void main(String args[]) {
        // No need to mention the
        // using Generics
        Map<Integer, String> hm1 = new HashMap<>(1);
        HashMap<Integer, String> hm2 = new HashMap<Integer, String>(2);
        // Add Elements using put method
        hm1.put(1, "Satu");
        hm1.put(2, "Dua");
        hm1.put(3, "Tiga");
        hm2.put(4, "Empat");
        hm2.put(5, "Lima");
        hm2.put(6, "Enam");
        System.out.println("Mapping of HashMap hm1 are : \n" + hm1);
        System.out.println("Mapping of HashMap hm2 are : \n" + hm2);
    }
}