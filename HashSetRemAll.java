import java.util.*;

public class HashSetRemAll {
    public static void main(String[] argv) throws Exception {
        try {
            // Creating object of Set
            HashSet<Integer> set1 = new HashSet<Integer>();
            // Populating set1
            set1.add(1);
            set1.add(2);
            set1.add(3);
            set1.add(4);
            set1.add(5);
            System.out.println("Set before removeAll() operation : "
                    + set1);
            // Creating another object of Set
            Set<Integer> set2 = new HashSet<Integer>();
            set2.add(1);
            set2.add(2);
            set2.add(3);
            // print set2
            System.out.println("Collection Elements to be removed : "
                    + set2);
            /*  Removing elements from arrset specified in 
                arrset2 using retainAll() method */
            set1.removeAll(set2);
            System.out.println("Set after removeAll() operation : "
                    + set1);
        } catch (NullPointerException e) {
            System.out.println("Exception thrown : " + e);
        }
    }
}