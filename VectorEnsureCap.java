import java.util.*;

public class VectorEnsureCap {
    public static void main(String[] argv)
            throws Exception {
        try {
            Vector<Integer> vector = new Vector<Integer>();
            // Adding element to vector
            vector.add(10);
            vector.add(20);
            vector.add(30);
            vector.add(40);
            System.out.println("Vector: " + vector);
            // Ensure that the Vector can hold upto 5000 elements using ensureCapacity() method
            vector.ensureCapacity(5000);
            // Print
            System.out.println("Vector can now"  + " surely store up to" + " 5000 elements.");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}