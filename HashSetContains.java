import java.util.*;

public class HashSetContains {
    public static void main(String args[]) {
        // Creating an empty Set
        HashSet<String> set = new HashSet<String>();
        // Using add() method to add elements into the Set
        String s0 = "0", s1 = "1", s2 = "2", s3 = "3", s4 = "4", s6 = "6",
                s8 = "8", s9 = "9";
        set.add(s0);
        set.add(s8);
        set.add(s1);
        set.add(s1);
        set.add(s1);
        set.add(s2);
        set.add(s6);
        set.add(s9);
        set.add("xxx");
        // Displaying the Set
        System.out.println("Set: " + set);
        // Check for "Geeks" in the set
        System.out.println("Does the Set contains " + s2 + ":"
                + set.contains(s2));
        // Check for "4" in the set
        System.out.println("Does the Set contains " + s4 + ":"
                + set.contains(s4));
        // Check if the Set contains "No"
        System.out.println("Does the Set contains " + s6 + ":"
                + set.contains(s6));
    }
}