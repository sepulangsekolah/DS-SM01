import java.util.*;

public class HSSort {
    public static void main(String args[]) {
        // Creating a HashSet
        HashSet<String> set = new HashSet<String>();
        // Adding elements into HashSet using add()
        set.add("Didi");
        set.add("Redi");
        set.add("Ali");
        set.add("Fredi");
        System.out.println("Original HashSet: "
                + set);
        // Sorting HashSet using List
        List<String> list = new ArrayList<String>(set);
        Collections.sort(list);
        // Print the sorted elements of the HashSet
        System.out.println("HashSet elements "
                + "in sorted order "
                + "using List: "
                + list);
    }
}