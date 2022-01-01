import java.util.*;

public class VectorIter {
    public static void main(String args[]) {
        Vector<String> v = new Vector<>();
        // Add elements using add() method
        v.add("Structure");
        v.add("Data");
        v.add(1, "for");

        for (int i = 0; i < v.size(); i++) {
            System.out.print(v.get(i) + " ");
        }
        System.out.println();

        for (String str : v)
            System.out.print(str + " ");
        System.out.println();
    }
}