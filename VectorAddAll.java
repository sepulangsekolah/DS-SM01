import java.util.*;
import java.util.ArrayList;

public class VectorAddAll {
    public static void main(String args[]) {
        Vector<String> vt = new Vector<String>();
        // Use add() method to add elements in the Vector
        vt.add("Structure");
        vt.add("for");
        vt.add("Data");
        vt.add("10");
        vt.add("20");
        // A collection is created
        Collection<String> c = new ArrayList<String>();
        c.add("Computer");
        c.add("Course");
        c.add("for");
        c.add("IF-A");
        // Displaying the Vector
        System.out.println("The Vector is: \n" + vt);
        // Appending the collection to the vector
        vt.addAll(c);
        // Clearing the vector using clear() and displaying
        System.out.println("The new vector is: \n" + vt);
    }
}