import java.util.*;

class HashSetAdd {
    public static void main(String[] args) {
        // Instantiate an object
        // of HashSet
        HashSet<String> hs = new HashSet<String>();
        // Elements are added using add() method
        String s0 = "0", s1 = "1", s2 = "2", s3 = "3", s4 = "4", s5 = "5", s6 = "6",
                s8 = "8", s9 = "9";
        hs.add(s0);
        hs.add(s8);
        hs.add(s1);
        hs.add(s2);
        hs.add(s2);
        hs.add(s3);
        hs.add(s2);
        hs.add(s6);
        hs.add(s9);
        hs.add("xxxx");
        // Print the contents on the console
        System.out.println("HashSet elements : " + hs);
    }
}