import java.util.*;

public class VectorSetElmAt {
    public static void main(String args[]) {
        Vector<String> vector = new Vector<String>();
        // Use add() method to add elements in the vector
        vector.add("Structure");
        vector.add("for");
        vector.add("Data");
        vector.add("10");
        vector.add("20");
        vector.add("30");
        System.out.println("Vector: " + vector);
        vector.setElementAt("Discrete", 2);
        System.out.println("Data replaced with Discrete");
        System.out.println("The new Vector is: " + vector);
    }
}
