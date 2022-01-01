import java.util.*;

public class VectorSet {
    public static void main(String args[]) {
        // Creating an empty Vector
        Vector<Integer> vector = new Vector<Integer>();
        // Add elements in the vector
        vector.add(12);
        vector.add(23);
        vector.add(22);
        vector.add(10);
        vector.add(20);
        // Displaying the Vector
        System.out.println("Vector: " + vector);
        // Replace 12 with 21
        System.out.println("The Object that is replaced is : " + vector.set(0, 21));
        // Replace 20 with 50
        System.out.println("The Object that is replaced is : " + vector.set(4, 50));
        System.out.println("The new Vector is :" + vector);
    }
}