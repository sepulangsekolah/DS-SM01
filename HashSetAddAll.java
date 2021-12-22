import java.util.*;

public class HashSetAddAll {
    public static void main(String args[]) {
        // Creating an empty Set
        HashSet<String> st1 = new HashSet<String>();
        // Use add() method to add elements into the Set
        st1.add("0");
        st1.add("8");
        st1.add("1");
        st1.add("2");
        st1.add("2");
        st1.add("3");
        // Displaying the Set
        System.out.println("Initial Set: " + st1);
        // An array collection is created
        ArrayList<String> collect = new ArrayList<String>();
        collect.add("2");
        collect.add("6");
        collect.add("9");
        collect.add("x");
        collect.add("x");
        collect.add("x");
        // Using addAll() method to Append
        st1.addAll(collect);
        // Displaying the final Set
        System.out.println("Final Set: " + st1);
    }
}