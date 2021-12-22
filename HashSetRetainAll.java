import java.util.*;

public class HashSetRetainAll {
    public static void main(String[] argv) throws Exception {
        try {
            // Creating object of Set
            HashSet<Integer> arrset1 = new HashSet<Integer>();
            // Populating arrset1
            arrset1.add(1);
            arrset1.add(2);
            arrset1.add(3);
            arrset1.add(4);
            arrset1.add(5);
            System.out.println("Set before retainAll() operation : "
                    + arrset1);
            // Creating another object of Set
            Set<Integer> arrset2 = new HashSet<Integer>();
            arrset2.add(1);
            arrset2.add(2);
            arrset2.add(3);
            // Print arrset2
            System.out.println("Collection Elements to be retained : "
                    + arrset2);
            /*  Removing elements from arrset specified in 
                arrset2 using retainAll() method */
            arrset1.retainAll(arrset2);
            System.out.println("Set after retainAll() operation : "
                    + arrset1);
        } catch (NullPointerException e) {
            System.out.println("Exception thrown : " + e);
        }
    }
}